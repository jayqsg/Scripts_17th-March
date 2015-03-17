Meta:
@storyType BQS

Narrative:
As a user
I verify that projects other than "Project" and "Listing" project
are not retrieved in "Investment >> Direct Into Project" search

Scenario: TC 138420: Verify projects other than project and listing are not retrieved in search
When I update TestCaseId 138420
When I update TestCaseName Search Project Of Investment Direct Into Validation
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Forword Sales' Link
Then I should see 'Invest or Lend' in find field of search option
And I verify 'Forward Sales' is displayed in kind field of search option region
When I select Postings option in filter by label

And I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click investing as drop down field
And I clear general partner option in investing as drop down field
And I click on asset interest

And I return back to the searched page
When I click on investment direct into listing project
And I return back to the searched page
And I select value in investment amount slider field
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear value in investment amount slider field
And I select the value of deal size field
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear the value of deal size field
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Investments' link
And I click on 'Forword Sales' Link
When I click route to sponsor field
And I select direct only option in route to sponsor drop down
Then I verify project posting is displayed in Invest or Lend search
When I click route to sponsor field