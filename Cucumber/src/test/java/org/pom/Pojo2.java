package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2 extends org.baseClass.BaseClass {

	public Pojo2() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement Contry;

	@FindBy(id = "hotels")
	private WebElement Hotel;

	@FindBy(name = "room_type")
	private WebElement Room;

	@FindBy(name = "room_nos")
	private WebElement noRoom;

	@FindBy(id = "datepick_in")
	private WebElement inDate;

	@FindBy(id="datepick_out")
	private WebElement outDate;

	@FindBy(id = "adult_room")
	private WebElement adRoom;

	@FindBy(id = "child_room")
	private WebElement chRoom;

	@FindBy(id = "Submit")
	private WebElement sub;

	public WebElement getContry() {
		return Contry;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoom() {
		return Room;
	}

	public WebElement getNoRoom() {
		return noRoom;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdRoom() {
		return adRoom;
	}

	public WebElement getChRoom() {
		return chRoom;
	}

	public WebElement getSub() {
		return sub;
	}

}
