package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3 extends org.baseClass.BaseClass {

	public Pojo3() {

	PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement btn;

	@FindAll({

			@FindBy(id = "continue") })
	private WebElement con;

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getCon() {
		return con;
	}

}
