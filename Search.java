package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Search {
	WebDriver driver;
	 
	By u=By.id("twotabsearchtextbox");
	By l=By.xpath("//input[@value='Go']");
	By t=By.xpath("//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2");
	By Kindle_Book=By.id("add-to-cart-button");
	//By add_card=By.xpath("//*[@id='mediaTab_heading_1']/a/span/div[1]/span");
	
	 public Search(WebDriver driver){
		 
	        this.driver = driver;
	 	    }
	 
	//Search in textbox
	 
	    public void setUserName(String strUserName){
	 
	        driver.findElement(u).sendKeys(strUserName);;
	 	    }
	  
	    //Click on GO button
	 
	    public void clickgo(){
	 
	            driver.findElement(l).click();
	 	    }
	    public void clicklink(){
	   	 
            driver.findElement(t).click();
 	    }
	    
	    public void KindleBook()
	    {
	    	driver.findElement(Kindle_Book).click();
	    }
	    
	    public void add_card()
	    {
	    	//driver.findElement(add_card).click();
	    }
	  //Get the title of Login Page
 
	 public void verifyTitle(String title)
		{
			if(driver.getTitle().equals(title))
			{
				Reporter.log(title+" displayed");
				System.out.println(title+" displayed");
			}
			else
			{
				Reporter.log("Failed to display "+title);
				System.out.println("Failed to display "+title);
				//return;
			}
		}

	 	    public void login(String strUserName){
	    		 
	        this.setUserName(strUserName);
	 	    this.clickgo();  
	        this.clicklink(); 
	        this.KindleBook();
	        this.add_card();
	 
	        
	 
	    }
	 }
