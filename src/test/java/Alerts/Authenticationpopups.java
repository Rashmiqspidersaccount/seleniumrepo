package Alerts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch chrome browser with url
		
		//application as autentication pop up ,to resolve that we use user name and password in url itsef
		
		//for example url is https://the-internet.herokuapp.com/basic_auth but we append url with user name amd pwd 
		//as https://admin:admin@the-internet.herokuapp.com/basic_auth 
		
		
		chrome1.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		chrome1.manage().window().maximize();
	}

}
