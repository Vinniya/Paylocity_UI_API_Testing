package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Readconfig;
import utilities.Waits;

public class LoginPage {
	Waits wait = new Waits();
	System.setProperty("webdriver.chrome.driver","/Paylocity/drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	WebElement username_id = "Username";
	WebElement password = "Password";
	WebElement loginButton = "//button[text()='Log In']";
	WebElement dashboardTitle = driver.findElement(By.xpath("//a[text()='Paylocity Benefits Dashboard']"));

	Readconfig config = new Readconfig();
	private String baseURL = config.getApplicationURL();
	private String usernameFromConfig = config.getUsername();
	private String passwordFromConfig = config.getPassword();

	String title = "Paylocity Benefits Dashboard";
	boolean result = false;

	public void getUrl() {
		driver.get(baseURL);
	}
	/*
	 * Enter paylocity credentials 
	 * Date: 
	 * Owner: Vinniya
	 */

	public void enterCredentials() {
		
	   driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	   
	   wait.elementIsVisible_id(username_id);
	   driver.findElement(By.id(username_id).sendkeys(usernameFromConfig);
	   
	   wait.elementIsVisible_id(password);
	   driver.findElement(By.id(password).sendkeys(passwordFromConfig);
   }

	/*
	 * Click Login button 
	 * Date: 
	 * Owner: Vinniya 
	 * return true if user able to login
	 */
	public boolean clickLoginButton() {
		
	   try {
		   wait.elementIsVisible_xpath(loginButton);
		   driver.findElement(By.xpath(loginButton).click();
		   driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		   return true;
	   } catch (Exception e) {
		   return false;
	   }
	  
   }

	/*
	 * Get Dashboard Title 
	 * Date: 
	 * Owner: Vinniya 
	 * @return true if title matches
	 */

	public boolean getDashboardTitle() {
		if (dashboardTitle.getText() == title)
			result = true;
		return result;
	}

}
