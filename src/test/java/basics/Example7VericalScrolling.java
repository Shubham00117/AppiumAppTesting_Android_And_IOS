package basics;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URI;

public class Example7VericalScrolling {
    public static void main(String[] args) throws Exception {
    	 UiAutomator2Options options = new UiAutomator2Options();
         options.setDeviceName("emulator-5554");
         options.setAutomationName("UiAutomator2");
         options.setNoReset(true);
         options.setAppPackage("io.appium.android.apis");
         options.setAppActivity("io.appium.android.apis.ApiDemos");

         AndroidDriver driver =
                 new AndroidDriver(URI.create("http://127.0.0.1:4723/").toURL(), options);

        driver.findElement(AppiumBy.accessibilityId("Views")).click();


        // 2️⃣ Scroll to Switches
        driver.findElement(
            AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"Switches\"))"
            )
        );
        driver.findElement(AppiumBy.accessibilityId("Switches")).click();
        System.out.println("Vertical Scroll performed.");
        driver.quit();
    }
}