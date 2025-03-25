package POMpages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Login {
	
	
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement clickontheusernametxtfield;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement clickonthepasswordnametxtfield;
	
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement clickontheloginbtn;

	
	@FindBy(xpath = "//label[text()='TICKET NUMBER']")
	private WebElement scroll;

	@FindBy(xpath = "//div[@data='1']//child::span")
	private WebElement clickontheoddspan;
	
	@FindBy(xpath = "//button[text()='Place bet']")
	private WebElement clickontheplacebet;
	
	@FindBy(xpath = "//div[@class='MuiStack-root css-slrwpk']")
	private WebElement clickontheplacebetbtn;
	
	@FindBy(xpath = "//div[text()='Matches are not found.']")
	private WebElement matchesarenotfound;
	
	@FindBy(xpath = "//h3[text()='Bet Ticket Number :']/following-sibling::h1")
	private WebElement ticketnumber;
	
	
	@FindBy(xpath = "//*[@class='MuiOutlinedInput-notchedOutline css-igs3ac']")
	private WebElement clickontheticketnumtxtfield;
	
	
	@FindBy(xpath = "(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[14]")
	private WebElement clickonthecrossicon;
	

	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
			
		}

	
		 public WebElement getClickontheusernametxtfield() { return
		  clickontheusernametxtfield; }
		  
		  public WebElement getClickonthepasswordnametxtfield() { return
		  clickonthepasswordnametxtfield; }
		  
		  public WebElement getClickontheloginbtn() { return clickontheloginbtn; }
		  
		  public void getScroll(WebDriver driver) { ((JavascriptExecutor)
		  driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
		  scroll.click(); }
		  
		  public WebElement getClickontheoddspan() { return clickontheoddspan; }
		  
		  public WebElement getClickontheplacebet() { return clickontheplacebet; }
		  
		  public WebElement getClickontheplacebetbtn() { return clickontheplacebetbtn;
		  }
		  
		  public WebElement getMatchesarenotfound() { return matchesarenotfound; }
		  
		  public WebElement getTicketnumber() { return ticketnumber; }
		  
		  public WebElement getClickontheticketnumtxtfield() { return
		  clickontheticketnumtxtfield; }
		  
		  public WebElement getClickonthecrossicon() { return clickonthecrossicon; }
		  
		

}
