package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.Console;
import java.net.URI;
import java.net.URL;

public class Calculator {

    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        
        // 1. IMPORTANT: Don't reinstall the app (prevent "SessionNotCreated" error)
        options.setNoReset(true);

        // 2. IMPORTANT: Use the Google package (which we know exists from Error #1)
        options.setAppPackage("com.google.android.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");

        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        AndroidDriver driver = new AndroidDriver(url, options);

        // 3. Update Element Locators for Google Calculator
        // Note: These IDs are standard for the Google Calculator.
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_2")).click();
        driver.findElement(AppiumBy.accessibilityId("plus")).click();
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        String result = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final")).getText();
        if(result.equals("7"))
        {
        	System.out.println("Test is Passed");
        }
        else
        {
			System.out.println("Test is Faild");
		}

        driver.quit();
    }
}