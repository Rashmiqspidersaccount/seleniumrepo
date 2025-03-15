package Alerts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch chrome browser with url
		chrome1.get("https://demo.automationtesting.in/Windows.html");
		chrome1.manage().window().maximize();
		
		chrome1.findElement(By.linkText("Open New Seperate Windows")).click();
		chrome1.findElement(By.xpath("//button[text()='click']")).click();
		
		String mainwindow=chrome1.getWindowHandle();
		Set<String> allwindows=chrome1.getWindowHandles();
		
		for (String win:allwindows) {
			
			if (!win.equals(mainwindow)) {
				chrome1.switchTo().window(win);
				chrome1.findElement(By.xpath("//span[text()='Downloads']")).click();
						
				break;
				
			}
			
			
		}
	
		chrome1.switchTo().window(mainwindow);
		chrome1.findElement(By.linkText("Open Seperate Multiple Windows")).click();
		
		
		
		
		

	}

}
