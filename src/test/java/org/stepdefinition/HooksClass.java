package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{

	@Before 
	private void precondition2() {
         launchbrowser();
         WindowMaximize();
	}
	@After
	private void postcondition2() {
		closeEntireBrowser();
	}
	
}
