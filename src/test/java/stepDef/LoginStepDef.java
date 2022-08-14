package stepDef;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("user navigate landing page")
    public void user_navigate_landing_page() {
        loginPage.landLoginPage();

    }

    @When("enter valid credemtials and click login")
    public void enter_valid_credemtials_and_click_login() {

    }

    @Then("verify welcome message")
    public void verify_welcome_message() {

}

}
