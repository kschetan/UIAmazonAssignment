package com.ui.assignment.uiautomation.action;

import static org.assertj.core.api.Assertions.assertThat;
//import  org.junit.Assert.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.ui.assignment.uiautomation.pom.CartPage;
import com.ui.assignment.uiautomation.pom.HomePage;
import com.ui.assignment.uiautomation.pom.InitPages;
import com.ui.assignment.uiautomation.pom.ProductPage;
import com.ui.assignment.uiautomation.utils.TestBase;
import com.ui.assignment.uiautomation.utils.CommonUtils;

public class PageAction extends InitPages{
	CommonUtils cUtils= new CommonUtils(); 
	//TestBase tb = new TestBase();
	/*
	 * @Autowired CommonUtils commonAction;
	 * 
	 * @Autowired TestBase browserHelper;
	 * 
	 * @Autowired HomePage homePage;
	 * 
	 * @Autowired ProductPage productPage;
	 * 
	 * @Autowired CartPage cartPage;
	 */
	

	
	/*
	 * public void navigateHomePage(String url, String browserType) {
	 * browserHelper.getBrowser(browserType); commonAction.launchWebUrl(url); }
	 * 
	 * public void searchItem(String item, String browserType) { // HomePage
	 * homePage = new HomePage(driver);
	 * pomService.getHomePage(browserHelper.getBrowser(browserType));
	 * homePage.searchItem(item); assertThat(homePage.searchItem(item)).
	 * withFailMessage("Lists of < %s > is not displyed in search result", item)
	 * .isTrue(); }
	 */
	/*
	 * public void openBrowrser(String browserType) { //
	 * cUtils.driver.get(System.getProperty("https://amazon.in"));
	 * 
	 * cUtils.getBrowser(browserType); }
	 */

	
	public void navigateHomePage() {
	//	cUtils.driver.get(System.getProperty("https://amazon.in"));
		
		cUtils.driver.get("https://amazon.in");
	}
	
	public void searchItem( String item) {
		//HomePage homePage = new HomePage(driver);
		homePage.searchItem(item);
		assertThat(homePage.searchItem(item)).withFailMessage("Lists of < %s > is not displyed in search result", item).isTrue();
	}

	public void selectOrderItem(int orderItem) {	
		homePage.selectSearchProducts(orderItem);
	}
	
	public void getProductPrice(String itemPrice) {

		productPage.getProductPrice(itemPrice);
		assertThat(productPage.getProductPrice(itemPrice)).withFailMessage("Product price is not currectly captured")
				.isTrue();
	}
	
	public void addItemToCart() {	
		productPage.addToCart();
	}
	
	public void clickOnCart()
	{
		cartPage.clickOnCart();
	}
}
