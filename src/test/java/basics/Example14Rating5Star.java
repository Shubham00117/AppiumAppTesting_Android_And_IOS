package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Example14Rating5Star {

    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.setNoReset(true);
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");

        AndroidDriver driver =
                new AndroidDriver(URI.create("http://127.0.0.1:4723/").toURL(), options);

        // =========================
        // 1️⃣ Open Views
        // =========================
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        // =========================
        // 2️⃣ Scroll to "Rating Bar" menu item
        // =========================
        driver.findElement(
            AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"Rating Bar\"))"
            )
        );

        // =========================
        // 3️⃣ Click Rating Bar
        // =========================
        driver.findElement(AppiumBy.accessibilityId("Rating Bar")).click();

        // =========================
        // 4️⃣ Scroll inside Rating Bar screen
        // =========================
        driver.findElement(
            AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().resourceId(\"io.appium.android.apis:id/ratingbar1\"))"
            )
        );

     // =========================
     // 5️⃣ Set 5-star rating (CORRECT WAY)
     // =========================
     WebElement ratingBar =
             driver.findElement(AppiumBy.id("io.appium.android.apis:id/ratingbar1"));

     int startX = ratingBar.getLocation().getX();
     int width = ratingBar.getSize().getWidth();
     int y = ratingBar.getLocation().getY() + ratingBar.getSize().getHeight() / 2;

     // Tap near the far right → 5 stars
     int tapX = startX + (int)(width * 0.95);

     Map<String, Object> tap = new HashMap<>();
     tap.put("x", tapX);
     tap.put("y", y);

     driver.executeScript("mobile: clickGesture", tap);
    }
}