Meta:
@storyType BQS

Narrative:
As a user
Perform: "Investments >> Outright Sales" search Verify that postings other than "Projects" and "Listings" are not retrieved.

Scenario: TC 155634: Verify desired postings are not retrieved in "Investments >> Outright Sales" search result
When I update TestCaseId 155634
When I update TestCaseName Perform: "Investments >> Outright Sales" search Verify that postings other than "Projects" and "Listings" are not retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Invest or Lend' link
And I click on 'Outright Sales' link
Then I should see 'Invest or Lend' in find field of search option
And I verify 'Outright Sales' is displayed in kind field of search option region
When I select Postings option in filter by label
And I click on project posting in 'Invest or Lend' search
And I return back to the searched page
And I click on listing posting in 'Invest or Lend' search
And I return back to the searched page
And I select value in investment amount slider field
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear value in investment amount slider field
And I select the value of deal size field
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear the value of deal size field
And I click on 'RCMP MarketPlace' button
And I click on 'Invest or Lend' link
And I click on 'Outright Sales' link
Then I should see 'Invest or Lend' in find field of search option
And I verify 'Outright Sales' is displayed in kind field of search option region
When I select Postings option in filter by label
And I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click investing as drop down field
And I clear general partner option in investing as drop down field
And I click on asset interest
And I click on asset type field in investment direct into search
And I select a asset type office in investment direct into search
Then I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click on asset type field in investment direct into search
And I clear asset type drop down in investment direct into search
And I click on 'RiskProfile' drop down field in investment direct into project
And I select core plus option in risk profile
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I clear core plus option in risk profile
And I click on deal stage drop down field
And I select owned option in deal stage drop down field
Then I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click on deal stage drop down field
And I clear owned option in deal stage drop down field
And I click on current asset status drop down field
And I select fully rented option in current asset status field
Then I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click on current asset status drop down field
And I clear fully rented option in current asset status field
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I click on return profile in investment direct into
And I select COC percent value in return profile field of investment direct into
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear COC percent value in return profile field of investment direct into
And I select IRR percent in return profile of investment direct into
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear IRR percent in return profile of investment direct into
And I select ROE percent in return profile of investment direct into
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear ROE percent in return profile of investment direct into
And I select CAP percent in return profile of investment direct into
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear CAP percent in return profile of investment direct into
And I select holding min in return profile of investment direct into
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear holding min in return profile of investment direct into
And I select holding max in return profile of investment direct into
Then I verify 'Project Deal' and 'List Project' of investments is not displayed
When I clear holding max in return profile of investment direct into
And I click on geographical coverage field in investment search
And I click on countries field in investment search
And I select United States checkbox in countries field of investment search
And I click on region field in investment search
And I click on NorthEast region in investment search
And I click on states field in investment search
And I click on New Jersey state in investment search
And I click on cities field in investment search
And I enter and select Kearny city in investment search
Then I verify 'ProjectD' and 'ProjectL1' of investments is not displayed
When I logout from RealConnex application
