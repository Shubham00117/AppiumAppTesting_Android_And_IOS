package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.URI;

public class IOSSimpleTest1_TextField {

    public static void main(String[] args) throws Exception {

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 17");
        options.setAutomationName("XCUITest");
        options.setBundleId("com.example.apple-samplecode.UICatalog");
        options.setNoReset(true);

        IOSDriver driver =
                new IOSDriver(URI.create("http://127.0.0.1:4723").toURL(), options);

        driver.findElement(AppiumBy.accessibilityId("Text Fields")).click();

        driver.findElement(AppiumBy.className("XCUIElementTypeTextField"))
              .sendKeys("Hello Appium");

        System.out.println("✅ Text entered successfully");

        driver.quit();
    }
}