package utilities;

public class Waits {
	
	public void elementIsVisible_xpath(WebElement xpath) {

	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void elementIsVisible_id(WebElement id) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		}
}
