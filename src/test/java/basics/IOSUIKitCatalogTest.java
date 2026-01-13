package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.URI;
import java.net.URL;

public class IOSUIKitCatalogTest {

    public static void main(String[] args) throws Exception {

        // =========================
        // 1️⃣ iOS CAPABILITIES
        // =========================
        XCUITestOptions options = new XCUITestOptions();

        options.setDeviceName("iPhone 17");              // Simulator name
        options.setAutomationName("XCUITest");
        options.setBundleId("com.example.apple-samplecode.UICatalog");
        options.setNoReset(true);

        // =========================
        // 2️⃣ START IOS DRIVER
        // =========================
        URL url = URI.create("http://127.0.0.1:4723").toURL();
        IOSDriver driver = new IOSDriver(url, options);

        // =========================
        // 3️⃣ PERFORM ACTIONS
        // =========================

        // Click on "Steppers"
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[13]/XCUIElementTypeOther[1]/XCUIElementTypeOther")).click();

        // Click on "Default plus Button"
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Increment\"`][1]")).click();

        System.out.println("✅ UIKitCatalog Steppers test passed");

//        driver.quit();
    }
}