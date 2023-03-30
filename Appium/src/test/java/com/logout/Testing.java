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
		  ""
		  );
		  
		  URL url = new URL("http://0.0.0.0:4723/wd/hub");
		  
		  driver = new AndroidDriver(url, capabilities);
		  
		  Thread.sleep(5000);
		  
		  TouchAction action = new TouchAction((PerformsTouchActions) driver);

	}

}
