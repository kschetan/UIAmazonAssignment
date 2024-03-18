package com.ui.assignment.uiautomation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import com.ui.assignment.uiautomation.utils.CommonUtils;
import com.ui.assignment.uiautomation.utils.TestBase;

@Component
public class HomePage extends TestBase {

	private static final String SEARCH_ITEM = "//*[@id='twotabsearchtextbox']";
	private static final String ITEM_ORDER = "//div[@*='s-search-result'][%s]";
	
	/*
	 * public HomePage(WebDriver driver) { super(driver); }
	 */
	public boolean searchItem(String item) {
		cUtils.getWebElement("xpath", SEARCH_ITEM).click();
		cUtils.getWebElement("xpath", SEARCH_ITEM).sendKeys(item);
		cUtils.getWebElement("xpath", SEARCH_ITEM).sendKeys(Keys.ENTER);
		return cUtils.getWebElement("xpath", ITEM_ORDER).isDisplayed();
	}
	
	public void selectSearchProducts(int orderItem) {
		cUtils.scrollToElement(driver.findElement(By.xpath(String.format(ITEM_ORDER, orderItem))));
		driver.findElement(By.xpath(String.format(ITEM_ORDER, orderItem))).click();
	}
}
