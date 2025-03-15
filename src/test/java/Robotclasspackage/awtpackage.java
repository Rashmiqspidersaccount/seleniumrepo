package Robotclasspackage;
import java.awt.*;
import java.awt.event.*;

public class awtpackage {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

        Robot r=new Robot();
        //capslock on
        r.keyPress(KeyEvent.VK_CAPS_LOCK);
        r.keyRelease(KeyEvent.VK_CAPS_LOCK);
        
        
        r.keyPress(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_R);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_S);
        r.keyPress(KeyEvent.VK_H);
        r.keyRelease(KeyEvent.VK_H);
        r.keyPress(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_M);
        r.keyPress(KeyEvent.VK_I);
        r.keyRelease(KeyEvent.VK_I);
        
	}

}
