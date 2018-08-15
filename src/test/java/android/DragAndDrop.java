package android;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDrop extends Base{
	
public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = driverSetup();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		TouchAction tAction = new TouchAction(driver);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Drag and Drop']")));
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		tAction.longPress(driver.findElementById("io.appium.android.apis:id/drag_dot_1")).
		moveTo(driver.findElementById("io.appium.android.apis:id/drag_dot_2")).release().perform();
	}

}
