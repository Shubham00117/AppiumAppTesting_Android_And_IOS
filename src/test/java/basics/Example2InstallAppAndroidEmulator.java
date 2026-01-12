package basics;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URI;

public class Example2InstallAppAndroidEmulator {
    public static void main(String[] args) throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setApp("/Users/shubham_infinity/apkfiles/IndiaMART.apk");

        AndroidDriver driver = new AndroidDriver(URI.create("http://127.0.0.1:4723/").toURL(), options);
        System.out.println("App installed on Emulator.");
        driver.quit();
    }
}