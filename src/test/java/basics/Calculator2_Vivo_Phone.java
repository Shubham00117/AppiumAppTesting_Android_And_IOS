package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URI;
import java.net.URL;

public class Calculator2_Vivo_Phone {

    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        
        options.setDeviceName("13802783200005R");
        options.setAutomationName("UiAutomator2");
        
        // 1. IMPORTANT: Don't reinstall the app (prevent "SessionNotCreated" error)
        options.setNoReset(true);

        // 2. IMPORTANT: Use the Google package (which we know exists from Error #1)
        options.setAppPackage("com.vivo.calculator");
        options.setAppActivity("com.vivo.calculator.Calculator");

        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        AndroidDriver driver = new AndroidDriver(url, options);

        // 3. Update Element Locators for Google Calculator
        // Note: These IDs are standard for the Google Calculator.
        driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_2")).click();
        driver.findElement(AppiumBy.accessibilityId("Plus")).click();
        driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("=")).click();

        String result = driver.findElement(AppiumBy.id("com.vivo.calculator:id/formula")).getText();
        System.out.println("Result is: " + result);

        driver.quit();
    }
}