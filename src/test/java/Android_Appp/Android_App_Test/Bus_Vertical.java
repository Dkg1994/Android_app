package Android_Appp.Android_App_Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Bus_Vertical {


	

	static WebDriver driver;
	
	@Test
	
	public static void main(String arr[]) throws MalformedURLException, InterruptedException 
	{
		File app= new File("D:\\Software\\Goibibo Flight Hotel Bus Car Train IRCTC Booking_v6.0.16_apkpure.com.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ea2b9646");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appWaitActivity", "com.goibibo.login.WelcomeLoginActivity");
		capabilities.setCapability("activityName", ".cosm.goibibo.GoibiboSplashScreen");
		capabilities.setCapability("app", app.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		Thread.sleep(7000);
		
		driver.navigate().back();
		
		driver.findElement(By.id("android:id/button2")).click();
		
		Thread.sleep(2000);
		
//		Click on Bus Vertical
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Buses']")).click();
		
		Thread.sleep(2000);
		
//		Click on Source Station
		
		driver.findElement(By.id("com.goibibo:id/tv_src_name")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.goibibo:id/search_edit")).sendKeys("Delhi");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("com.goibibo:id/suggested_place")).click();
		
		Thread.sleep(3000);
		
		
		
		
//		Click on Destination Station
		
		driver.findElement(By.id("com.goibibo:id/tv_dest_name")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.goibibo:id/search_edit")).sendKeys("Agra");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("com.goibibo:id/suggested_place")).click();
		
		Thread.sleep(3000);
		
//		Click on Date
		
		driver.findElement(By.id("com.goibibo:id/odate_layout")).click();
		
		Thread.sleep(2000);
		
		MobileElement el1 = (MobileElement) ((FindsByAndroidUIAutomator) driver)
			    .findElementByAndroidUIAutomator("new UiScrollable("
			        + "new UiSelector().scrollable(true)).scrollIntoView("                      
			        + "new UiSelector().textContains(\"October 2019\"));");
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='24']")).click();
		
//		driver.findElement(By.id("com.goibibo:id/calendar_picker_view")).click();
		
		
		
		Thread.sleep(3000);

		
		driver.findElement(By.id("com.goibibo:id/menu_filter")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Bus Operator']")).click();
		
		Thread.sleep(2000);
		
		
//		Select Bus Operator 
		
		
		driver.findElement(By.xpath("//android.widget.CheckBox[@text='Northern Travels']")).click();
		
		Thread.sleep(3000);
		
		
//		Apply Filter
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("com.goibibo:id/apply_filter")).click();
		
		
//		Click on Bus 
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Northern Travels']")).click();
		
		Thread.sleep(4000);
		
		
		
//		Click on Ok Got it button on Review page
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.goibibo:id/ok_button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.goibibo:id/cross")).click();
		
////		Click on upper seat option
//		
//		driver.findElement(By.xpath("android.widget.TextView[@text='Upper']")).click();
		
//		Seat selection
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("com.goibibo:id/tv_seat")).click();		
		
//		Click on Policies
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.goibibo:id/action_policy")).click();
		
//		Click on Photos button on pop up window
		
//		driver.findElement(By.xpath("android.widget.TextView[@text='Photos']")).click();
		
		
		Thread.sleep(3000);
		
//		Click on close button
		
		driver.findElement(By.id("com.goibibo:id/close")).click();
		
		Thread.sleep(2000);
		
//		Click on Book Now 
		
		
		
		driver.findElement(By.id("com.goibibo:id/book_btn")).click();
		
		
//		Click On Borading & Drop Point
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.goibibo:id/tv_bpdp_name")).click();
		
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("com.goibibo:id/tv_dp_name")).click();
		
		
//		Enter Traveller Details
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("com.goibibo:id/et_first_name")).sendKeys("Test");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.goibibo:id/et_age")).sendKeys("22");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.goibibo:id/editBookingMobile")).sendKeys("9999999999");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.goibibo:id/editBookingEmail")).sendKeys("testnoc009@gmail.com");

		Thread.sleep(3000);
		
		driver.navigate().back();

		Thread.sleep(2000);
		
//		Click to make payment button
		
		driver.findElement(By.id("com.goibibo:id/pay_button_bus")).click();
		
//		Select Payment mode
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Netbanking']")).click();
		
		
		MobileElement el = (MobileElement) ((FindsByAndroidUIAutomator) driver)
			    .findElementByAndroidUIAutomator("new UiScrollable("
			        + "new UiSelector().scrollable(true)).scrollIntoView("                      
			        + "new UiSelector().textContains(\"State Bank of India \"));");
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='State Bank of India']")).click();
		
		Thread.sleep(3000);
		
		
	}

}

