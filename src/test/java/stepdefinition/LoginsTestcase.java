package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginsTestcase {
	public WebDriver driver;
	@Given("open the browser and enter the url of appplication")
	public void open_the_browser_and_enter_the_url_of_appplication() {
	 WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoapp.skillrary.com/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	}

	@When("click on login button enter the valid username and password")
	public void click_on_login_button_enter_the_valid_username_and_password() {
	  driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
	  driver.findElement(By.id("email")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("admin");
	
	}

	@Then("clcik on login button home page should be dispalyed")
	public void clcik_on_login_button_home_page_should_be_dispalyed() {
		 driver.findElement(By.name("login")).click();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
	}


}
