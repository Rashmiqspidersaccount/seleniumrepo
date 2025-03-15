package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch chrome browser with url
		chrome1.get("https://www.shine.com/registration/");
		chrome1.manage().window().maximize();
		
		WebElement fileupload=chrome1.findElement(By.id("id_file"));
		fileupload.sendKeys("C:\\Users\\w 11\\Desktop\\selenium screenshot\\Locators in Selenium Web Driver (1).txt");
		
	

	}

}
