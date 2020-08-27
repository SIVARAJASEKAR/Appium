package com.apk;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class InstallApk {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("UDID", "21234539");
		//cap.setCapability("app", "F:\\SIVA SAAMI\\TestYantra\\TYSS Training\\APPIUM\\apk\\DragAndDrop.apk");
		cap.setCapability("app", "F:\\SIVA SAAMI\\TestYantra\\TYSS Training\\APPIUM\\apk\\ApiDemos-debug.apk");
		cap.setCapability("noReset",true);
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, cap);
	
	}

}
