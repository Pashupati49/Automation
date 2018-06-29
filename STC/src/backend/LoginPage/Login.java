package backend.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	public WebDriver StcLogin(WebDriver driver) {

		System.setProperty("Webdriver.Chrome.driver", "./WebDrivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stc.ekbana.info/system/rawmessages/uploadExcel");
		return driver;
	}

	public String userEmail() {
		return ("demo@ekbana.com");
	}

	public String userpassword() {
		return ("Admin@123");
	}
}
