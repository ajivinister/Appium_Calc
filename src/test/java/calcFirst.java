import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.FindElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class calcFirst {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		try {
			openCalendar();
		}
		catch(Exception ex) {
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public static void openCalendar() throws Exception
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "AZEN");
		cap.setCapability("udid", "J5AAGF00C850D5D");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.0");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage","com.asus.calculator");
		cap.setCapability("appActivity","com.asus.calculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("Calculator is Open Now");
		
		MobileElement zero = driver.findElement(By.id("com.asus.calculator:id/digit0"));
		MobileElement one = driver.findElement(By.id("com.asus.calculator:id/digit1"));
		MobileElement two = driver.findElement(By.id("com.asus.calculator:id/digit2"));
		MobileElement three = driver.findElement(By.id("com.asus.calculator:id/digit3"));
		MobileElement four = driver.findElement(By.id("com.asus.calculator:id/digit4"));
		MobileElement five = driver.findElement(By.id("com.asus.calculator:id/digit5"));
		MobileElement six = driver.findElement(By.id("com.asus.calculator:id/digit6"));
		MobileElement seven = driver.findElement(By.id("com.asus.calculator:id/digit7"));
		MobileElement eight = driver.findElement(By.id("com.asus.calculator:id/digit8"));
		MobileElement nine = driver.findElement(By.id("com.asus.calculator:id/digit9"));
		MobileElement dot = driver.findElement(By.id("com.asus.calculator:id/dot"));
		MobileElement equal = driver.findElement(By.id("com.asus.calculator:id/equal"));
		MobileElement plus = driver.findElement(By.id("com.asus.calculator:id/plus"));
		MobileElement minus = driver.findElement(By.id("com.asus.calculator:id/minus"));
		MobileElement multi = driver.findElement(By.id("com.asus.calculator:id/mul"));
		MobileElement divide = driver.findElement(By.id("com.asus.calculator:id/div"));
		MobileElement percentage = driver.findElement(By.id("com.asus.calculator:id/percent"));
		MobileElement clear = driver.findElement(By.id("com.asus.calculator:id/clear"));
		MobileElement del = driver.findElement(By.id("com.asus.calculator:id/del"));
		MobileElement result = driver.findElement(By.className("android.widget.EditText"));
		
		one.click();
		two.click();
		three.click();
		four.click();
		five.click();
		six.click();
		seven.click();
		nine.click();
		multi.click();
		eight.click();
		equal.click();
		Thread.sleep(5000);
		
		String res = result.getText();
		System.out.println("\n Result is : " +res);
		System.out.println("Calcultor test completed");
		
		
	}

	

}
