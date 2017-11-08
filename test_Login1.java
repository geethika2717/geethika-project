package PageFactory;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage1;
import pages.HomePage2;
import pages.Search;


public class test_Login1 {
	
			 WebDriver driver;
			 
			 Search objsearch;
			 
			 HomePage1 objHomePage;
			 HomePage2 objHomePage2;	    
			 
			    @BeforeTest
			 
			    public void setup(){
			 
			    	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
			    	driver=new ChromeDriver();
			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			        driver.get("https://www.amazon.com/");
			 
			    }
			    			 
			    @Test(priority=0)
			 
			    public void Home_Page(){
			 			       		 
			    objsearch=new Search(driver);	
			    	
			    //Verify page title
		    	objsearch.verifyTitle("Online Shopping: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"); 
			 		    	
			 String Text="Mastering Selenium WebDriver";
			 
			 objsearch.login(Text);
			   // go the next page
			   objHomePage = new HomePage1(driver);
			   objHomePage2=new HomePage2(driver);			   			 
			    }
			
		}
