package test.steps;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import test.pages.MoneyEquityFundProjectSearchPage;
import test.pages.PageFactory;

public class MoneyEquityFundProjectSearchSteps {
    private final MoneyEquityFundProjectSearchPage moneyEquityFundProjectSearchPage;

    @Inject
    public MoneyEquityFundProjectSearchSteps(PageFactory thePageFactory) {
        moneyEquityFundProjectSearchPage= thePageFactory.newMoneyEquityFundProjectSearchPage();
    }

    @Then("I verify '$strProjectName' project of investor is displayed")
        @Alias("I verify '$strProjectName' project of deal sponsor is displayed")
    public void verifyCompanyNameDebtLoan(@Named("strProjectName") String strProjectName){
        moneyEquityFundProjectSearchPage.verifyProjectNameOfEquityFund(strProjectName);
    }

    @When("I click on investment status field")
    public void clickInvestmentStatus(){
        moneyEquityFundProjectSearchPage.clickInvestmentStatus();
    }

    @When("I select general partner option in investment status")
    public void selectGeneralPartner(){
        moneyEquityFundProjectSearchPage.selectGeneralPartner();
    }

    @When("I clear general partner option in investment status")
    public void clearGeneralPartner(){
        moneyEquityFundProjectSearchPage.selectGeneralPartner();
    }

    @When("I click route to investor field")
    public void clickRouteToInvestor(){
        moneyEquityFundProjectSearchPage.clickRouteToInvestor();
    }

    @When("I select direct only option in route to investor")
    public void selectDirectOnly(){
        moneyEquityFundProjectSearchPage.selectDirectOnly();
    }

    @When("I clear direct only option in route to investor")
    public void clearDirectOnly(){
        moneyEquityFundProjectSearchPage.selectDirectOnly();
    }

    @When("I set the value of deal size")
    public void setFundTerm(){
        moneyEquityFundProjectSearchPage.setDealSize();
    }

    @When("I clear the value of deal size")
    public void clearFundTerm(){
        moneyEquityFundProjectSearchPage.clearDealSize();
    }

    @When("I set the value of investment amount field in money search")
    public void setInvestmentAmount_MoneySearch(){
        moneyEquityFundProjectSearchPage.setInvestmentAmount_MoneySearch();
    }

    @When("I clear the value of investment amount field in money search")
    public void clearInvestmentAmount(){
        moneyEquityFundProjectSearchPage.clearInvestmentAmount_MoneySearch();
    }

    @When("I clear risk profile field in money search")
    public void clearRiskProfile(){
        moneyEquityFundProjectSearchPage.clearRiskProfile_Money();
    }
}
