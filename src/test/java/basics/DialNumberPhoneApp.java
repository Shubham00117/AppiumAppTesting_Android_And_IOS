package basics;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DialNumberPhoneApp {

    // FIX 1: Correct Main Method Signature (public static void main(String[] args))
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        
        UiAutomator2Options options = new UiAutomator2Options();
        
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        
        // FIX 2: Change App Package to the Phone/Dialer App
        // Note: These values are for the stock Google Dialer. 
        // If you are using a Samsung or other device, these will be different.
        options.setAppPackage("com.google.android.dialer");
        options.setAppActivity("com.google.android.dialer.extensions.GoogleDialtactsActivity");
        
        options.setNoReset(true);

        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        AndroidDriver driver = new AndroidDriver(url, options);
        
        // FIX 3: Removed "Click Phone Icon"
        // Since we are launching the Phone app directly via capabilities, 
        // we don't need to find the icon on the home screen.
        
        // Optional: Wait for app to load
        Thread.sleep(2000); 

        // Check if we need to click the "Keypad" tab first
        // (This ID is common in Google Dialer to switch to the number pad)
        try {
            driver.findElement(AppiumBy.id("com.google.android.dialer:id/dialpad_fab")).click();
        } catch (Exception e) {
            // Ignore if already on keypad or if element not found
        }

        // Dialing the number
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/nine")).click();
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/one")).click();
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/one")).click();
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/two")).click();
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/two")).click();
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/eight")).click();
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/three")).click();
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/two")).click();
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/two")).click();
        driver.findElement(AppiumBy.id("com.google.android.dialer:id/six")).click();
        
        // Click the Call button
        driver.findElement(AppiumBy.accessibilityId("dial")).click();
        
        // End test here
        System.out.println("Call initiated successfully");
        
        // FIX 4: Always quit the driver to close the session
//         driver.quit(); 
    }
}