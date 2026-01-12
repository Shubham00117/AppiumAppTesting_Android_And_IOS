package basics;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.net.URI;
import java.net.URL;

public class Example10ExpandableList {
    public static void main(String[] args) throws Exception {
    	UiAutomator2Options options = new UiAutomator2Options();
        
        options.setDeviceName("13802783200005R");
        options.setAutomationName("UiAutomator2");
        
        // 1. IMPORTANT: Don't reinstall the app (prevent "SessionNotCreated" error)
        options.setNoReset(true);

        // 2. IMPORTANT: Use the Google package (which we know exists from Error #1)
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");

        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        AndroidDriver driver = new AndroidDriver(url, options);

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();

        WebElement people = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]"));
        people.click(); 
//
       WebElement peopleName= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Arnold\"]"));
        System.out.println("clicked People name"+" "+peopleName.getText());

        driver.quit();
    }
}