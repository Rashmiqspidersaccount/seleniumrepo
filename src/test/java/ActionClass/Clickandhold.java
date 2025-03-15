package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.get("https://demoqa.com/buttons");
		chrome1.manage().window().maximize();
		
		
		WebElement btn=chrome1.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions act=new Actions(chrome1);
		act.clickAndHold(btn).perform();
		act.release().perform();

	}

}
