package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	ConfigFileReader configFileReader;
	LoginPage loginPage;

	public LoginStepDefinition() {

		configFileReader = new ConfigFileReader();
		loginPage = new LoginPage();
		
	}

	@Given("Je me connecte sur l application Orange")
	public void jeMeConnecteSurLApplicationOrange() throws InterruptedException {

		Setup.getDriver().get(configFileReader.getProperty("home.url"));
		Thread.sleep(3000);

	}

	@When("Je saisis le username {string}")
	public void jeSaisisLeUsername(String username) {
		
		loginPage.fillUsername(username);

	}

	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		
		loginPage.fillPassword(password);

	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		
		loginPage.clickBtnLogin();

	}

	@Then("Redirection vers la page Dashboard {string}")
	public void redirectionVersLaPageDashboard(String title) throws InterruptedException {
		
		Thread.sleep(3000);
		String txtPage = loginPage.getDashboardTitle();
		Assertions.assertEquals(title, txtPage);

	}

}
