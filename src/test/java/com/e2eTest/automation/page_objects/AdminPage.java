package com.e2eTest.automation.page_objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AdminPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//aside[@class='oxd-sidepanel']//li[1]")
	private static WebElement menu_admin;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private static WebElement user;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement search;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-table-card']//div[2]//div[1]")
	private static WebElement search_admin;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add']")
	private static WebElement btn_add;

	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	private static WebElement user_role;

	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]")
	private static WebElement select_status;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement mot_de_passe;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type for hints...']")
	private static WebElement employee_name;

	@FindBy(how = How.XPATH, using = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private static WebElement utilisateur;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement confirm_mot_de_passe;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']")
	private static WebElement btn_save;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'chaima')]")
	private static WebElement result_user;

	public AdminPage() {

		super(Setup.getDriver());
	}

	public void clickMenuAdmin() {

		menu_admin.click();
	}

	public void fillUser(String name) {

		user.sendKeys(name);
	}

	public void clickSearch() {

		search.click();
	}

	public String getAdmin() {

		return search_admin.getText();
	}

	public void clickBtnAdd() {

		btn_add.click();
	}

	public void clickUserRole() {

		Actions actions = new Actions(driver);
		user_role.click();
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	public void clickStatus() {

		Actions actions = new Actions(driver);
		select_status.click();
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	public void clickEmployeeName() {
		Actions actions = new Actions(driver);
		employee_name.click();
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	public void fillEmployeeName(String employee) {
		
		employee_name.sendKeys(employee);
		
	}

	public void fillUtilisateur(String uti) {

		utilisateur.sendKeys(uti);
	}

	public void fillMotDePasse(String pwd) {

		mot_de_passe.sendKeys(pwd);
	}

	public void fillConfirmPassword(String conf) {

		confirm_mot_de_passe.sendKeys(conf);
	}

	public void clickSave() {

		btn_save.click();
	}

	public String getResultAdd() {

		return result_user.getText();
	}

}
