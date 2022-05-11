package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class CreateLeadPage extends ProjectSpecificMethods {


	public CreateLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
				
	}

	
	public CreateLeadPage enterCompanyName(String comnyName){
		clearAndType(locateElement("id","createLeadForm_companyName"), comnyName);

		System.out.println("Resolving conflict");
		System.out.println("Enter the name");

		return this;

	}

	

	public CreateLeadPage enterFirstName(String firstName){
		clearAndType(locateElement("id","createLeadForm_firstName"), firstName);
		System.out.println("Enter the first name");
		return this;
	}


	public CreateLeadPage enterLastName(String lastName){
		clearAndType(locateElement("id","createLeadForm_lastName"), lastName);
		System.out.println("Enter the last name");
		return this;

	}

	
	public ViewLeadPage clickCreateLeadSubmit(){
		click(locateElement("class","smallSubmit"));
		return new ViewLeadPage(driver, node);
	}
	
	
	public CreateLeadPage enterEmail(String eMail){
		clearAndType(locateElement("id","createLeadForm_primaryEmail"), eMail);
	
		return this;
	}
}
