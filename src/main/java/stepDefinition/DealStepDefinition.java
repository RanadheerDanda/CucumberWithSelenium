//package stepDefinition;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class DealStepDefinition {
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
//	public void user_enters_username_and_password(DataTable Credentials)  {
//		List<List<String>> loginList=Credentials.raw();
//		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.name("username")).sendKeys(loginList.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(loginList.get(0).get(1));
//	}
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
//	 @Then("^user moves to new deal page$")
//	 public void user_moves_to_new_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//		
//		}
//	 
//	 
//	 @Then("^user enters deal details$")
//	 public void user_enters_contacts_details(DataTable dealData){
//		 List<List<String>> dealValues =  dealData.raw();
//		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
//		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
//		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
//		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
//		 driver.findElement(By.className("button")).click();
////		 driver.findElement(By.id("title")).sendKeys(dealValues.get(1).get(0));
////		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(1).get(1));
////		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(1).get(2));
////		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(1).get(3));
////		 driver.findElement(By.className("button")).click();
//	 }
//}
//	 
//	 
