package Testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
    ChromeDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    @BeforeMethod(alwaysRun = true)
    public void bformths() {
        driver.get("https://keralaproperty.in/member/login/");
    }

    @Test
    public void test() throws InterruptedException, IOException {
        FileInputStream f = new FileInputStream("C:\\Users\\PC\\Desktop\\Book1.xlsx");
        XSSFWorkbook xs = new XSSFWorkbook(f);
        XSSFSheet sh = xs.getSheet("Sheet1");
        int r = sh.getLastRowNum();

        for (int i = 1; i <= r; i++) {
            String email = sh.getRow(i).getCell(0).getStringCellValue();
            String password = sh.getRow(i).getCell(1).getStringCellValue();
            driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys(email);
            driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys(password);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
            driver.navigate().refresh();
        }

//        xs.close(); // Close the workbook
//        f.close(); // Close the FileInputStream
    }
}
