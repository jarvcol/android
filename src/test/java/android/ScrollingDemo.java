package android;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingDemo extends Base{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = driverSetup();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		TouchAction tAction = new TouchAction(driver);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));");
			
	}

}
