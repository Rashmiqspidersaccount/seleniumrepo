package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_name_classname {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver driver=new ChromeDriver();
		
		//load url
		driver.get("https://www.saucedemo.com/");
		
		//maximize window		
		driver.manage().window().maximize();
		
		//locate username field ,password field  enter the value and click on login button
		
		WebElement un=driver.findElement(By.id("user-name"));
		un.sendKeys("standard_user");
		System.out.println("User name is entered");
		
		WebElement un1=driver.findElement(By.id("password"));
		un1.sendKeys("secret_sauce");
		System.out.println("Password is entered");
		
		driver.findElement(By.id("login-button")).click();
		
		WebElement header=driver.findElement(By.tagName("title"));
		System.out.println(header.getText());
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		Thread.sleep(2000);
		//link text
		//driver.findElement(By.linkText("About")).click();
		
		//partial link text
		
		driver.findElement(By.partialLinkText("State")).click();
		
		//css selector
		//driver.findElement(By.cssSelector("button[id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
		
		
		//xpath locators
		Thread.sleep(2000);
		
		//single attribute
		driver.findElement(By.xpath("//button[@id='react-burger-cross-btn']")).click();
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
		
		//double attribute
		driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ' and @id='add-to-cart-sauce-labs-onesie']")).click();
		//text function
		String text=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
		System.out.println(text);
		
		
		//xml when tag contains visible dynamic data
		
		String txt=driver.findElement(By.xpath("//div[contains( text(),'Sauce Labs Backpack')])")).getText();
		System.out.println(txt);
		
		//String price=driver.findElement(By.xpath("//span[contains(@class,'title')]")).getText();
		//System.out.println(price);
		
		//to remove unwanted space within the string
		driver.findElement(By.xpath("//span[normalize-space(text())='Products']")).click();
		
		
		//indexing when number of elements of same attribute type exist
		driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory '][2]")).click();
		
		//xml for find last item
		
		//button[@class='btn btn_primary btn_small btn_inventory '][last()]
		
		
		
		
		

	}

}
