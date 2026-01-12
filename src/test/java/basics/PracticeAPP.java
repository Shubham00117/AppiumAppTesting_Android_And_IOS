package basics;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class PracticeAPP {

	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
	        
	        UiAutomator2Options options = new UiAutomator2Options();
	        
	        options.setDeviceName("13802783200005R");
	        options.setAutomationName("UiAutomator2");
	        
	      
	        options.setAppPackage("com.expandtesting.practice");
	        options.setAppActivity("com.expandtesting.practice.MainActivity");
	        
	        options.setNoReset(true);

	        URL url = URI.create("http://127.0.0.1:4723/").toURL();

	        AndroidDriver driver = new AndroidDriver(url, options);
	        driver.findElement(AppiumBy.id("com.expandtesting.practice:id/btn_counter_demo")).click();
	        driver.findElement(AppiumBy.id("com.expandtesting.practice:id/btn_increment")).click();
	        driver.findElement(AppiumBy.id("com.expandtesting.practice:id/btn_increment")).click();
	        driver.findElement(AppiumBy.id("com.expandtesting.practice:id/btn_increment")).click();
	        driver.findElement(AppiumBy.id("com.expandtesting.practice:id/btn_reset")).click();
	        driver.findElement(AppiumBy.id("com.expandtesting.practice:id/btn_decrement")).click();
	        driver.findElement(AppiumBy.id("com.expandtesting.practice:id/btn_decrement")).click();
	        driver.findElement(AppiumBy.id("com.expandtesting.practice:id/btn_decrement")).click();
	        driver.findElement(AppiumBy.id("com.expandtesting.practice:id/btn_reset")).click();
	       String count= driver.findElement(AppiumBy.id("com.expandtesting.practice:id/tv_counter")).getText();
	       assertEquals(count, "0");
	       System.out.println("Test pass");
	        

	       
	       

	       
	       
	        
	 }

}
