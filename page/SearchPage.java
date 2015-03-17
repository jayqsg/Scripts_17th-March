package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.*;


public class SearchPage extends FluentWebDriverPage {
    public SearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void peopleCompaniesLinkClick(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='mainSearchItems']/div/ul/li/label/span/strong[text()='People, Companies & Associations']")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click People Companies and Association link\n";
        } catch (ElementNotVisibleException E){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click People Companies and Association link\n";
        }
    }

    public void peopleClick(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'People')]")).click();
            WaitUtil.simpleSleep(10000);
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on People link\n";
        } catch (WebDriverException W){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on People link\n";
        }
    }

    public void companiesClick(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[text()='Companies / Associations']")).click();
            WaitUtil.simpleSleep(15000);
        } catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Companies Link\n";
        }  catch (WebDriverException W){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Companies Link\n";
        }
    }

    public void dealSponsorClick(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='mainSearchItems']/div/ul/li/label/span/strong[contains(text(),'Developers, Deal Sponsors')]")).click();
    }

    public void selectDealSponsor(){
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[text()='Deal Sponsor']")).click();
    }

    public void clickViewSearchResults(){
        try{
            executeScript("scroll(0,150)");
            findElement(By.cssSelector("#stepCounterHolder > a")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on the 'View Search Result' link\n";
        }
        WaitUtil.simpleSleep(5000);
    }

    public void selectDeveloper(){
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[text()='Developer']")).click();
    }

    public void selectFundSponsor(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[3]/label/strong/span")).click();
    }

    public void clickUsers(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[text()='Developer']")).click();
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[text()='Deal Sponsor']")).click();
    }

    public void clickRealEstateLink(){
        WaitUtil.simpleSleep(10000);
        findElement(By.xpath("//div[@id='mainSearchItems']/div/ul/li/label/span/strong[contains(text(),'RE Advisors')]")).click();
    }


    public void clickProjectManagementLink(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Project Management')]")).click();
    }

    public void clickAdvisorLink(){
        findElement(By.xpath("//strong[contains(text(),'Advisor')]")).click();
    }

    public void clickAppraisalLink(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li[3]/label/strong/span")).click();
    }

    public void clickBroker(){
        findElement(By.xpath("//div[@id='mainSearchItems']/div/ul/li/label/span/strong[text()='Brokers & Agencies']")).click();
    }

    public void clickResidential(){
        findElement(By.xpath("//strong[contains(text(),'Residential Brokers')]")).click();
    }

    public void clickAcquisitions(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span")).click();
    }

    public void clickOffPlanSales(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Off Plan Sales')]")).click();
    }                         //div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Owner Representative')]

    public void clickInvestmentBanker(){
        findElement(By.xpath("//div[@id='mainSearchItems']/div/ul/li/label/span/strong[text()='Investment Banker / Capital Markets']")).click();
    }

    public void clickCapitalRaising(){
        findElement(By.xpath("//strong[text()='Capital Raising']")).click();
    }

    public void clickInvestOrLend(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//strong[text()='Invest or Lend']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Invest or Lend link\n";
        }
    }

    public void clickDirectIntoProject(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Direct Into Project')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Direct Into Project link\n";

        }
    }

    public void clickCore(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[text()='Core']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Core link\n";
        }
    }

    public void clickOpportunistic(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Opportunistic')]")).click();
    }

    public void clickFund(){
        try{
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[text()='Fund']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Fund link\n";
        }
    }

    public void clickCoreOfFund(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[text()='Core']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Core link in Fund Search\n";

        }
    }

    public void clickMoney(){
            try{
                WaitUtil.simpleSleep(10000);
                findElement(By.xpath("//div[@id='mainSearchItems']/div/ul/li/label/span/strong[text()='Money & Buyers']")).click();
            } catch (NoSuchElementException e){
                LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Money & Buyers link\n";
            }
    }


    public void clickEquity(){
        try{
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Equity')]")).click();
        } catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Equity link\n";
        }
    }

    public void clickMezz(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Mezz')]")).click();
    }

    public void clickDirectIntoProjectLink(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Direct Into Project')]")).click();
    }

    public void clickFundLink(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Fund')]")).click();
    }

    public void clickDebt(){
        try{
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Debt')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Debt link\n";
        }
    }

    public void clickLoans(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Loans')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Loans link\n";
        }
    }

    public void clickLandLoan(){
        try{
        findElement(By.xpath("//div[@id='fourthSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Land Loan')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Land Loan link\n";
        }
    }

    public void clickIncomeOrCore(){
        findElement(By.xpath("//strong[text()='Income / Core']")).click();
    }

    public void clickPreferred(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Preferred')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Preferred link\n";

        }
    }

    public void clickFundOfMoney(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Fund')]")).click();
        //findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li[2]/label/strong/span[contains(text(),'Fund')]")).click();
    }

    public void clickHardMoney(){
       findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Hard Money')]")).click();
    }

    /*public void clickSearchRealConnexMarketPlaceLink(){
        WaitUtil.simpleSleep(20000);
        findElement(By.xpath("//div[@id='showTree']/span/div[@class='select']/b/i")).click();
        WaitUtil.simpleSleep(1000);
    }*/

    public void jvPartnerLinkClick(){
       findElement(By.xpath("//div[@id='mainSearchItems']/div/ul/li/label/span/strong[contains(text(),'JV Partners')]")).click();
    }

    public void clickFindClientsClick(){
        WaitUtil.simpleSleep(10000);
        findElement(By.xpath("//strong[text()='Find Clients']")).click();
        WaitUtil.simpleSleep(5000);
    }

    public void landLinkClick(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Land')]")).click();
    }

    public void clickOnLoansInNewBusinessSearch(){
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Land')]")).click();
    }

    public void clickLoansOrHardMoneyLink(){
       findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Hard Money')]")).click();
    }

    public void clickMezzOfNewBusinessSearch(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Mezz')]")).click();
    }

    public void clickProject(){
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Project')]")).click();
    }

    public void clickEquity_JVPartner(){
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Equity')]")).click();
    }

    public void clickService(){
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Services')]")).click();
    }

    public void clickOther(){
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Other')]")).click();
    }

    public void clickCorporateFinance(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//strong[contains(text(),'Corporate Finance')]")).click();
    }

    public void clickResidentialBrokerLink() {
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//strong[text()='Residential Broker']")).click();
    }

    public void clickCommercialBrokerLink(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//strong[text()='Commercial Broker']")).click();
    }

    public void clickSaleOfExisting_NewBusiness(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//strong[text()='Sale of Existing']")).click();
    }

    public void clickDesignBuildEngineerLink(){
        WaitUtil.simpleSleep(10000);
        findElement(By.xpath("//div[@id='mainSearchItems']/div/ul/li/label/span/strong[contains(text(),'Design Build & Engineering')]")).click();
    }

    public void clickArchitectLink(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Architect')]")).click();
    }

    public void clickDesignerLink(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[contains(text(),'Designer')]")).click();
    }

    public void clickContractorLink(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[text()='Contractor']")).click();
    }

    public void clickSubContractorLink(){
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[text()='Sub Contractor']")).click();
    }

    public void clickOnEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[text()='Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Engineer' link in search page\n";
        }
    }

    public void clickOnCivilEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[text()='Civil Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Civil Engineer' link in search page\n";
        }
    }

    public void clickOnMechanicalEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[text()='Mechanical Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Mechanical Engineer' link in search page\n";
        }
    }

    public void clickOnElectricalEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[text()='Electrical Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Electrical Engineer' link in search page\n";
        }
    }

    public void clickOnEnvironmentalEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[text()='Environmental Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Environmental Engineer' link in search page\n";
        }
    }

    public void clickOnStructuralEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[text()='Structural Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Structural Engineer' link in search page\n";
        }
    }

    public void clickHealthAndSafetyEngineerLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='thirdSearchItems']/div/div/ul/li/label/span/strong[text()='Health & Safety Engineer']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Health & Safety Engineer' link in search page\n";
        }
    }

    public void clickOutrightSalesLink(){
        try{
            WaitUtil.simpleSleep(1000);
            findElement(By.xpath("//div[@id='secondSearchItems']/div/div/ul/li/label/span/strong[text()='Outright Sales']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Outright Sales' link in search page\n";
        }
    }

    public void clickTransactionAndCapitalMarketsLink(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//strong[text()='Transaction & Capital Markets']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Transaction & Capital Markets' link in search page\n";
        }
    }

    public void clickResearchLink(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//strong[text()='Research']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Research' link in search page\n";
        }
    }

    public void clickValuationsAndAppraisalsLink(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//strong[text()='Valuations & Appraisals']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Valuations & Appraisals' link in search page\n";
        }
    }

    public void clickOtherLink_TransactionAndCapitalMarket(){
        try{
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//strong[text()='Other']")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Unable to click on 'Other' link in search page\n";
        }
    }

    public void clickCommercial(){
        findElement(By.xpath("//strong[contains(text(),'Commercial Brokers')]")).click();
    }

    public void clickMAndA(){
        findElement(By.xpath("//strong[text()='M&A']")).click();
    }

    public void clickPensionFundConsultant(){
        findElement(By.xpath("//strong[text()='Pension Fund Consultant']")).click();
    }
}
