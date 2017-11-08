package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class HomePage2 {

	WebDriver driver;
	 
    By homePageUserName = By.xpath("//*[@id='productTitle']");
  
    public HomePage2(WebDriver driver){
 
        this.driver = driver;
     }
    
       public boolean verifySignInPageText() {
		WebElement element = driver.findElement(homePageUserName);
		String pageText = element.getText();
		Reporter.log(pageText);
		String expectedPageText = "Mastering Selenium WebDriver";
		return pageText.contains(expectedPageText);
	}
 
}
