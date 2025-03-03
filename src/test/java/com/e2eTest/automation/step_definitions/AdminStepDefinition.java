package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.AdminPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinition {

	AdminPage adminPage;

	public AdminStepDefinition() {

		adminPage = new AdminPage();
	}

	@When("Je clique sur le menu admin")
	public void jeCliqueSurAdmin() throws InterruptedException {
		Thread.sleep(9000);
		adminPage.clickMenuAdmin();

	}

	@When("Je saisis un Username {string}")
	public void jeSaisisUnUsername(String test) throws InterruptedException {
		Thread.sleep(9000);
		adminPage.fillUser(test);

	}

	@When("je clique sur le bouton Search")
	public void jeCliqueSurLeBoutonSearch() {
		adminPage.clickSearch();

	}

	@Then("Je vérifie l'affichage de user saisis {string}")
	public void jeVérifieLAffichageDeUserSaisis(String txt) throws InterruptedException {
		Thread.sleep(3000);
		String txtAdmin = adminPage.getAdmin();
		Assertions.assertEquals(txt, txtAdmin);

	}

	@When("Je cliquer sur le bouton Add")
	public void jeCliquerSurLeBoutonAdd() throws InterruptedException {
		Thread.sleep(3000);
		adminPage.clickBtnAdd();
	}

	@When("Je selectionne le User Role")
	public void jeSelectionneLeUserRole() throws InterruptedException {
		Thread.sleep(6000);
		adminPage.clickUserRole();
	}

	@When("Je selectionne status")
	public void jeSelectionneStatus() throws InterruptedException {
		Thread.sleep(6000);
		adminPage.clickStatus();
	}
	
	@When("Je saisis un password {string}")
	public void jeSaisisUnPassword(String mdp) throws InterruptedException {
		Thread.sleep(6000);
		adminPage.fillMotDePasse(mdp);
	}

	@When("Je saisis employee Name {string}")
	public void jeSaisisEmployeeName(String emp) throws InterruptedException {
		Thread.sleep(9000);
		adminPage.fillEmployeeName(emp);
	}
	
	@When("Je clique sur employee Name")
	public void jeCliqueSurEmployeeName() throws InterruptedException {
		Thread.sleep(6000);
		adminPage.clickEmployeeName();
	}

	@When("je saisis le nom utilisateur {string}")
	public void jeSaisisLeNomUtilisateur(String util) throws InterruptedException {
		Thread.sleep(9000);
		adminPage.fillUtilisateur(util);
	}

	@When("je saisis confirm password {string}")
	public void jeSaisisConfirmPassword(String confpwd) throws InterruptedException {
		Thread.sleep(6000);
		adminPage.fillConfirmPassword(confpwd);
	}

	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() throws InterruptedException {
		Thread.sleep(6000);
		adminPage.clickSave();

	}

	@Then("Vérifier l'affichage du nouvel utilisateur {string}")
	public void vérifierLAffichageDuNouvelUtilisateur(String result) throws InterruptedException {
		Thread.sleep(6000);
		String txtNewUser = adminPage.getResultAdd();
		Assertions.assertEquals(result, txtNewUser);

	}

}
