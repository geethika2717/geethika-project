package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Addcart {

WebDriver driver;
By homePageUserName = By.xpath("//*[@id='huc-v2-order-row-confirm-text']/h1");
  
    public Addcart(WebDriver driver){
 
        this.driver = driver;
     }
    
       public boolean verifySignInPageText() {
		WebElement element = driver.findElement(homePageUserName);
		String pageText = element.getText();
		String expectedPageText = "Added to Cartr";
		Reporter.log(pageText);
		return pageText.contains(expectedPageText);
	}

}












