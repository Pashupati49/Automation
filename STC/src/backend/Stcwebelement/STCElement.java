package backend.Stcwebelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class STCElement {
	WebDriver driver;
	
	public STCElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
//	*********** Start WebElement Deceleration **********************************************

	@FindBy(xpath="html/body/div[1]/div/div[2]/form/div/div/div[1]/div/input")
	WebElement enterEmailAddress;
	
	@FindBy(xpath="html/body/div[1]/div/div[2]/form/div/div/div[2]/div/input")
	WebElement enterPassword;
	
	@FindBy(xpath="html/body/div[1]/div/div[2]/form/div/div/div[3]/button")
	WebElement clickOnLoginBtn;
	
	@FindBy(xpath="html/body/div[1]/div[3]/div/div[6]/div/div/form/div[1]/div/input")
	WebElement enterEXcelFile;
	
	@FindBy(xpath="html/body/div[1]/div[3]/div/div[6]/div/div/form/div[2]/div/button")
	WebElement ClickOnUploadBtn;
	
//	******************* End WebElement Deceleration********************************************
	
//	******************* Start Function Deceleration ********************************************
	
	public void enterEmailAddress(String email) {
		enterEmailAddress.enterEmailAddress(email);
	}
	
	public void enterpassword(String password) {
		enterPassword.enterpassword(password);
	}
	
	public void clickOnSaveBtn() {
		clickOnLoginBtn.clickOnSaveBtn();
	}
	
	public void enterExcel(String path) {
		enterEXcelFile.enterExcel(path);
	}
	
	public void clickOnuploadBTn() {
		clickOnUploadBtn.clickOnuploadBTn();
	}
// ******************************End Function Deceleration **********************************************
	
}
