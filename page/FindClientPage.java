package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import test.steps.VerificationStatements;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 3/14/15
 * Time: 4:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindClientPage extends FluentWebDriverPage {

    String gStrFieldName;

    public FindClientPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyPostingNameIsDisplayedInNewBusinessAdvisorSearch(String strPostingName)  {
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//strong[contains(text(),'"+strPostingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strPostingName+" Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strPostingName+" Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyPostingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(String strPostingsName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//strong[text()='"+strPostingsName+"']"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strPostingsName+" Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strPostingsName+" Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyPostingNameIsDisplayedNameInNewBusinessCorporateSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strDealSponsorFundName+" Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strDealSponsorFundName+" Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyPostingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessCorporateSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//strong[text()='"+strDealSponsorFundName+"']"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strDealSponsorFundName+" Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strDealSponsorFundName+" Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyPostingNameIsDisplayedNameInNewBusinessInvBankerSearch(String strPostingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//strong[contains(text(),'"+strPostingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strPostingName+" Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strPostingName+" Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyPostingIsDisplayedInSearchResultToFilterSelected_NewBusinessInvBankerSearch(String strPostingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//strong[text()='"+strPostingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strPostingName+" Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strPostingName+" Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyPostingNameIsDisplayedNameInNewBusinessResidentialSearch(String strPostingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//strong[contains(text(),'"+strPostingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strPostingName+" Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+""+strPostingName+" Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyPostingIsDisplayedInSearchResultToFilterSelected_NewBusinessResidentialSearch(String strPostingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//strong[text()='"+strPostingName+"']"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Glick Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Glick Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedInNewBusinessLoanSearchWhereLightHouseOff(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//strong[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameNotDisplayedInNewBusinessLoanSearch_LightHouseOff(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//strong[text()='"+strInvestorFundName+"']"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result\n";
        }
    }

    public void selectNoOfProfessionals(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clearNoOfProfessionals(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

    public void selectIdealCustomerDropDown(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }
    }

    public void selectDealSponsorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_1"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The deal sponsor check box is not clicked\n";
        }
    }

    public void selectDeveloperInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_1"));
            WaitUtil.simpleSleep(10000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The developer check box is not clicked\n";
        }
    }

    public void clearDealSponsorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_1"));
            WaitUtil.simpleSleep(7000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The deal sponsor check box is not un clicked\n";
        }
    }

    public void selectLenderInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_3")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_3"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The lender check box is not clicked\n";
        }
    }

    public void selectFamilyOfficeOptionInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_39")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_39"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The family office check box is not clicked\n";
        }
    }

    public void clearLenderInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_3")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_3"));
            WaitUtil.simpleSleep(7000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The lender check box is not un clicked\n";
        }
    }

    public void selectInvestorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_2")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_2"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The investor check box is not clicked\n";
        }
    }

    public void selectAdvisorOptionInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_18")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_18"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The advisor check box is not clicked\n";
        }
    }

    public void clearInvestorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_2")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_2"));
            WaitUtil.simpleSleep(10000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The investor check box is not un clicked\n";
        }
    }

    public void selectRealEstateAdvisorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_4")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_4"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The real estate advisor check box is not clicked\n";
        }
    }

    public void selectAdvisorOptionOfREAInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_57")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_57"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The advisor of rea check box is not clicked\n";
        }
    }

    public void clearRealEstateAdvisorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_4")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(), By.id("OwnerroleId_checkbox_4"));
            WaitUtil.simpleSleep(7000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The real estate advisor check box is not un clicked\n";
        }
    }

    public void clickRouteToSponsorOfDealSponsor_NewBusiness(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        executeScript("scroll(150,0)");
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void clickNorthEast(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/div[@class='row']/div/div/div[@class='col-md-9']/label[contains(text(),'Northeast')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterAndSelectIraCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Ira");
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Ira (New York)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterAndSelectEraCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Era");
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Era (Texas)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void verifyWhatDoYouWantToPostInMarketPlace(){
        try{
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//div[@id='post']/div/span[contains(text(),'What do you want to post to the marketplace?')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"What do you wnat to post in market place is not displayed\n";
        }
    }

    public void clickFundButtonInMarketPlace(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='post']/div/div/div/ul/li/div/a[text()='Fund']")).sendKeys(Keys.ENTER);
        WaitUtil.simpleSleep(10000);
    }

    public void clickEquityButtonInMarketPlace(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='post']/ul/li/div/a[contains(text(),'Equity')]")).sendKeys(Keys.ENTER);
        WaitUtil.simpleSleep(10000);
    }

    public void clickListingButtonInMarketPlace(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='post']/ul/li/div/a[contains(text(),'Listing')]")).sendKeys(Keys.ENTER);
        WaitUtil.simpleSleep(10000);
    }

    public void clickServiceButtonInMarketPlace(){
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='post']/div/div/div/ul/li/div/a[text()='Service']")).sendKeys(Keys.ENTER);
        WaitUtil.simpleSleep(10000);
    }

    public void clickReturnToYourPostings(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.cssSelector("a.next.is_edit")).click();
    }


}
