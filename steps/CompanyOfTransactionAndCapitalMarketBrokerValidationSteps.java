package test.steps;


import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompanyOfTransactionAndCapitalMarketBrokerValidationPage;
import test.pages.PageFactory;

public class CompanyOfTransactionAndCapitalMarketBrokerValidationSteps {
    private final CompanyOfTransactionAndCapitalMarketBrokerValidationPage companyOfTransactionAndCapitalMarketBrokerValidationPage;

    @Inject
    public CompanyOfTransactionAndCapitalMarketBrokerValidationSteps(PageFactory thePageFactory) {
        companyOfTransactionAndCapitalMarketBrokerValidationPage = thePageFactory.newCompanyOfBrokerValidationPage();
    }

    @Then("I verify '$strCompanyNameIsDisplayed' company name of broker is displayed")
    public void verifyCompanyNameOfBrokerIsDisplayed(@Named("strCompanyName") String strCompanyName){
        companyOfTransactionAndCapitalMarketBrokerValidationPage.verifyCompanyNameOfBrokerIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyNameNotDisplayed' company name of broker is not displayed")
    public void  verifyCompanyNameOfBrokerNotDisplayed(@Named("strCompanyNameNotDisplayed") String strCompanyNameNotDisplayed){
        companyOfTransactionAndCapitalMarketBrokerValidationPage.verifyCompanyNameOfBrokerNotDisplayed(strCompanyNameNotDisplayed);
    }
    @Then("I verify broker company name of '$strSideSearch' is displayed")
    public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch){
        companyOfTransactionAndCapitalMarketBrokerValidationPage.companyOfBrokerIsDisplayed(2, strSideSearch);
    }

    @Then("I verify broker company name of '$strSideSearch' is not displayed")
    public void companyNotDisplayed(@Named("strSideSearch") String strSideSearch){
        companyOfTransactionAndCapitalMarketBrokerValidationPage.companyOfBrokerNotDisplayed(2, strSideSearch);

    }

    @Then("I verify company name of broker selected all search option is displayed")
    public void verifyAllOptions(){
        companyOfTransactionAndCapitalMarketBrokerValidationPage.verifyAllOptionsOfBrokerCompany(2);
    }

    @When("I select solar and multi family option of asset experience field")
    public void selectSolarAndMultifamily(){
        companyOfTransactionAndCapitalMarketBrokerValidationPage.selectSolarAndMultifamily();
    }

    @When("I clear solar and multi family options of asset experience field")
    public void clearSolarAndMultifamily(){
        companyOfTransactionAndCapitalMarketBrokerValidationPage.clearSolarAndMultifamily();
    }

    @When("I select in dd and owned option in deal stage drop down")
    public void selectInDdAndOwnedOption(){
        companyOfTransactionAndCapitalMarketBrokerValidationPage.selectInDdAndOwnedOption();
    }

    @When("I clear in dd and owned option in deal stage drop down")
    public void clearInDdAndOwnedOption(){
        companyOfTransactionAndCapitalMarketBrokerValidationPage.clearInDdAndOwnedOption();
    }
}
