package org.cucuD2;

import org.baseClass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void befsec() {

		openChromeBrowser();
		launchUrl("https://www.facebook.com/login/");
		maximize();
	}

	@After
	public void aftsec() {
		closeEntierBrowser();
	}

}