package GenericUtils;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
public class Baseclass {
	
	
public WebDriver driver;
	
	@BeforeClass
	
	public void Lunchbrowser() {
		driver=new ChromeDriver();
		
        System.out.println("===========Browser Launch on Selenium Grid Successfully===========");

		driver.get("https://betmonkey.ng/");
		driver.manage().window().maximize();
		
	
	}

}



