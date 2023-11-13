package com.e2eTest.automation1.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation1.utils.BasePage;
import com.e2eTest.automation1.utils.Setup;


public class CatalogPage extends BasePage {
	
	/* Retrieve web elements */
	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Dashboard']")
	private static WebElement Dashbord;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement btnCatalog;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement btnProducts;
	
	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement searchProductName;
	
	@FindBy(how = How.ID, using = "search-products")
	private static WebElement btnSearchProducts;
	
	
	public CatalogPage() {
		super(Setup.getDriver());
	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public static WebElement getDachboard() {
		return Dashbord;
	}
	
	public static WebElement getBtnCatalog() {
		return btnCatalog;
	}
	
	public static WebElement getBtnProducts() {
		return btnProducts;
	}
	
	public static WebElement getSearchProductsName()  {
		return searchProductName;

}
	
	public static WebElement getBtnSearchProducts()  {
		return btnSearchProducts;

}
}
