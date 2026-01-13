package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.URI;

public class IOSSimpleTest8_Search {

    public static void main(String[] args) throws Exception {

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 17");
        options.setAutomationName("XCUITest");
        options.setBundleId("com.example.apple-samplecode.UICatalog");
        options.setNoReset(true);

        IOSDriver driver = new IOSDriver(URI.create("http://127.0.0.1:4723").toURL(), options);

        driver.findElement(AppiumBy.accessibilityId("Search")).click();

       driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther")).click();
       driver.findElement(AppiumBy.className("XCUIElementTypeSearchField")).sendKeys("Welcome To IOS Testing");
       

        System.out.println("✅ Text entered in search field");

        driver.quit();
    }
}