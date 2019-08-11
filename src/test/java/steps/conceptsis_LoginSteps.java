package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.ConceptsisHomePage;
import utilities.Config;
import utilities.Driver;

public class conceptsis_LoginSteps {

    ConceptsisHomePage homePage = new ConceptsisHomePage();

    @Given("User is on the homepage of conceptsis {string}")
    public void user_is_on_the_homepage_of_conceptsis(String string) {
        Driver.getDriver().get(Config.getProperty("conceptsisUrl"));
    }

    @When("user types valid username and password")
    public void user_types_valid_username_and_password() {
        homePage.usernameBox.sendKeys(Config.getProperty("username"));
        homePage.passwordBox.sendKeys(Config.getProperty("password"));
        }

    @When("click the submit button")
    public void click_the_submit_button() {
        homePage.submitButton.click();
    }

    @Then("sees {string} as a proof of valid signing in")
    public void sees_as_a_proof_of_valid_signing_in(String string) {
        String actualWelcomeTxt=homePage.welcomeText.getText();
        System.out.println(actualWelcomeTxt);


        String expectedWelcomeTxt = "Welcome Department";
        Assert.assertTrue(actualWelcomeTxt.contains(expectedWelcomeTxt));


    }








    @When("user types INVALID username and password")
    public void user_types_INVALID_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("clicks the submit button")
    public void clicks_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("sees {string} as a proof of INVALID credentials")
    public void sees_as_a_proof_of_INVALID_credentials(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
