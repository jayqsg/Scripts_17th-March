package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import test.pages.CompanyOfTransactionAndCapitalMarketAdvisorValidationPage;
import test.pages.PageFactory;

public class CompanyOfTransactionAndCapitalMarketAdvisorValidationSearchSteps {
    private final CompanyOfTransactionAndCapitalMarketAdvisorValidationPage companyOfTransactionAndCapitalMarketAdvisorValidationPage;

    @Inject
    public CompanyOfTransactionAndCapitalMarketAdvisorValidationSearchSteps(PageFactory thePageFactory) {
        companyOfTransactionAndCapitalMarketAdvisorValidationPage = thePageFactory.newCompanyOfAdvisorValidationPage();
    }

    @Then("I verify '$strCompanyNameIsDisplayed' company name of advisor is displayed")
    public void verifyCompanyNameOfAdvisorIsDisplayed(@Named("strCompanyName") String strCompanyName){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.verifyCompanyNameOfAdvisorIsDisplayed(strCompanyName);
    }

    @Then("I verify '$strCompanyNameNotDisplayed' company name of advisor is not displayed")
    public void  verifyCompanyNameOfAdvisorNotDisplayed(@Named("strCompanyNameNotDisplayed") String strCompanyNameNotDisplayed){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.verifyCompanyNameOfAdvisorNotDisplayed(strCompanyNameNotDisplayed);
    }

    @Then("I verify advisor company name of '$strSideSearch' is displayed")
    public void verifyCompanyOfDealSponsor(@Named("strSideSearch") String strSideSearch){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.companyOfAdvisorIsDisplayed(2, strSideSearch);
    }

    @Then("I verify advisor company name of '$strSideSearch' is not displayed")
    public void companyNotDisplayed(@Named("strSideSearch") String strSideSearch){
        boolean status = companyOfTransactionAndCapitalMarketAdvisorValidationPage.companyOfAdvisorNotDisplayed(2, strSideSearch);
        Assert.assertTrue("The Searched String is found in the List", status);
    }


    @When("I select office and multi family option in asset experience drop down")
    public void selectOfficeAndMultifamily(){
       companyOfTransactionAndCapitalMarketAdvisorValidationPage.selectOfficeAndMultifamily();
    }

    @When("I clear office and multi family options in asset experience drop down")
    public void clearOfficeAndMultifamily(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clearOfficeAndMultifamily();
    }

    @When("I click on multi family option in asset")
    public void selectMultiFamilyOption(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.selectMultiFamilyOption();
    }

    @When("I click on hotel option in asset")
    public void clickHotel(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickHotel();
    }

    @When("I click on sports option in asset")
    public void clickSports(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickSports();
    }

    @When("I click on health option in asset")
    public void clickHealth(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickHealth();
    }

    @When("I click on storage option in asset")
    public void clickStorage(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickStorage();
    }

    @When("I click on asset other option in asset")
    public void clickAssetOther(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickAssetOther();
    }

    @When("I click on retail option in asset")
    public void clickRetail(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickRetail();
    }

    @When("I click on industrial option in asset")
    public void clickIndustrial(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickIndustrial();
    }

    @When("I click on residential option in asset")
    public void clickResidential(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickResidential();
    }

    @When("I click on single option in asset")
    public void clickSingle(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickSingle();
    }

    @When("I click on retirement option in asset")
    public void clickRetirement(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickRetirement();
    }

    @When("I click on student option in asset")
    public void clickStudent(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickStudent();
    }

    @When("I click on residential other option in asset")
    public void clickResidentialOther(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickResidentialOther();
    }

    @When("I click on residential multi option in asset")
    public void clickResidentialMulti(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickResidentialMulti();
    }

    @When("I clear residential field in asset option")
    public void clearResidential(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clearResidential();
    }

    @When("I click on mixed option in asset")
    public void clickMixed(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickMixed();
    }

    @When("I click on commercial option in asset")
    public void clickCommercial(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickCommercial();
    }

    @When("I click on solar option in asset")
    public void clickSolar(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickSolar();
    }

    @When("I clear asset options in asset drop down field")
    public void clearAsset(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clearAsset();
    }

    @When("I select owned and concept option in deal stage drop down")
    public void selectOwnedAndConceptOption(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.selectOwnedAndConceptOption();
    }

    @When("I clear owned and concept options in deal stage drop down")
    public void clearOwnedAndConceptOptions(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clearOwnedAndConceptOptions();
    }

    @When("I click on concept option in deal stage")
    public void clickConcept(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickConcept();
    }

    @When("I click on permitted option in deal stage")
    public void clickPermitted(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickPermitted();
    }

    @When("I click on ready option in deal stage")
    public void clickReady(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickReady();
    }

    @When("I click on LOI option in deal stage")
    public void clickLOI(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickLOI();
    }

    @When("I click on under contract option in deal stage")
    public void clickUnderContract(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickUnderContract();
    }

    @When("I click on plans option in deal stage")
    public void clickPlans(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickPlans();
    }

    @When("I click on under construction option in deal stage")
    public void clickUnderConstruction(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickUnderConstruction();
    }

    @When("I click on pursuit option in deal stage")
    public void clickPursuit(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickPursuit();
    }

    @When("I click on in DD option in deal stage")
    public void clickInDD(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clickInDD();
    }

    @When("I clear deal stage field")
    public void clearDealStage(){
        companyOfTransactionAndCapitalMarketAdvisorValidationPage.clearDealStage();
    }

}
