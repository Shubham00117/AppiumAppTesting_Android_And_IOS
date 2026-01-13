package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import java.net.URI;

import org.openqa.selenium.WebElement;

public class IOSSwitchHandle {

    public static void main(String[] args) throws Exception {

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 17");
        options.setAutomationName("XCUITest");
        options.setBundleId("com.example.apple-samplecode.UICatalog");
        options.setNoReset(true);

        IOSDriver driver =
                new IOSDriver(URI.create("http://127.0.0.1:4723").toURL(), options);

        driver.findElement(AppiumBy.accessibilityId("Switches")).click();

        WebElement switchBtn = driver.findElement(AppiumBy.className("XCUIElementTypeSwitch"));
        String state = switchBtn.getAttribute("value");

        if (state.equals("0")) {
            switchBtn.click();
            System.out.println("✅ Switch turned ON");
        } else {
            System.out.println("ℹ️ Switch already ON");
        }

        driver.quit();
    }
}