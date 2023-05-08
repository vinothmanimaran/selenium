package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {
     //1.Non Parameterized Constructor
	public FbLoginPojo() {
		PageFactory.initElements(driver,this); 
		
	}
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAcc;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement firstNameTextBox;
	
	@FindBy(name="lastname")
	private WebElement SecondNameTextBox;
	
	@FindBy(name="reg_email__")
	private WebElement mobileorEmailTextBox;
	
	@FindBy(name="reg_passwd__")
	private WebElement newPassword;

	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getSecondNameTextBox() {
		return SecondNameTextBox;
	}

	public WebElement getMobileorEmailTextBox() {
		return mobileorEmailTextBox;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

	public WebElement getLoginBtn() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}