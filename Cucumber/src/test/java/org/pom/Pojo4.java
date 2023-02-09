package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo4 extends org.baseClass.BaseClass {

public Pojo4() {

	PageFactory.initElements(driver, this);
}
	
	@FindBy(id = "first_name")
	private WebElement fname;

	@FindAll({

			@FindBy(name = "last_name"), @FindBy(xpath = "(//input[@type='text'])[12]") })
	private WebElement lName;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement add;
	
		@FindBy(id="cc_num")
	private WebElement cNo;
	
		@FindBy(id="cc_type")
	private WebElement type;
	
	@FindBy(id = "cc_exp_month")
	private WebElement mon;
	
	@FindBy(id = "cc_exp_year")
	private WebElement year;
	
	@FindBy(id= "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement click;
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getcNo() {
		return cNo;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getMon() {
		return mon;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getClick() {
		return click;
	}	
	
	
	
	
}
