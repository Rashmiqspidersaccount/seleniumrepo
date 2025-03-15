import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calenderclass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch chrome browser with url
		chrome1.get("https://www.makemytrip.com/");
		chrome1.manage().window().maximize();
		Thread.sleep(2000);
		Actions act=new Actions(chrome1);
		act.moveByOffset(10,0).click().perform();
		
		//click on departure
		chrome1.findElement(By.xpath("//span[text()='Departure']")).click();
		chrome1.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		chrome1.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		chrome1.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		chrome1.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		//act.scrollByAmount(0,1000).click().perform();
		act.scrollToElement(chrome1.findElement(By.xpath("//div[@aria-label='Tue Jul 29 2025']"))).perform();
		chrome1.findElement(By.xpath("//div[@aria-label='Tue Jul 29 2025']")).click();
		
		
		
		
		

	}

}
