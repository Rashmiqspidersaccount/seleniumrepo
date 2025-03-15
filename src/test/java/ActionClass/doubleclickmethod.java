package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.get("https://demoapp.skillrary.com/product.php?product=java");
		chrome1.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement add=chrome1.findElement(By.id("add"));
		WebElement sub=chrome1.findElement(By.id("minus"));
		Actions act=new Actions(chrome1);
		act.doubleClick(add).perform();
		Thread.sleep(1000);
		act.doubleClick(add).perform();
		Thread.sleep(1000);
		act.doubleClick(sub).perform();
		
	}

}
