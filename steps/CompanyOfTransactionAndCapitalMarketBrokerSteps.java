package test.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.CompanyOfTransactionAndCapitalMarketBrokerPage;
import test.pages.PageFactory;

import javax.inject.Inject;

public class CompanyOfTransactionAndCapitalMarketBrokerSteps {
    private final CompanyOfTransactionAndCapitalMarketBrokerPage companyOfTransactionAndCapitalMarketBrokerPage;

    @Inject
    public CompanyOfTransactionAndCapitalMarketBrokerSteps(PageFactory thePageFactory) {
        companyOfTransactionAndCapitalMarketBrokerPage = thePageFactory.newCompanyOfBrokerPage();
    }

    @Then("I should see 'Brokers & Agencies' as subrole in search option")
    public void verifySubRoleOfBroker(){
        companyOfTransactionAndCapitalMarketBrokerPage.verifySubRoleOfBroker();
    }

    @Then("I should see 'Acquisitions' as strategy in search option")
    public void verifyStrategy(){
        companyOfTransactionAndCapitalMarketBrokerPage.verifyStrategy();
    }

    @Then("I should see 'Off Plan Sales' as strategy in search option")
    public void verifyOffPlanSalesIsDisplayedInStrategy(){
        companyOfTransactionAndCapitalMarketBrokerPage.verifyOffPlanSalesIsDisplayedInStrategy();
    }

    @When("I click on broker company name")
    public void clickAppraisalUser(){
        companyOfTransactionAndCapitalMarketBrokerPage.clickOnBrokerCompanyName(1);
    }

    @When("I click on broker service name")
    public void clickServiceUser(){
        companyOfTransactionAndCapitalMarketBrokerPage.clickOnServiceOfBroker(1);
    }

    @Then("I verify company name of broker is displayed")
    public void verifyBrokerCompany(){
        companyOfTransactionAndCapitalMarketBrokerPage.verifyBrokerCompany(1);
    }

    @When("I click on solar option in asset experience field")
    public void selectSolarOption(){
        companyOfTransactionAndCapitalMarketBrokerPage.selectSolarOption();
    }

    @When("I clear solar option of asset experience field")
    public void clearSolarOption(){
        companyOfTransactionAndCapitalMarketBrokerPage.clearSolarOption();
    }

    @When("I select in dd option in deal stage drop down")
    public void selectInDdOption(){
        companyOfTransactionAndCapitalMarketBrokerPage.selectInDdOption();
    }

    @When("I clear in dd option in deal stage drop down")
    public void clearInDdOption(){
        companyOfTransactionAndCapitalMarketBrokerPage.clearInDdOption();
    }

    @When("I click on West region")
    public void clickWest(){
        companyOfTransactionAndCapitalMarketBrokerPage.clickWest();
    }

    @When("I click on California state")
    public void clickCaliforniaState(){
        companyOfTransactionAndCapitalMarketBrokerPage.clickCaliforniaState();
    }

    @When("I enter and select Napa city")
    public void enterAndSelectNapaCity(){
        companyOfTransactionAndCapitalMarketBrokerPage.enterAndSelectNapaCity();
    }
}
