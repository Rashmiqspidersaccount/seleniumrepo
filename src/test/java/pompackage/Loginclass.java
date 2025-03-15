package pompackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.PublicKey;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Loginclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\src\\main\\resources\\commonproperties.properties");
		Properties p=new Properties();
		p.load(fis);
		String URL=p.getProperty("url");
		String USERNAME=p.getProperty("username");
		String PWD=p.getProperty("pwd");
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.name("login-button")).click();
		
		
		//Usage of pom class to access webelements
		
		Loginpage lp=new Loginpage(driver);
		//lp.getUsernametextfield().sendKeys(USERNAME);
		//lp.getPasswordtextfield().sendKeys(PWD);
		//lp.getLoginbutton().click();
		
			
		


	}
	

}
