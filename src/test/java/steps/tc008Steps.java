package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc008Page;
import static org.junit.Assert.assertTrue;

public class tc008Steps {
    tc008Page page = new tc008Page();

    @Given("^I am on the document management system$")
    public void navigateToDocumentManagementSystem() {
        page.openDocumentManagementSystem();
    }

    @When("^I query the information of the document in the system$")
    public void queryDocumentInformation() {
        page.queryDocument();
    }

    @Then("^the document information is retrieved correctly$")
    public void verifyDocumentRetrieved() {
        assertTrue(page.isDocumentRetrieved());
    }

    @Then("^the data matches without any loss or corruption$")
    public void compareDocumentData() {
        assertTrue(page.isDataIntact());
    }
}