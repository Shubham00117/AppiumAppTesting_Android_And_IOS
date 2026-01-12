package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Example6DragAndDropAction {

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

        // 2️⃣ Open Drag and Drop
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        // 3️⃣ Locate source & destination
        WebElement source =
                driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

        WebElement destination =
                driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));

        // 4️⃣ Perform drag gesture (CORRECT WAY)
        Map<String, Object> drag = new HashMap<>();
        drag.put("elementId", ((org.openqa.selenium.remote.RemoteWebElement) source).getId());
        drag.put("endX", destination.getLocation().getX());
        drag.put("endY", destination.getLocation().getY());

        driver.executeScript("mobile: dragGesture", drag);

        System.out.println("✅ Drag and Drop successful");

        driver.quit();
    }
}