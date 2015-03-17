Meta:
@storyType BQS

Narrative:
As a user
I search for list of companies in Real Connex application

Scenario: TC 138209: Verify desired list of companies are retrieved from search result
When I update TestCaseId 138209
When I update TestCaseName Verify that desired list of companies of all 4 role users are retrieved as search result when people search is performed.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'People,companies and association' link
And I click on 'Companies/Associations' link
Then I should see 'People, Companies & Associations' as find in search option
When I enter deal sponsor company name in search field
Then I verify 'Sterling' company name of deal sponsor is displayed
When I click on 'Sterling' company name and verify the company profile
And I return back to the searched page
And I enter investor company name in search field
Then I verify 'RC COm' company name of investor is displayed
When I click on 'RC COm' company name and verify the company profile
And I return back to the searched page
And I enter real estate advisor company name in search field
Then I verify 'Philps' company name of real estate advisor is displayed
When I click on 'Philps' company name and verify the company profile
And I return back to the searched page
And I enter lender company name in search field
Then I verify 'Sonic' company name of lender is displayed
When I click on 'Sonic' company name and verify the company profile
And I return back to the searched page
And I enter deal sponsor company name in search field
Then I verify 'Sterling' company name of deal sponsor is displayed
When I clear name field in search option
And I enter company type in search option
Then I verify 'Sterling' company name of deal sponsor is displayed
When I clear type field in search option
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on Southwest region
And I click on states field
And I click on Texas state
And I click on cities field
And I enter and select Massa city
Then I verify 'Sterling' company name of deal sponsor is displayed
When I logout from RealConnex application
