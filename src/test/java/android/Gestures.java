package android;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends Base {
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = driverSetup();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		TouchAction tAction = new TouchAction(driver);
		tAction.tap(driver.findElementByXPath("(//android.widget.TextView)[10]")).perform();
		
		driver.findElementByXPath("(//android.widget.TextView)[2]").click();
		
		//driver.findElementByXPath("(//android.widget.TextView)[2]").click();
		tAction.longPress(driver.findElementByXPath("(//android.widget.TextView)[2]"), Duration.ofSeconds(3)).perform();
		
		System.out.println(driver.findElementById("android:id/alertTitle").getText());
						
	}

}
