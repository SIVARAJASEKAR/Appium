package com.miui.calculator;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	public static void main(String[] args) throws Throwable {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("UDID", "21234539");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", ".cal.AllInOneCalculatorActivity");
		

		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);
		
		driver.findElementById("android:id/button2").click();
		driver.findElementById("com.miui.calculator:id/btn_5_s").click();
		driver.findElementByAccessibilityId("multiply").click();
		driver.findElementById("com.miui.calculator:id/btn_9_s").click();
		driver.findElementById("com.miui.calculator:id/btn_equal_s").click();

	}
}
