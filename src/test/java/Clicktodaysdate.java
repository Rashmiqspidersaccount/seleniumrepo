import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicktodaysdate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	Date d1=new Date();
	String todaydate=d1.toString();
    System.out.println(todaydate);
    
    String[] d=todaydate.split(" ");
    String Currentdate=d[0]+" "+d[1]+" "+d[2]+" "+d[5];
    System.out.println(Currentdate);
    
	
	WebDriver chrome1=new ChromeDriver();
	chrome1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//launch chrome browser with url
	chrome1.get("https://www.makemytrip.com/");
	chrome1.manage().window().maximize();
	Thread.sleep(2000);
	Actions act=new Actions(chrome1);
	act.moveByOffset(10,0).click().perform();
	
	//click on departure
	chrome1.findElement(By.xpath("//span[text()='Departure']")).click();
	Thread.sleep(2000);
	//click on march 13
	act.scrollToElement(chrome1.findElement(By.xpath("//div[@aria-label='"+Currentdate+"']"))).perform();
	chrome1.findElement(By.xpath("//div[@aria-label='"+Currentdate+"']")).click();
	                             
    	

	}

}
