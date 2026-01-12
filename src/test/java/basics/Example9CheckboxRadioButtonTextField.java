package basics;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import java.net.URI;

public class Example9CheckboxRadioButtonTextField {
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
        driver.findElement(AppiumBy.accessibilityId("Controls")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Light Theme")).click();

        driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).sendKeys("Hello Appium");
        driver.findElement(AppiumBy.accessibilityId("Checkbox 1")).click();
        driver.findElement(AppiumBy.accessibilityId("RadioButton 1")).click();

        System.out.println("Form elements handled.");
        driver.quit();
    }
}