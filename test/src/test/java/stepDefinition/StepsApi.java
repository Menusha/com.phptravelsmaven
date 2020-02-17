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
    public void addEmployee() throws Throwable 							
    {		
    	String addURI = "http://dummy.restapiexample.com/api/v1/create";
    	HttpHeaders headers = new HttpHeaders();
    	headers.add("Accept", "application/json");
    	headers.add("Content-Type", "application/json");
    	String jsonBody = "{\"name\":\"zozo100\",\"salary\":\"123\",\"age\":\"23\"}";
    	HttpEntity<String> entity = new HttpEntity<String>(jsonBody, headers);
    	RestTemplate restTemplate = new RestTemplate();
    	ResponseEntity<String> response =restTemplate.postForEntity(addURI, entity, String.class);
    	Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
    	Assert.assertTrue(responseBody.contains(employeeId));
    	
    }	
    @When("^Enter invalid Username and valid Password$")					
    public void getEmployee() throws Throwable 							
    {		
    	JSONParser parser = new JSONParser(); // Instantiate JSONParser object
    	JSONObject jsonResponseObject = new (JSONObject) parser.parse(jsonString); 
    	//Parse jsonString i.e. Response body string in json format to JSON object
    	String employeeId = jsonResponseObject.get("id").toString(); // Get id attribute
    }
    @When("^Enter valid Username and invalid Password$")					
    public void updateEmployee() throws Throwable 							
    {		
    	public void put(String url,Object request, Object... urlVariables)  throws RestClientException
    	public <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType, Object... urlVariables)
    	throws RestClientException
    }
    @When("^Enter empty Username and empty Password$")					
    public void deleteEmployee() throws Throwable 							
    {		
    	public void delete(String url, Object... urlVariables) throws RestClientException							
    }
    
}
