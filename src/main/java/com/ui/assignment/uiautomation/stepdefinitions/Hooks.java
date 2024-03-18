package com.ui.assignment.uiautomation.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.ui.assignment.uiautomation.context.SpringContext;
import com.ui.assignment.uiautomation.utils.CommonUtils;
import com.ui.assignment.uiautomation.utils.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
@CucumberContextConfiguration
public class Hooks extends CommonUtils {
	
	/*
	 * @Value("{browserType:}") private String browserType;
	 */

	@Before
	public void setUp() {
		//loadProperties();
		TestBase.getDriver("chrome");
	}
	
	@After
	public void tearDown() {
		tearbrowser();
	} 

}
