package com.e2eTest.automation1.step_definitions;

import org.junit.Assert;


import com.e2eTest.automation1.page_objects.CatalogPage;
import com.e2eTest.automation1.utils.ConfigFileReader;
import com.e2eTest.automation1.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogStepDefinition {

	private CatalogPage catalogPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;

	public CatalogStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
		configFileReader = new ConfigFileReader();

	}

	@When("Je clique sur le bouton Catalog")
	public void jeCliqueSurLeBoutonCatalog() {
		seleniumUtils.click(CatalogPage.getBtnCatalog());

	}

	@When("Je me redirige vers la liste deroulante")
	public void jeMeRedirigeVersLaListeDeroulante() {
		

	}

	@When("Je clique sur le bouton Products")
	public void jeCliqueSurLeBoutonProducts() {
		seleniumUtils.click(CatalogPage.getBtnProducts());

	}
	@When("Je saisis le nom de produit {string}")
	public void jeSaisisLeNomDeProduit(String string) {	
}
	@When("Je clique sur le bouton Search")
	public void jeCliqueSurLeBoutonSearch5() {
		seleniumUtils.click(CatalogPage.getBtnSearchProducts());
	}

}
