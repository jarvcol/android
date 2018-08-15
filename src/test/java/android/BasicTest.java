package android;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasicTest extends Base{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = driverSetup();
		
		//tagname[@attribute='value1'] - tagname = class
		
		 driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	     driver.findElementByXPath("(//android.widget.TextView)[4]").click();
	     driver.findElementById("android:id/checkbox").click();
	     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	     driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
	     driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		/*
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("familiarojasvalencia");
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();	
		*/
	}

}
