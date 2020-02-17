package stepDefinition;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import helpers.Constant;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;	


public class Steps{	
	WebDriver driver = null;
     
    @Given("^Open the Chrome and launch the application$")				
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {		 
    	System.setProperty("webdriver.chrome.driver", "C://Users//Menu PC//Desktop//Drivers//chromedriver_win32//chromedriver.exe");					
    	driver= new ChromeDriver();	
//    	System.setProperty("webdriver.gecko.driver", "C://Users//User//Desktop//Menusha//Eclipse_JavaProject_1_22_2020//jars//geckodriver.exe");					
//    	driver = new FirefoxDriver();
    	
    	Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.phptravels.net/login");
        Thread.sleep(1000);
    }		

    @When("^Enter valid Username and valid Password$")					
    public void enter_the_valid_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.name("username")).sendKeys("user@phptravels.com");							
       driver.findElement(By.name("password")).sendKeys("demouser");							
    }	
    @When("^Enter invalid Username and valid Password$")					
    public void enter_invalid_Username_and_Valid_Password() throws Throwable 							
    {		
       driver.findElement(By.name("username")).sendKeys("1user@phptravels.com");							
       driver.findElement(By.name("password")).sendKeys("demouser");							
    }
    @When("^Enter valid Username and invalid Password$")					
    public void enter_valid_Username_and_invalid_Password() throws Throwable 							
    {		
       driver.findElement(By.name("username")).sendKeys("user@phptravels.com");							
       driver.findElement(By.name("password")).sendKeys("lo&4");							
    }
    @When("^Enter empty Username and empty Password$")					
    public void enter_empty_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.name("username")).sendKeys("");							
       driver.findElement(By.name("password")).sendKeys("");							
    }

    @Then("^Click on the login button$")					
    public void Click_on_the_login_button() throws Throwable 							
    {	
       driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();	
       Thread.sleep(1000);
       
    }
    @Then("^Verify message and close the browser$")					
    public void Verify_error_alert_and_close_the_browser() throws Throwable 							
    {	
        driver.quit();    
    }
    @Then("^Verify user logout succesfully$")					
    public void Verify_user_logout() throws Throwable 							
    {	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']")).click();	
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();	    	
      	Thread.sleep(2000);
        driver.quit();    
    }

// My profile test cases
    @Then("^Verify my profile edit$")					
    public void Verify_myprofile() throws Throwable 							
    {	
    	driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
    	
    	Thread.sleep(1000);
        driver.quit();  
    }

}
