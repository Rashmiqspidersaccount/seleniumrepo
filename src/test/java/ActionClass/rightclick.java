package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.get("https://demo.guru99.com/test/simple_context_menu.html");
		chrome1.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement item=chrome1.findElement(By.xpath("//span[text()=\"right click me\"]"));
		Actions act=new Actions(chrome1);
		act.contextClick(item).perform();
		chrome1.findElement(By.xpath("//span[text()='Edit']")).click();
		
		
		
	}

}
