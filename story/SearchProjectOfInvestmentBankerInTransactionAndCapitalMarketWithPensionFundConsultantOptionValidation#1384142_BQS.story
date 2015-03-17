Meta:
@storyType BQS

Narrative:
As a user
I verify 'Service' project other than "Investment Banker" sub role
are not retrieved, when "Transaction & Capital Markets >> Pension Fund Consultant" search is performed

Scenario: TC 138414: Verify service project other than investment banker are  not retrieved when search is performed
When I update TestCaseId 138414
When I update TestCaseName Verify 'Service' project other than "Investment Banker" sub role are not retrieved, when "Transaction & Capital Markets >> Pension Fund Consultant" search is performed
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Transaction & Capital Markets' link
And I click on 'Pension Fund Consultant' link
Then I should see 'Transaction & Capital Markets' as find in search option
And I should see 'Pension Fund Consultant' as strategy in search option
When I select Services option in filter by label
When I click on banker project name
And I return back to the searched page
And I set values of project slider
Then I verify 'Project advisor' service name of investment banker is not displayed
When I clear values of project slider
And I select asset experience drop down field
And I select health care option in asset experience drop down
Then I verify 'Faber' service name of investment banker is not displayed
When I select asset experience drop down field
And I clear health care option in asset experience drop down
And I click on deal stage drop down
And I select permitted option in deal stage drop down
Then I verify 'Faber' service name of investment banker is not displayed
When I click on deal stage drop down
And I clear permitted option in deal stage drop down
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on MidWest region
And I click on states field
And I click on Wisconsin state
And I click on cities field
And I enter and select Eden city
And I click on geographical coverage field
Then I verify 'Faber' service name of investment banker is not displayed
When I click on 'RCMP MarketPlace' button
And I click on 'Transaction & Capital Markets' link
And I click on 'Pension Fund Consultant' link
Then I should see 'Transaction & Capital Markets' as find in search option
And I should see 'Pension Fund Consultant' as strategy in search option
When I select Services option in filter by label
And I click on profile and experience field
And I select number of office in profile field
Then I verify 'Project advisor' service name of investment banker is not displayed
When I clear number of office in profile field
And I select number of professionals in profile field
Then I verify 'Project advisor' service name of investment banker is not displayed
When I clear number of professionals in profile field
And I select number of transaction completed in profile field
Then I verify 'Project advisor' service name of investment banker is not displayed
When I clear number of transaction completed in profile field
And I logout from RealConnex application




