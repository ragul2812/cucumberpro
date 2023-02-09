package org.pom;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;

public class Adatintask extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		openChromeBrowser();
		launchUrl("https://adactinhotelapp.com/index.php");
		maximize();

		Pojo1 p1 = new Pojo1();

		fillTextBox(p1.getUser(), "ragul2812");

		fillTextBox(p1.getPass(), "123321");

		p1.getLog().click();

		Pojo2 p2 = new Pojo2();

		WebElement con = p2.getContry();
		fillTextBox(con, "London");

		WebElement hot = p2.getHotel();
		fillTextBox(hot, "Hotel Cornice");

		WebElement noRoom = p2.getNoRoom();
		fillBox(noRoom, "1");

		WebElement room = p2.getRoom();
		fillTextBox(room, "Double");

		WebElement inDate = p2.getInDate();
		fillTextBox(inDate, "01/11/2022");

		WebElement outDate = p2.getOutDate();
		fillTextBox(outDate, "20/11/2022");

		WebElement adRoom = p2.getAdRoom();
		fillBox(adRoom, "2");

		WebElement chRoom = p2.getChRoom();
		fillBox(chRoom, "0");

		WebElement sub = p2.getSub();
		ClickButton(sub);

		Pojo3 p3 = new Pojo3();

		WebElement btn2 = p3.getBtn();
		ClickButton(btn2);

		WebElement con2 = p3.getCon();
		ClickButton(con2);

		Pojo4 p4 = new Pojo4();

		WebElement fname = p4.getFname();
		fillTextBox(fname, "ragul");

		WebElement lName = p4.getlName();
		fillTextBox(lName, "devaraj");

		WebElement add = p4.getAdd();
		fillTextBox(add, "no 13 vandipalyathamman koil st, mattanodai");

		WebElement no = p4.getcNo();
		fillTextBox(no, "1234567890234567");

		WebElement type = p4.getType();
		fillTextBox(type, "VISA");

		WebElement mon = p4.getMon();
		fillTextBox(mon, "may");

		WebElement year = p4.getYear();
		fillTextBox(year, "2023");

		WebElement cvv = p4.getCvv();
		fillTextBox(cvv, "123");

		WebElement click = p4.getClick();
		ClickButton(click);
		holdPrg(2000);

		Pojo5 p5 = new Pojo5();

		WebElement bookNo = p5.getBookNo();
		System.out.println(bookNo);

	}
}