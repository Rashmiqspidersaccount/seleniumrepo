package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

public class Actionclass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver chrome1=new ChromeDriver();
		chrome1.get("https://www.flipkart.com/");
		chrome1.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement elem1=chrome1.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act1=new Actions(chrome1);
		act1.moveToElement(elem1).perform();
		
		chrome1.findElement(By.linkText("Men Footwear")).click();
		

	}

}
