package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v131.page.model.FileHandler;
import org.openqa.selenium.devtools.v132.filesystem.model.File;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.get("https://www.saucedemo.com/");
		chrome1.manage().window().maximize();
		Actions act=new Actions(chrome1);
		WebElement username=chrome1.findElement(By.id("user-name"));
		act.keyDown(Keys.SHIFT).perform();		
		act.sendKeys(username,"abc").perform();
		act.keyUp(Keys.SHIFT).perform();
		username.clear();
		
		
		
		
		act.sendKeys(username, "standard_user",Keys.TAB,"secret_sauce").perform();
		
		chrome1.findElement(By.id("login-button")).click();
		   act.scrollToElement(chrome1.findElement(By.linkText("Twitter"))).perform();
		//scroll downwards
	    act.scrollByAmount(0, 2000).perform();
	    //scroll upwards
	    act.scrollByAmount(0,-500).perform();	    
	    //scroll right
	    act.scrollByAmount(500,0).perform();
	    //scroll left
	    act.scrollByAmount(-500,0).perform();
	    
	    
	 //javascript executer
	    JavascriptExecutor je=(JavascriptExecutor) chrome1;
	   // scroll down
	    je.executeScript("window.scrollBy(0,1500);","");
	    
	    TakesScreenshot ts=(TakesScreenshot) chrome1;
	      Comparable<java.io.File> src=ts.getScreenshotAs(OutputType.FILE);
	  //  java.io.File src=ts.getScreenshotAs(OutputType.FILE);
	   File dst=new File("C:\\Users\\w 11\\eclipse-workspace\\Basicselenium.E23\\Screenshots\\take1.png", null, null, null);
	   FileHandler(src,dst);
	    
	    
	    
	    
	    
	    
		

	}

	private static void FileHandler(java.io.File src, File dst) {
		// TODO Auto-generated method stub
		
	}



}
