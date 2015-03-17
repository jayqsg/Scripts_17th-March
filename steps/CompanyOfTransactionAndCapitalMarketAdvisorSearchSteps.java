package test.steps;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.Support.ReadData;
import test.pages.CompanyOfTransactionAndCapitalMarketAdvisorSearchPage;
import test.pages.PageFactory;

public class CompanyOfTransactionAndCapitalMarketAdvisorSearchSteps {
    private final CompanyOfTransactionAndCapitalMarketAdvisorSearchPage companyOfTransactionAndCapitalMarketAdvisorSearchPage;
    ReadData ReadData = new ReadData();

    @Inject
    public CompanyOfTransactionAndCapitalMarketAdvisorSearchSteps(PageFactory thePageFactory) {
        companyOfTransactionAndCapitalMarketAdvisorSearchPage = thePageFactory.newCompanyOfAdvisorSearchPage();
    }

    @Then("I should see 'Transaction & Capital Markets' as find in search option")
    public void verifyFindOfAdvisor(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.verifyFindOfAdvisor();
    }

    @Then("I should see 'Advisor' as subrole in search option")
    public void verifySubroleOfAdvisor(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.verifySubroleOfAdvisor();
    }

    @Then("I should see 'Appraisal' as strategy in search option")
    public void verifyStrategy(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.verifyStrategy();
    }

    @Then("I should see '$strStrategyName' as strategy in search option")
    public void verifyValuationsAndAppraisalsStrategy(@Named("strStrategyName") String strStrategyName){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.verifyValuationsAndAppraisalsStrategy(strStrategyName);
    }

    @When("I click on company of user")
    public void clickAppraisalUser(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.clickAdvisorCompany(1);
    }

    @When("I click on service of user")
    public void clickServiceUser(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.clickServiceUser(3);
    }

    @When("I select asset experience drop down field")
    public void selectAssetExperienceDropDown(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.selectAssetExperienceDropDown();
    }

    @When("I select office option in asset experience drop down")
    public void selectOfficeAssetExperience(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.selectOfficeAssetExperience();
    }

    @Then("I verify company of advisor is displayed")
    public void verifyAdvisorCompany() throws Exception {
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.verifyAdvisorCompany(1);
    }

    @When("I clear office option of asset experience drop down")
    public void clearOfficeAssetExperience(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.selectOfficeAssetExperience();
    }

    @When("I click on deal stage drop down")
        @Alias("I click on deal stage drop down in search")
    public void clickDealStage(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.clickDealStage();
    }

    @When("I select owned option in deal stage drop down")
    public void selectOwnedOptionInDealStage(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.selectOwnedOptionInDealStage();
    }

    @When("I clear owned option in deal stage drop down")
    public void clearOwnedOptionInDealStage(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.selectOwnedOptionInDealStage();
    }

    @When("I click on Missouri state")
    public void clickMissouriState(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.clickMissouriState();
    }

    @When("I enter and select Ink city")
    public void enterAndSelectInlCity(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.enterAndSelectInkCity();
    }

    @Then("I verify company name of advisor selected all search option is displayed")
    public void verifyAllOptions(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.verifyAllOptionsOfAdvisorCompany(2);
    }

    @When("I select Services option in filter by label")
    public void selectServicesOptionFromFilterByField(){
        companyOfTransactionAndCapitalMarketAdvisorSearchPage.selectServicesOptionFromFilterByField();
    }

}
