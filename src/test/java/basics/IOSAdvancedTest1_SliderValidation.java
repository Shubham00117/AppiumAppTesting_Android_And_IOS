package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.net.URI;

public class IOSAdvancedTest1_SliderValidation {

    public static void main(String[] args) throws Exception {

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 17");
        options.setAutomationName("XCUITest");
        options.setBundleId("com.example.apple-samplecode.UICatalog");
        options.setNoReset(true);

        IOSDriver driver =
                new IOSDriver(URI.create("http://127.0.0.1:4723").toURL(), options);

        // Scroll to Sliders
        driver.findElement(AppiumBy.iOSNsPredicateString(
                "label == 'Sliders'"
        )).click();

        WebElement slider = driver.findElement(AppiumBy.className("XCUIElementTypeSlider"));

        slider.sendKeys("0.8");

        String value = slider.getAttribute("value");
        Assert.assertTrue(value.contains("80"), "Slider value not updated");

        System.out.println("✅ Slider value verified");

        driver.quit();
    }
}