package WaitStatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class fluentwait {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		chrome1.get("https://www.saucedemo.com/");
		chrome1.manage().window().maximize();
		
		FluentWait fwait=new FluentWait(chrome1);
		fwait.pollingEvery(Duration.ofSeconds(200));
		fwait.withTimeout(Duration.ofSeconds(10, 0));
		
		
		if ((boolean) fwait.until(ExpectedConditions.urlContains("rash"))) {
			System.out.println("not exist");
			
		}
		
	}

}
