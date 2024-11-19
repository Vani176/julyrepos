package junitpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class responsecode {
String link="https//www.google.com";
@Test
public void test() throws URISyntaxException, MalformedURLException, IOException 
{
	URI ob=new URI(link);
HttpURLConnection con =	(HttpURLConnection)ob.toURL().openConnection();
int code=con.getResponseCode();
System.out.println("response code is "+code);
	
}
}
