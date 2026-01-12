package Day1_Device;
import java.net.URI;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Example1InstallAppVirtualDevice {

    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setApp("/Users/shubham_infinity/Desktop/indiamart-13-5-5-t131jul25.apk");

        // FIX: Use URI.create().toURL() instead of new URL()
        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        AndroidDriver driver = new AndroidDriver(url, options);

        System.out.println("Driver initialized successfully.");

        driver.quit();
    }
}