package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriventest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileInputStream eis=new FileInputStream(".\\src\\main\\resources\\commonproperties.properties");
        Properties p=new Properties();
        p.load(eis);
        
        String URL=p.getProperty("url");
        String USERNAME=p.getProperty("username");
        String PASSWORD=p.getProperty("pwd");
        
		// launch browser
		WebDriver driver=new ChromeDriver();
		
		//load url
		driver.get(URL);
		
		//maximize window		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locate username field ,password field  enter the value and click on login button
		
		WebElement un=driver.findElement(By.id("user-name"));
		un.sendKeys(USERNAME);
		System.out.println("User name is entered");
		
		WebElement un1=driver.findElement(By.id("password"));
		un1.sendKeys(PASSWORD);
		System.out.println("Password is entered");
		
		driver.findElement(By.id("login-button")).click();
        		
        
	}

}
