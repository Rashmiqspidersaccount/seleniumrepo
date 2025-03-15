package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		//chrome1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		chrome1.get("https://demoqa.com/alerts");
		chrome1.manage().window().maximize();
		Thread.sleep(9000);

		
		
		chrome1.findElement(By.id("alertButton")).click();
		Alert a=chrome1.switchTo().alert();
		a.accept();
		
		chrome1.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		a.accept();
		
		chrome1.findElement(By.id("confirmButton")).click();		
		chrome1.switchTo().alert().dismiss();
		
		

	}

}
