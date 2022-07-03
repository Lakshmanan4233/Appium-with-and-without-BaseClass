package com.logout;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing  {
	
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws Exception {
			
		
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  
		  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
		  "Android Emulator");
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		  capabilities.setCapability(MobileCapabilityType.APP,
		  "D:\\Lakshmanan\\Desktop\\Daily Planner\\QA\\Build\\Daily Planner 7(14-06-2022).apk"
		  );
		  
		  URL url = new URL("http://0.0.0.0:4723/wd/hub");
		  
		  driver = new AndroidDriver(url, capabilities);
		  
		  Thread.sleep(5000);
		  
		  TouchAction action = new TouchAction((PerformsTouchActions) driver);
		  
		  //action.press(PointOption.point(710, 2400)).moveTo(PointOption.point(740,
		  //558)).release().perform();
		  
		  //driver.findElement(By.xpath(
		  //"//android.widget.TextView[@content-desc=\"DailyPlanner\"]")).click();
		  
		  //Thread.sleep(10000);
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/btnEnter")).click();
		  
		  driver.navigate().back();
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/btnRegister")).click();
		  
		  //driver.navigate().back();
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/edtFirstName")).click(); 
		  driver.getKeyboard().sendKeys("Lakshmanan");
		  
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/edtLastName")).click();
		  driver.getKeyboard().sendKeys("S");
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/edtRegUserName")).click();
		  driver.getKeyboard().sendKeys("Lakshmanan4233");
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/edtRegPassword")).click();
		  driver.getKeyboard().sendKeys("Lakshman@4795");
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/imgRegCalendar")).click();
		  
		  //TouchAction action = new TouchAction(driver);
		  
		  for(int i =1;i<=4;i++) {
		  
		  action.press(PointOption.point(255, 1455)).moveTo(PointOption.point(1176,
		  1518)).release().perform();
		  
		  }
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.
		  xpath("//android.view.View[@content-desc=\"15 April 2022\"]")).click();
		  
		  driver.findElement(By.id("android:id/button1")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/edtEmailName")).click()
		  ; driver.getKeyboard().sendKeys("Lakshmanans32456@gmail.com");
		  
		  driver.navigate().back();
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/btnRegisterPage")).
		  click();
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/imgAddTopThree")).click();
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/edtAddTxt")).sendKeys("Learning Appium");
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/btnAdd")).click();
		  
		  Thread.sleep(7000);
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/imgAddTopThree")).click();
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/edtAddTxt")).sendKeys("Appium with Emulator");
		  
		  driver.findElement(By.id("com.example.dailyplanner:id/btnAdd")).click();
		  
		  
		
		// Run the Emulator Using BaseClass
		
		/*
		 * setDriver("Android Emulator", "Appium",
		 * "D:\\Lakshmanan\\Desktop\\Daily Planner\\QA\\Build\\Daily Planner 7(14-06-2022).apk"
		 * );
		 * 
		 * Thread.sleep(5000);
		 * 
		 * Click(elementByID("com.example.dailyplanner:id/btnEnter"));
		 * 
		 * back();
		 * 
		 * Click(elementByID("com.example.dailyplanner:id/btnRegister"));
		 * 
		 * back();
		 */

	}

}
