package ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movefocusmethos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.get("https://www.makemytrip.com/");
		chrome1.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act2=new Actions(chrome1);
		act2.moveByOffset(11, 10).click().perform();
	}

}
