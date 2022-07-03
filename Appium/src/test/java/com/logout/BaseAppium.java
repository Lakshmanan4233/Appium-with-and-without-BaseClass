package com.logout;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.aspectj.weaver.loadtime.Options;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseAppium {
	
	static AndroidDriver driver;
	
	//1. Lanuch the android emulator 
	public static void setDriver(String devicename,String automationName,String App) throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, devicename);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
		capabilities.setCapability(MobileCapabilityType.APP, App);
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AndroidDriver(url, capabilities);
	}
	
	//2. Find Mobile Element By id
	public static WebElement elementByID(String id) {

		WebElement Element = driver.findElement(By.id(id));
		return Element;

	}
	
	//3. Find Mobile Element By xpath
	public static WebElement elementByxpath(String xpath) {
		
		WebElement Element = driver.findElement(By.xpath(xpath));
		return Element;

	}
	
	//4. Click the mobile Element
	public static void Click(WebElement element) {
	
		element.click();
		
	}
	
	// 5. Sendkeys with keyboard
	public static void sendWithkeyboard(String keyToSend) {
		
		driver.getKeyboard().sendKeys(keyToSend);

	}
	
	//6. Sendkeys without keyboard
	public static void sendwithoutkeyboard(WebElement element, String keyToSend) {
		
		element.sendKeys(keyToSend);

	}
	
	//7. Use Back button in Mobile device
	
	public static void back() {
		 
		driver.navigate().back();

	}
	
	// 8. Swipe - Horizontal and Vertical swipe
	public void swipe(int pressX,int pressY,int moveX, int moveY) {
		
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(pressX, pressY)).moveTo(PointOption.point(moveX, moveY)).release().perform();

	}
	
	//9. Swipe with wait action
	public void swipeWithWait(int pressX,int pressY,int moveX,int moveY,long duration) {
		
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(pressX, pressY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration))).moveTo(PointOption.point(moveX, moveY)).release().perform();

	}
	
	//10. tap the particular point
	public void tap(int x,int y) {
		
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(x, y)).perform();

	}
	
	//11. tap with wait action
	public void tapWithWait(int x,int y,long duration) {
		
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(x, y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration))).perform();
		
		//driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	}
	
	//12. Take screenshot
	public static File screenshot() {
		
		TakesScreenshot screenshot = driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		return file;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
