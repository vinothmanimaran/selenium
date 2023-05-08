package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbRegistration extends BaseClass {
    
	FbLoginPojo f;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	    launchbrowser();
	    WindowMaximize();
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
		
	   launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
	    
		f=new FbLoginPojo();
		clickBtn(f.getCreateNewAcc());
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
	    Thread.sleep(3000);	
	    Map<String,String > m= d.asMap(String.class,String.class);
	    f=new FbLoginPojo();
	    passText(m.get("firstname3"),f.getFirstNameTextBox());
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
	    f=new FbLoginPojo();
	    passText("manimaran",f.getSecondNameTextBox());
	}

	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
		
		List<Map<String,String>> m=d.asMaps();
		f=new FbLoginPojo();
	    passText(m.get(1).get("password1"),f.getMobileorEmailTextBox());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
	     
		f=new FbLoginPojo();
		passText("vino123",f.getNewPassword());
	}

	@Then("TO close the chrome browser")
	public void to_close_the_chrome_browser() {
	    //closeEntireBrowser();
	}


}
