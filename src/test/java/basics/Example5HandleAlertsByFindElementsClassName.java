package basics;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import java.net.URI;

public class Example5HandleAlertsByFindElementsClassName {
    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.setNoReset(true);
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");

        AndroidDriver driver =
                new AndroidDriver(URI.create("http://127.0.0.1:4723/").toURL(), options);
        
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
        driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();

        WebElement btn = driver.findElement(AppiumBy.className("android.widget.Button"));
        btn.click(); 

        System.out.println("Alert handled via ClassName.");
        driver.quit();
    }
}