package Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disablebrowsernotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//disable popups
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver chrome1=new ChromeDriver(option);
		chrome1.get("https://www.yatra.com/ ");
		chrome1.manage().window().maximize();

	}

}
