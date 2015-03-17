Meta:
@storyType BQS

Narrative:
As a user
I Perform: "Transaction And Capital Market >> Broker" search Verify that companies other than "Broker" sub role users are not retrieved.

Scenario: TC 1384101: Verify companies of broker is not retrieved when search is performed
When I update TestCaseId 1384101
When I update TestCaseName Perform: "Transaction And Capital Market >> Broker" search Verify that companies other than "Broker" sub role users are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Transaction & Capital Markets' link
And I click on 'Residential Brokers' link
Then I should see 'Transaction & Capital Markets' as find in search option
And I should see sub role as 'Residential Brokers'
When I click on broker company name
And I return back to the searched page
And I select Companies option in filter by label
And I set values of project slider
Then I verify 'Universal' company name of broker is not displayed
When I clear values of project slider
And I select asset experience drop down field
And I click on solar option in asset experience field
Then I verify broker company name of 'Broker Multi Family' is not displayed
When I select asset experience drop down field
And I clear solar option of asset experience field
And I click on deal stage drop down
And I select in dd option in deal stage drop down
Then I verify broker company name of 'Broker Owned' is not displayed
When I click on deal stage drop down
And I clear in dd option in deal stage drop down
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on West region
And I click on states field
And I click on California state
And I click on cities field
And I enter and select Napa city
Then I verify 'Canap' company name of broker is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Transaction & Capital Markets' link
And I click on 'Residential Brokers' link
Then I should see 'Transaction & Capital Markets' as find in search option
And I should see sub role as 'Residential Brokers'
When I select Companies option in filter by label
And I click on profile and experience field
And I select number of office in profile field
Then I verify 'Universal' company name of broker is not displayed
When I clear number of office in profile field
And I select number of professionals in profile field
Then I verify 'Universal' company name of broker is not displayed
When I clear number of professionals in profile field
And I select number of value transaction completed in profile field
Then I verify 'Universal' company name of broker is not displayed
When I clear number of value transaction completed in profile field
And I select number of transaction completed in profile field
Then I verify 'Universal' company name of broker is not displayed
When I clear number of transaction completed in profile field
And I logout from RealConnex application


