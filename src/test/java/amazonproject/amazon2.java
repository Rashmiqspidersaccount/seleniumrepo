package amazonproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver chrome1=new ChromeDriver();
		chrome1.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		chrome1.manage().window().maximize();
		
		Thread.sleep(2000);
		
		chrome1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptops");
		chrome1.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> lapcoll=chrome1.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
		for(WebElement hplap:lapcoll) {
			 String spantext=hplap.getText();
			
			 if(spantext.contains("HP")) {
				 System.out.println(spantext);
				 hplap.click();
				 break;
				 
			 }
			
		}
		
	}

}
