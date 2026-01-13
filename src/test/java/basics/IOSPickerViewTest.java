package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.WebElement;

import java.net.URI;
import java.util.List;

public class IOSPickerViewTest {

    public static void main(String[] args) throws Exception {

        // =========================
        // 1️⃣ iOS CAPABILITIES
        // =========================
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 17");          // your simulator
        options.setAutomationName("XCUITest");
        options.setBundleId("com.example.apple-samplecode.UICatalog");
        options.setNoReset(true);

        IOSDriver driver =
                new IOSDriver(URI.create("http://127.0.0.1:4723").toURL(), options);

        // =========================
        // 2️⃣ OPEN PICKER VIEW
        // =========================
        driver.findElement(AppiumBy.accessibilityId("Picker View")).click();

        // =========================
        // 3️⃣ LOCATE PICKER WHEELS
        // =========================
        List<WebElement> wheels =
                driver.findElements(AppiumBy.className("XCUIElementTypePickerWheel"));

        System.out.println("Picker wheels found: " + wheels.size());

        // =========================
        // 4️⃣ SELECT VALUES
        // =========================
        wheels.get(0).sendKeys("135");     // First wheel
        wheels.get(1).sendKeys("155");     // Second wheel
        wheels.get(2).sendKeys("200");       // Third wheel

        System.out.println("✅ Picker View values selected successfully");

        // =========================
        // 5️⃣ END SESSION
        // =========================
        driver.quit();
    }
}