package selfLearnig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Testngpackage.Sampletest;

public class slenium1 {

	public static void main(String[] args) throws InterruptedException {
		// launch flipkart application
		
		WebDriver drv1=new ChromeDriver();
		drv1.get("https://www.flipkart.com/");
		drv1.manage().window().maximize();
		Thread.sleep(2000);
		
		drv1.findElement(By.cssSelector("a._1TOQfO")).click();
		drv1.findElement(By.cssSelector("input.r4vIwl")).sendKeys("9980503869");
		Sampletest st=new Sampletest();
		st.samplemethod();
    
	}

}
