package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.URI;
import java.util.List;

public class Example4HandleDropDownsById {

    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.setNoReset(true);
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");

        AndroidDriver driver =
                new AndroidDriver(URI.create("http://127.0.0.1:4723/").toURL(), options);

        // 1️⃣ Open Views
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        // 2️⃣ SCROLL to Spinner (IMPORTANT)
        driver.findElement(
            AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"Spinner\"))"
            )
        );

        // 3️⃣ Open Spinner screen
        driver.findElement(AppiumBy.accessibilityId("Spinner")).click();

        // 4️⃣ Click dropdown
        driver.findElement(AppiumBy.id("io.appium.android.apis:id/spinner1")).click();

        // 5️⃣ Select option using className
        List<WebElement> list =
                driver.findElements(AppiumBy.className("android.widget.CheckedTextView"));

        list.get(2).click();   // Select 3rd option

        System.out.println("✅ Dropdown handled successfully");

        driver.quit();
    }
}