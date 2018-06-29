package backend.DataProvider;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import backend.LoginPage.Login;
import backend.Stcwebelement.STCElement;

public class ExcelData {
	WebDriver driver;
	Login setup =new Login(null);
	
	@BeforeMethod
	public void beforeMethod() {
		Login setup =new Login(null);
		driver= setup.StcLogin(null);
	}


}
