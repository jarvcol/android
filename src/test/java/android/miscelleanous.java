package android;

import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class miscelleanous extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = driverSetup();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		TouchAction tAction = new TouchAction(driver);

		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		//views - Native , Hybrid, Webview
		System.out.println(driver.getOrientation());
		System.out.println(driver.isLocked());
		//  driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.pressKeyCode(AndroidKeyCode.BACK);

	}

}
