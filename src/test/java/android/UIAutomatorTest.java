package android;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = driverSetup();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//I do not have the required libraries for this
		
		
	}
}
