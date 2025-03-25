package Testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import GenericUtils.Baseclass;
import POMpages.Login;




public class logintest extends Baseclass {
	
	@Test
	
	public void login() throws Throwable {
		
		Login lo=new Login(driver);
		
		lo.getClickontheusernametxtfield().sendKeys("Rojas");
		lo.getClickonthepasswordnametxtfield().sendKeys("Abcd@1234");
		//lo.getClickontheloginbtn().click();
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		 
		Thread.sleep(8000);
		lo.getScroll(driver);		
		
		
		Thread.sleep(7000);
		String er = lo.getClickontheoddspan().getText();
		lo.getClickontheoddspan().click();
	
		int num = (int) Double.parseDouble(er); 
		if(!((num%2)==0)) {
			lo.getClickontheplacebet().click();
          Thread.sleep(4000);
			String we = lo.getTicketnumber().getText();
			
			
		System.out.println(we);
		lo.getClickonthecrossicon().click();
		lo.getClickontheticketnumtxtfield().sendKeys("we");
		}
		
		
		
		
		
	       
		
	}

}
