package WaitStatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		chrome1.get("https://www.saucedemo.com/");
		chrome1.manage().window().maximize();

		WebElement ele=chrome1.findElement(By.id("user-name"));
		WebDriverWait wait=new WebDriverWait(chrome1, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.urlContains("sauce"));
		System.out.println("url with text exist");
		
		wait.until(ExpectedConditions.attributeContains(ele, "class", "input_error form_input"));
		System.out.println("element exist");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));		
		System.out.println("Button exist");
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		System.out.println("input element exist");
		
		
		

	}

}
