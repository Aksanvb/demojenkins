package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class DuplicateLeadPage extends ProjectSpecificMethods {


	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
			
	}


	
	public ViewLeadPage clickCreateLeadDublicate(){
		click(locateElement("class","smallSubmit"));
		System.out.println("Duplicated the lead successfully");
		System.out.println("Learning conflict");
		return new ViewLeadPage(driver, node);
	}
}
