package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v131.filesystem.model.File;
import org.openqa.selenium.devtools.v131.page.model.FileHandler;
import org.openqa.selenium.interactions.Actions;

public class Frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.get("https://jqueryui.com/droppable/ ");
		chrome1.manage().window().maximize();
		
		
		
		//switch to statements
		chrome1.switchTo().frame(0);
		WebElement drag=chrome1.findElement(By.id("draggable"));
		WebElement drop=chrome1.findElement(By.id("droppable"));
		
		Actions act=new Actions(chrome1);
		act.dragAndDrop(drag, drop).perform();
		
		chrome1.switchTo().defaultContent();
		
		chrome1.findElement(By.linkText("Visual feedback")).click();
		
		TakesScreenshot ts=(TakesScreenshot) chrome1;
	
	}

	

}
