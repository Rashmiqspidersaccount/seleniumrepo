package browserlauncing;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		// Launch edge browser
		//WebDriver driver=new EdgeDriver();
		WebDriver driver1=new ChromeDriver();
		//WebDriver driver2=new FirefoxDriver();
		//WebDriver driver3=new SafariDriver();
		
  //to load the url
		driver1.get("https://www.flipkart.com/");
		
		//to fetch page title
		String t;
		t=driver1.getTitle();
		System.out.println(t);
		
		//to fetch current url
		String url=driver1.getCurrentUrl();
		System.out.println(url);
		
		//to close the current window of browser
		
		//driver1.close();
		
		
		//to close multiple windows of browser
		//driver1.quit();
		
		//to get page source
		String pagesource=driver1.getPageSource();
		//System.out.println(pagesource);
		
		
		//to get session id/window id of browser
		
		String winid=driver1.getWindowHandle();
		System.out.println(winid);
		
		
		//to get id of multiple sessions
		
		Set<String> winid1=driver1.getWindowHandles();
		for(String win:winid1) {
			System.out.println(win);
		}
		
		//Navigation methods
		 Navigation nav=driver1.navigate();
		 
		 //Refresh method
		 nav.refresh();
		 System.out.println("Page refreshed");
		 
		 //Back button on browser
		 nav.back();
		 System.out.println("Back button is clicked");
		 
		 //Forward button on browser
		 nav.forward();
		 System.out.println("Forward button is clicked");
		 
		 //to open new url
		 nav.to("https://www.makemytrip.com/ ");
		 System.out.println("new browser launched make my trip");
		 
		 
		 //Manage methods
		 
		 
		 Options op=driver1.manage();
		 Window win1=op.window();
		 Timeouts time=op.timeouts();
	
		 win1.maximize();
		 System.out.println("Maxime window");
		 Thread.sleep(2000);
		 win1.minimize();
		 System.out.println("minimize window");
		 win1.fullscreen();
		 System.out.println("full screen view");
		 
		 driver1.manage().window().maximize();
		 driver1.manage().window().minimize();
		 
		 
		 //Switch methods
		 TargetLocator Tl=driver1.switchTo();
		 Tl.window(winid);
		 driver1.switchTo().window(winid);
	}

}
