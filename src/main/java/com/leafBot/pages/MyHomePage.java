package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class MyHomePage extends ProjectSpecificMethods{
	
	
	public MyHomePage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		
	}
	
	public MyLeadsPage clickLeadLink() {
		
		click(locateElement("link","CRM/SFA"));
		return new MyLeadsPage(driver,node);
	}






}


