package Selectclass;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Lists;

public class dropdownelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome1=new ChromeDriver();
		chrome1.get("https://demoqa.com/select-menu");
		chrome1.manage().window().maximize();
	
		WebElement s=chrome1.findElement(By.id("oldSelectMenu"));
		Select colourddp1=new Select(s);
		colourddp1.selectByIndex(3);
		colourddp1.selectByValue("5");
		colourddp1.selectByVisibleText("Aqua");
		
		List<WebElement> opt1=colourddp1.getAllSelectedOptions();
		for(WebElement I1:opt1) {
			System.out.println(I1.getText());
		}
		
		System.out.println(colourddp1.getFirstSelectedOption().getText());
		List<WebElement> opt2=colourddp1.getOptions();
		for(WebElement I2:opt2) {
			System.out.println(I2.getLocation());
		}
		
		
		//colourddp1.deselectAll();
		
		//multi select dropdown methods
		WebElement s1=chrome1.findElement(By.id("cars"));
		
		
		Select cars=new Select(s1);
		System.out.println(cars.isMultiple());
		cars.selectByContainsVisibleText("Sa");
		cars.selectByIndex(0);
		cars.selectByValue("opel");
		cars.selectByVisibleText("Audi");
		
		cars.deselectByIndex(0);
		cars.deSelectByContainsVisibleText("Au");
		cars.deselectByValue("opel");
		cars.deselectByVisibleText("Saab");
		
	
		cars.selectByContainsVisibleText("Sa");
		cars.selectByIndex(0);
		
		
		List<WebElement> allitems=cars.getAllSelectedOptions();
		for(WebElement item:allitems) {
			System.out.println(item.getText());
		}
		WebElement wrapelement=cars.getWrappedElement();
		System.out.println(wrapelement.getText());
		

	}

}
