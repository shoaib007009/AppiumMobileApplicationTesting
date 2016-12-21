package mobileApplicationTestingStreamkar;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Application {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException, InterruptedException {
		

		//Mobile Application Path.
		File androidApk = new File("C:\\Users\\shoaib\\Downloads\\app-web-release.apk");
	    System.out.println("File path of android apk: \n"+ androidApk.getAbsolutePath());
		
		//Setting Capabilities For Android Platform.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT , "60000");
		capabilities.setCapability(MobileCapabilityType.APP, androidApk.getAbsolutePath());
		
		//Android WebDriver Settings
		AppiumDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(5000L);
		
		//driver.close();
		
		
		
		

	}

}
