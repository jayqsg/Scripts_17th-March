package test.steps;

import com.google.inject.Inject;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.FindClientPage;
import test.pages.PageFactory;


/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 3/14/15
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindClientSteps {

    private final FindClientPage findClientPage;

    @Inject
    public FindClientSteps(PageFactory thePageFactory) {
        findClientPage = thePageFactory.newFindClientPage();
    }

    @Then("I verify '$strPostingName' of deal sponsor fund name is displayed in new business advisor search")
    @Aliases(values = {"I verify '$strPostingName' of deal sponsor project name is displayed in new business advisor search","I verify '$strPostingName' of investor fund name is displayed in new business advisor search",
        "I verify '$strPostingName' of lender loan name is displayed in new business advisor search","I verify '$strPostingName' of lender mezz name is displayed in new business advisor search",
        "I verify '$strPostingName' of real estate advisor service name is displayed in new business advisor search","I verify '$strPostingName' of real estate advisor listing name is displayed in new business advisor search"})
    public void verifyPostingNameIsDisplayedInNewBusinessAdvisorSearch(@Named("strPostingName") String strPostingName){
        findClientPage.verifyPostingNameIsDisplayedInNewBusinessAdvisorSearch(strPostingName);
    }

    @Then("I verify '$strDealSponsorFundName' of deal sponsor fund name is displayed side search of advisor in new business advisor search")
    @Aliases(values = {"I verify '$strDealSponsorFundName' of deal sponsor project name is displayed side search of advisor in new business advisor search","I verify '$strInvestorFundName' of investor fund name is displayed side search of advisor in new business advisor search",
            "I verify '$strLenderLoanName' of lender loan name is displayed side search of advisor in new business advisor search","I verify '$strLenderMezzName' of lender mezz name is displayed side search of advisor in new business advisor search",
            "I verify '$strREAServiceName' of real estate advisor service name is displayed side search of advisor in new business advisor search","I verify '$strREAListingName' of real estate advisor listing name is displayed side search of advisor in new business advisor search"})
    public void verifyPostingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        findClientPage.verifyPostingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strPostingName' of deal sponsor fund name is displayed in new business corporate finance search")
    @Aliases(values = {"I verify '$strPostingName' of deal sponsor project name is displayed in new business corporate finance search","I verify '$strPostingName' of investor fund name is displayed in new business corporate finance search",
            "I verify '$strPostingName' of lender loan name is displayed in new business corporate finance search","I verify '$strPostingName' of lender mezz name is displayed in new business corporate finance search",
            "I verify '$strPostingName' of real estate advisor service name is displayed in new business corporate finance search","I verify '$strPostingName' of real estate advisor listing name is displayed in new business corporate finance search"})
    public void verifyPostingNameIsDisplayedNameInNewBusinessCorporateSearch(@Named("strDealSponsorFundName") String strDealSponsorFundName){
        findClientPage.verifyPostingNameIsDisplayedNameInNewBusinessCorporateSearch(strDealSponsorFundName);
    }

    @Then("I verify '$strPostingName' of deal sponsor fund name is displayed side search of corporate finance in new business corporate finance search")
    @Aliases(values = {"I verify '$strPostingName' of deal sponsor project name is displayed side search of corporate finance in new business corporate finance search","I verify '$strPostingName' of investor fund name is displayed side search of corporate finance in new business corporate finance search",
            "I verify '$strPostingName' of lender loan name is displayed side search of corporate finance in new business corporate finance search","I verify '$strPostingName' of lender mezz name is displayed side search of corporate finance in new business corporate finance search",
            "I verify '$strPostingName' of real estate advisor service name is displayed side search of corporate finance in new business corporate finance search","I verify '$strPostingName' of real estate advisor listing name is displayed side search of corporate finance in new business corporate finance search"})
    public void verifyPostingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCorporateSearch(@Named("strPostingName") String strPostingName){
        findClientPage.verifyPostingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCorporateSearch(strPostingName);
    }

    @Then("I verify '$strPostingName' of deal sponsor fund name is displayed in new business investment banker search")
    @Aliases(values = {"I verify '$strPostingName' of deal sponsor project name is displayed in new business investment banker search","I verify '$strPostingName' of investor fund name is displayed in new business investment banker search",
            "I verify '$strPostingName' of lender loan name is displayed in new business investment banker search","I verify '$strPostingName' of lender mezz name is displayed in new business investment banker search",
            "I verify '$strPostingName' of real estate advisor service name is displayed in new business investment banker search","I verify '$strPostingName' of real estate advisor listing name is displayed in new business investment banker search"})
    public void verifyPostingNameIsDisplayedNameInNewBusinessInvBankerSearch(@Named("strPostingName") String strPostingName){
        findClientPage.verifyPostingNameIsDisplayedNameInNewBusinessInvBankerSearch(strPostingName);
    }

    @Then("I verify '$strPostingName' of deal sponsor fund name is displayed side search of investment banker in new business investment banker search")
    @Aliases(values = {"I verify '$strPostingName' of deal sponsor project name is displayed side search of investment banker in new business investment banker search","I verify '$strPostingName' of investor fund name is displayed side search of investment banker in new business investment banker search",
            "I verify '$strPostingName' of lender loan name is displayed side search of investment banker in new business investment banker search","I verify '$strPostingName' of lender mezz name is displayed side search of investment banker in new business investment banker search",
            "I verify '$strPostingName' of real estate advisor service name is displayed side search of investment banker in new business investment banker search","I verify '$strPostingName' of real estate advisor listing name is displayed side search of investment banker in new business investment banker search"})
    public void verifyPostingIsDisplayedInSearchResultToFilterSelected_NewBusinessInvBankerSearch(@Named("strPostingName") String strPostingName){
        findClientPage.verifyPostingIsDisplayedInSearchResultToFilterSelected_NewBusinessInvBankerSearch(strPostingName);
    }

    @Then("I verify '$strPostingName' of deal sponsor fund name is displayed in new business broker search")
    @Aliases(values = {"I verify '$strPostingName' of deal sponsor project name is displayed in new business broker search","I verify '$strPostingName' of investor fund name is displayed in new business broker search",
            "I verify '$strPostingName' of lender loan name is displayed in new business broker search","I verify '$strPostingName' of lender mezz name is displayed in new business broker search",
            "I verify '$strPostingName' of real estate advisor service name is displayed in new business broker search","I verify '$strPostingName' of real estate advisor listing name is displayed in new business broker search"})
    public void verifyPostingNameIsDisplayedNameInNewBusinessResidentialSearch(@Named("strPostingName") String strPostingName){
        findClientPage.verifyPostingNameIsDisplayedNameInNewBusinessResidentialSearch(strPostingName);
    }

    @Then("I verify '$strPostingName' of deal sponsor fund name is displayed in side search of broker in new business broker search")
    @Aliases(values = {"I verify '$strPostingName' of deal sponsor project name is displayed side search of broker in new business broker search","I verify '$strPostingName' of investor fund name is displayed in side search of broker in new business broker search",
            "I verify '$strPostingName' of lender loan name is displayed in side search of broker in new business broker search","I verify '$strPostingName' of lender mezz name is displayed in side search of broker in new business broker search",
            "I verify '$strPostingName' of real estate advisor service name is displayed in side search of broker in new business broker search","I verify 'Evans Listing' of real estate advisor listing name is displayed in side search of broker in new business broker search"})
    public void verifyPostingIsDisplayedInSearchResultToFilterSelected_NewBusinessResidentialSearch(@Named("strPostingName") String strPostingName){
        findClientPage.verifyPostingIsDisplayedInSearchResultToFilterSelected_NewBusinessResidentialSearch(strPostingName);
    }

    @Then("I verify '$strInvestorFundName' fund name of user whose lighthouse is off are not displayed in new business search when side search performed")
    public void verifyInvestorFundNameIsNotDisplayedInNewBusinessLoanSearchWhereLightHouseOff(@Named("strInvestorFundName") String strInvestorFundName){
        findClientPage.verifyInvestorFundNameIsNotDisplayedInNewBusinessLoanSearchWhereLightHouseOff(strInvestorFundName);
    }

    @Then("I verify '$strInvestorFundName' fund name of user whose lighthouse is off are not displayed in new business search")
    public void verifyInvestorFundNameNotDisplayedInNewBusinessLoanSearch_LightHouseOff(@Named("strInvestorFundName") String strInvestorFundName){
        findClientPage.verifyInvestorFundNameNotDisplayedInNewBusinessLoanSearch_LightHouseOff(strInvestorFundName);
    }

    @When("I select number of professionals slider in new business advisor search")
    public void selectNoOfProfessionals(){
        findClientPage.selectNoOfProfessionals();
    }

    @When("I clear number of professionals slider in new business advisor search")
    public void clearNoOfProfessionals(){
        findClientPage.clearNoOfProfessionals();
    }

    @When("I select ideal customer drop down field")
    public void selectIdealCustomerDropDown(){
        findClientPage.selectIdealCustomerDropDown();
    }

    @When("I select deal sponsor option in ideal customer field")
    public void selectDealSponsorInIdealCustomerField(){
        findClientPage.selectDealSponsorInIdealCustomerField();
    }

    @When("I select developer option in ideal customer field")
    public void selectDeveloperInIdealCustomerField(){
        findClientPage.selectDeveloperInIdealCustomerField();
    }

    @When("I clear deal sponsor option in ideal customer field")
    public void clearDealSponsorInIdealCustomerField(){
        findClientPage.clearDealSponsorInIdealCustomerField();
    }

    @When("I select investor option in ideal customer field")
    public void selectInvestorInIdealCustomerField(){
        findClientPage.selectInvestorInIdealCustomerField();
    }

    @When("I select advisor option in ideal customer field")
    public void selectAdvisorOptionInIdealCustomerField(){
        findClientPage.selectAdvisorOptionInIdealCustomerField();
    }

    @When("I clear investor option in ideal customer field")
    public void clearInvestorInIdealCustomerField(){
        findClientPage.clearInvestorInIdealCustomerField();
    }

    @When("I select lender option in ideal customer field")
    public void selectLenderInIdealCustomerField(){
        findClientPage.selectLenderInIdealCustomerField();
    }

    @When("I select family office option in ideal customer field")
    public void selectFamilyOfficeOptionInIdealCustomerField(){
        findClientPage.selectFamilyOfficeOptionInIdealCustomerField();
    }

    @When("I clear lender option in ideal customer field")
    public void clearLenderInIdealCustomerField(){
        findClientPage.clearLenderInIdealCustomerField();
    }

    @When("I select real estate advisor option in ideal customer field")
    public void selectRealEstateAdvisorInIdealCustomerField(){
        findClientPage.selectRealEstateAdvisorInIdealCustomerField();
    }

    @When("I select advisor option of real estate advisor in ideal customer field")
    public void selectAdvisorOptionOfREAInIdealCustomerField(){
        findClientPage.selectAdvisorOptionOfREAInIdealCustomerField();
    }

    @When("I clear real estate advisor option in ideal customer field")
    public void clearRealEstateAdvisorInIdealCustomerField(){
        findClientPage.clearRealEstateAdvisorInIdealCustomerField();
    }

    @When("I click on 'Route to Sponsor' drop down field in search")
    public void clickRouteToDeveloper_NewBusiness(){
        findClientPage.clickRouteToSponsorOfDealSponsor_NewBusiness();
    }

    @When("I click on NorthEast region")
    public void clickNorthEast(){
        findClientPage.clickNorthEast();
    }

   /* @When("I click on New York state")
    public void clickTexasState(){
        newBusinessPage.clickNewYorkState();
    }*/

    @When("I enter and select Ira city")
    public void enterAndSelectIraCity(){
        findClientPage.enterAndSelectIraCity();
    }

    @When("I enter and select Era city")
    public void enterAndSelectEraCity(){
        findClientPage.enterAndSelectEraCity();
    }

    @Then("I verify 'What do you want to post to the marketplace?' is displayed")
    public void verifyWhatDoYouWantToPostInMarketPlace(){
        findClientPage.verifyWhatDoYouWantToPostInMarketPlace();
    }

    @When("I click on 'Fund' button in market place")
    public void clickFundButtonInMarketPlace(){
        findClientPage.clickFundButtonInMarketPlace();
    }

    @When("I click on 'Equity' button in market place")
    public void clickEquityButtonInMarketPlace(){
        findClientPage.clickEquityButtonInMarketPlace();
    }

    @When("I click on 'Listing' button in market place")
    public void clickListingButtonInMarketPlace(){
        findClientPage.clickListingButtonInMarketPlace();
    }

    @When("I click on 'Service' button in market place")
    public void clickServiceButtonInMarketPlace(){
        findClientPage.clickServiceButtonInMarketPlace();
    }

    @When("I click on 'Return to Your Postings' link")
    public void clickReturnToYourPostings(){
        findClientPage.clickReturnToYourPostings();
    }
}
