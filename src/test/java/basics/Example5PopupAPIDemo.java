package basics;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URI;

public class Example5PopupAPIDemo {
    public static void main(String[] args) throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setApp("/path/to/ApiDemos.apk");

        AndroidDriver driver = new AndroidDriver(URI.create("http://127.0.0.1:4723/").toURL(), options);
        
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
        driver.findElement(AppiumBy.accessibilityId("List dialog")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Command two']")).click();
        System.out.println("Popup item selected.");
        driver.quit();
    }
}