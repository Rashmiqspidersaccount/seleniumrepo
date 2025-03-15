package assertionconcept;

import static org.testng.Assert.assertEquals;

import java.security.PublicKey;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions1 {
@Test
public void Demotest() {
	
	System.out.println("1");
	System.out.println("2");
	
    Assert.assertEquals(1, 1);
	System.out.println("3");
	System.out.println("4");
	Assert.assertTrue(true);
	System.out.println("5");
}


@Test(priority = 1)
public void softassertiondemo() {
	
	SoftAssert s=new SoftAssert();
	
	System.out.println("1");
	System.out.println("2");
	s.assertEquals(0, 1);
	System.out.println("3");
	System.out.println("4");
	s.assertTrue(false);
	System.out.println("5");
	System.out.println("6");
	s.assertTrue(true);
	System.out.println("7");
	s.assertAll();
	
}

}
