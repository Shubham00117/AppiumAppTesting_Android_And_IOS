package basics;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class APIDmostTest1 {
	public static void main(String[] args) throws MalformedURLException {
		 
			UiAutomator2Options options = new UiAutomator2Options();
	        
	        options.setDeviceName("13802783200005R");
	        options.setAutomationName("UiAutomator2");
	        
	        // 1. IMPORTANT: Don't reinstall the app (prevent "SessionNotCreated" error)
	        options.setNoReset(true);

	        // 2. IMPORTANT: Use the Google package (which we know exists from Error #1)
	        options.setAppPackage("io.appium.android.apis");
	        options.setAppActivity("io.appium.android.apis.ApiDemos");

	        URL url = URI.create("http://127.0.0.1:4723/").toURL();

	        AndroidDriver driver = new AndroidDriver(url, options);
	        
	        driver.findElement(AppiumBy.accessibilityId("Views")).click();
	        driver.findElement(AppiumBy.accessibilityId("Buttons")).click();
	        driver.findElement(AppiumBy.accessibilityId("Toggle")).click();
	       String toggle= driver.findElement(AppiumBy.accessibilityId("Toggle")).getText();
	       Assert.assertEquals(toggle, "ON");
	        
	}

}
