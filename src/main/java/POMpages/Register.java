package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement clickontheregisterbtn;
	
	@FindBy(xpath = "//input[@placeholder='Enter First Name']")
	private WebElement clickontheenerfirstnametxtfield;
	
	
	@FindBy(xpath = "//input[@placeholder='Enter Last Name']")
	private WebElement clickontheenerlastnametxtfield;
	
	@FindBy(xpath = "//input[@placeholder='Enter Username']")
	private WebElement clickontheusernametxtfield;
	
	@FindBy(xpath = "//div[@class='flag ng']")
	private WebElement clickontheflagng;
	
	
	@FindBy(xpath = "//input[@placeholder='Phone No']")
	private WebElement clickonthephoneno;
	
	@FindBy(xpath = "//input[@autocomplete='new-password']")
	private WebElement clickonthenewpasswordtextfield;
	
	@FindBy(xpath = "//input[@name='checkbox']")
	private WebElement clickonthecheckbox;
	
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement clickontheregister;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement clickontheotpfirstone;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement clickontheotpsecondone;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement clickontheotpthirdone;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement clickontheotpfourthone;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	private WebElement clickontheotpfifthone;
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement clickontheotpsixone;
	
	@FindBy(xpath = "//button[text()='Verify OTP']")
	private WebElement clickontheverifyotpbtn;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]")
	private WebElement clickonthelogoutbtn;
	
	
	
	
	public Register(WebDriver driver) {
		PageFactory.initElements(driver,this);
			
		}

   public WebElement getClickontheregisterbtn() {
		return clickontheregisterbtn;
	}

   public WebElement getClickontheenerfirstnametxtfield() {
		return clickontheenerfirstnametxtfield;
	}

public WebElement getClickontheenerlastnametxtfield() {
	return clickontheenerlastnametxtfield;
}

public WebElement getClickontheusernametxtfield() {
	return clickontheusernametxtfield;
}

public WebElement getClickontheflagng() {
	return clickontheflagng;
}

public WebElement getClickonthephoneno() {
	return clickonthephoneno;
}

public WebElement getClickonthenewpasswordtextfield() {
	return clickonthenewpasswordtextfield;
}

public WebElement getClickonthecheckbox() {
	return clickonthecheckbox;
}

public WebElement getClickontheregister() {
	return clickontheregister;
}

public WebElement getClickontheotpfirstone() {
	return clickontheotpfirstone;
}

public WebElement getClickontheotpsecondone() {
	return clickontheotpsecondone;
}

public WebElement getClickontheotpthirdone() {
	return clickontheotpthirdone;
}

public WebElement getClickontheotpfourthone() {
	return clickontheotpfourthone;
}

public WebElement getClickontheotpfifthone() {
	return clickontheotpfifthone;
}

public WebElement getClickontheotpsixone() {
	return clickontheotpsixone;
}

public WebElement getClickontheverifyotpbtn() {
	return clickontheverifyotpbtn;
}

public WebElement getClickonthelogoutbtn() {
	return clickonthelogoutbtn;
}
	
	


}



