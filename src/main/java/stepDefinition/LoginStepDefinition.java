//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinition {
//
//	WebDriver driver;
//
//	@Given("^User is already on login page$")
//	public void user_is_already_on_login_page(){
//		// Write code here that turns the phrase above into concrete actions
//		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-3.141.59\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://classic.crmpro.com/index.html");
//
//	}
//
//	@When("^title of Login page is Free CRM$")
//	public void title_of_Login_page_is_Free_CRM() {
//		// Write code here that turns the phrase above into concrete actions
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//	}
//
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password()  {
//		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.name("username")).sendKeys("Dranadheer");
//		driver.findElement(By.name("password")).sendKeys("test@1234");
//	}
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String username, String password) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	} 
//	
//	/*	
//	 Reg Exp:
//	 1. \"([^\"]*)\"
//	 2. \"(.*)\"
//*/	
//	
//	
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()  {
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//		String title = driver.getTitle();
//		System.out.println("Home Page title ::" + title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//
//	@Then("^Close the browser$")
//	public void close_the_browser() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		driver.quit();
//	}
//
//	 @Then("^user moves to new contact page$")
//	 public void user_moves_to_new_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//		
//		}
//	 
//	 
//	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_contacts_details(String firstname, String lastname, String position){
//		 driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	 }
//}
