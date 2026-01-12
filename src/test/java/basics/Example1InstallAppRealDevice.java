package basics;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URI;

public class Example1InstallAppRealDevice {
    public static void main(String[] args) throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid("YOUR_REAL_DEVICE_ID_HERE"); 
        options.setDeviceName("RealDevice");
        options.setApp("/Users/shubham_infinity/apkfiles/IndiaMART.apk");

        AndroidDriver driver = new AndroidDriver(URI.create("http://127.0.0.1:4723/").toURL(), options);
        System.out.println("App installed on Real Device.");
        driver.quit();
    }
}