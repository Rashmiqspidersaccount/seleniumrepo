package Testngpackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Testngpackage.listners.class)

public class Sampletest   {
 
    
    private static final String[] sampl = null;

	@Test(invocationCount = 5,groups = "smoke")
	public void samplemethod(){
		
	System.out.println("No Hi");
		
	}
 
    @Test(priority = 2)
	public void samplemethod1(){
		
	System.out.println("Hi");
		
	}
    @Test
	public void samplemethod2(){
		
	System.out.println("Hi hi");
		
	}
	
    @Test(enabled=false)
	public void samplemethod3(){
		
	System.out.println("Hi hi hi");
		
	}

    @Test(dependsOnMethods=sample)
	public void Dependencymethod(){
		
	System.out.println("Dependency");
		
	}





}
