package Day1_Device;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URI;
import java.net.URL;

public class Example2InstallAppRealDevice {

    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        
        // REPLACE THIS with the ID you got from 'adb devices'
        options.setUdid("13802783200005R"); 
        
        // This is just a label, but good to keep descriptive
        options.setDeviceName("MyRealPhone"); 

        // Path to the APK on your computer (Mac)
        // Note: On some phones (like Xiaomi/Oppo), you must enable "Install via USB" 
        // in Developer Settings for this to work.
        options.setApp("/Users/shubham_infinity/Desktop/indiamart-13-5-5-t131jul25.apk");

        // Use the modern URI approach to avoid deprecation warning
        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        AndroidDriver driver = new AndroidDriver(url, options);

        System.out.println("App launching on Real Device...");

        // driver.quit(); 
    }
}