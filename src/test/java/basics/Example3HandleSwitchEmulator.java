package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.URI;

public class Example3HandleSwitchEmulator {

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

        // 2️⃣ Scroll to Switches
        driver.findElement(
            AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"Switches\"))"
            )
        );

        // 3️⃣ Open Switches screen
        driver.findElement(AppiumBy.accessibilityId("Switches")).click();

        // 4️⃣ Locate the FIRST switch explicitly
        WebElement switchWidget = driver.findElement(
                AppiumBy.xpath("(//android.widget.Switch)[1]")
        );

        // 5️⃣ Toggle switch if OFF
        if (switchWidget.getAttribute("checked").equals("false")) {
            switchWidget.click();
            System.out.println("✅ Switch turned ON");
        } else {
            System.out.println("ℹ️ Switch already ON");
        }

        driver.quit();
    }
}