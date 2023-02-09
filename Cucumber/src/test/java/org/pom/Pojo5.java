package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo5 extends org.baseClass.BaseClass {

	public Pojo5() {

		PageFactory.initElements(driver, this);
	}

	public WebElement getBookNo() {
		return bookNo;
	}

	@FindBy(id = "order_no")
	private WebElement bookNo;

}
