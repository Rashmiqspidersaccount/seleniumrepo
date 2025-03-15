package amazonproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver chrome1=new ChromeDriver();
		chrome1.get("https://www.amazon.in/");
		chrome1.manage().window().maximize();
		
		Thread.sleep(2000);
		
		chrome1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("boult earphones");
		chrome1.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> allearphones=chrome1.findElements(By.xpath("//span[contains(text(),'boult')]"));
		
        for (WebElement earphone:allearphones) {
        	System.out.println(earphone.getText());
			
			
		}
	}

}
