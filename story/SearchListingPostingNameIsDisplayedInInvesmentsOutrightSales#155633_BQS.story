Meta:
@storyType BQS

Narrative:
As a user
I Perform: "Investments >> Outright Sales" search Verify that "Listing" with "Outright Sales" requirement in it are retrieved.

Scenario: TC 155633: Verify desired postings are displayed in "Investments >> Outright Sales" search result
When I update TestCaseId 155633
When I update TestCaseName Perform: "Investments >> Outright Sales" search Verify that "Listing" with "Outright Sales" requirement in it are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Invest or Lend' link
And I click on 'Outright Sales' link
When I select Postings option in filter by label
And I click on project posting in 'Invest or Lend' search
And I return back to the searched page
And I select value in investment amount slider
Then I verify listing project of investments is displayed
When I clear value in investment amount slider
When I select the value of deal size
Then I verify listing project of investments is displayed
And I clear the value of deal size
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Invest or Lend' link
And I click on 'Outright Sales' link
And I click investing as drop down field
And I select general partner option in investing as drop down field
Then I verify listing project of investments is displayed
When I click investing as drop down field
And I clear general partner option in investing as drop down field
And I click on asset interest
And I click on asset type field in investment direct into search
And I select a asset type office in investment direct into search
Then I verify listing project of investments is displayed
When I click on asset type field in investment direct into search
And I clear asset type drop down in investment direct into search
And I click on 'RiskProfile' drop down field in investment direct into project
And I select core option in risk profile drop down of investment direct into project
Then I verify listing project of investments is displayed
When I click on 'RiskProfile' drop down field in investment direct into project
And I clear core in risk profile drop down of investment direct into project
And I click on deal stage drop down field
And I select owned option in deal stage drop down field
Then I verify listing project of investments is displayed
When I click on deal stage drop down field
And I clear owned option in deal stage drop down field
And I click on current asset status drop down field
And I select fully rented option in current asset status field
Then I verify listing project of investments is displayed
When I click on current asset status drop down field
And I clear fully rented option in current asset status field
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify listing project of investments is displayed
When I click on asset strategy drop down
And I clear acquisition option in asset strategy field
And I click on return profile in investment direct into
And I select COC Percent value in return profile
Then I verify listing project of investments is displayed
When I clear COC Percent value in return profile
And I click Leveraged check box
Then I verify listing project of investments is displayed
When I clear Leveraged check box
And I select IRR Percent value in return profile
Then I verify listing project of investments is displayed
When I clear IRR Percent value in return profile
And I select ROE Percent value in return profile
Then I verify listing project of investments is displayed
When I clear ROE Percent value in return profile
And I click Actual check box
Then I verify listing project of investments is displayed
When I clear Actual check box
And I select CAP Percent value in return profile
Then I verify listing project of investments is displayed
When I clear CAP Percent value in return profile
And I click Pro Forma check box
Then I verify listing project of investments is displayed
When I clear Pro Forma check box
And I select holding min value in return profile
Then I verify listing project of investments is displayed
When I clear holding min value in return profile
And I select holding max value in return profile
Then I verify listing project of investments is displayed
When I clear holding max value in return profile
And I click on return profile in investment direct into
And I click on geographical coverage field in investment search
And I click on countries field in investment search
And I select United States checkbox in countries field of investment search
And I click on region field in investment search
And I click on NorthEast region in investment search
And I click on states field in investment search
And I click on New Jersey state in investment search
And I click on cities field in investment search
And I enter and select Kearny city in investment search
Then I verify listing project of investments is displayed
When I logout from RealConnex application
