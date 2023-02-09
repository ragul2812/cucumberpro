package org.stepdefinition;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.Pojo1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	Pojo1 p;
	@Given("User have to eter fb login page")
	public void user_have_to_eter_fb_login_page() {

		openChromeBrowser();
		launchUrl("https://adactinhotelapp.com/index.php");
		maximize();
	}

	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {

		 p =new Pojo1();
		WebElement txtemail = p.getUser();
		fillTextBox(txtemail, "ragul@gamil.com");
		WebElement pass = p.getPass();
		fillTextBox(pass, "123456777");
		
//		WebElement txt = driver.findElement(By.id("email"));
//		fillTextBox(txt, "ragul@gmail.com");
	//	WebElement pwd = driver.findElement(By.id("pass"));
//		fillTextBox(pwd, "1234567");

	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {

		WebElement log = p.getLog();
		ClickButton(log);
		
		//WebElement btn = driver.findElement(By.name("login"));
		//ClickButton(btn);
	}

	@Then("User have to be in invalid credentials page")
	public void user_have_to_be_in_invalid_credentials_page1() {

		System.out.println("Error page");
	}
	@Given("User have to enter facebook login page")
	public void user_have_to_enter_facebook_login_page() {
	
		openChromeBrowser();
		launchUrl("https://www.facebook.com/login/");
		maximize();
	}

	@Given("user have to click forgotten password")
	public void user_have_to_click_forgotten_password() throws InterruptedException {
	
	WebElement clk = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
	clk.click();
	holdPrg(3000);
	}

	@When("User have to enter email")
	public void user_have_to_enter_email() {
	
	WebElement txtEmail = driver.findElement(By.name("email"));
	txtEmail.sendKeys("ragul123@gmail.com");
	
	}

	@When("User have to click search button")
	public void user_have_to_click_search_button() {
	
	WebElement clkSearch = driver.findElement(By.id("did_submit"));
	clkSearch.click();
	}

	@Then("User have to be in invalid credentials page")
	public void user_have_to_be_in_invalid_credentials_page() {
	
	System.out.println("recover");
	}



}
