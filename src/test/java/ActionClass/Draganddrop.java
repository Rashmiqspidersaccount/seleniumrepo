package ActionClass;

import java.io.File;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException; 

import org.openqa.selenium.io.FileHandler;


public class Draganddrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		chrome1.get("https://practice.expandtesting.com/drag-and-drop");
		chrome1.manage().window().maximize();
		Thread.sleep(2000);
		//chrome1.manage().timeouts().implicitlyWait(Duration.)
	
		WebElement src=chrome1.findElement(By.id("column-a"));
		WebElement trg=chrome1.findElement(By.id("column-b"));
		
		Actions act=new Actions(chrome1);
		act.dragAndDrop(src, trg).perform();
		
	       TakesScreenshot screenshot = (TakesScreenshot) chrome1;
	        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	        // Specify the destination file path
	        File destFile = new File(".\\Screenshots\\take1.png");
	       FileHandler.copy(srcFile, destFile);
	        
	
		
 
        
		
	}



}
