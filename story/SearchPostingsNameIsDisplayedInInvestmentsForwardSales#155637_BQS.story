Meta:
@storyType BQS

Narrative:
As a user
I verify Project type of "Forword Sales"

Scenario: TC 155637: Verify companies of Forword sales Projects are displayed when search is performed
When I update TestCaseId 155637
When I update TestCaseName Perform: Forward Sales" search Verify that "Projects" with "Forward Sales" requirement in it are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Invest or Lend' link
And I click on 'Forword Sales' Link
Then I should see 'Invest or Lend' in find field of search option
And I verify 'Forward Sales' is displayed in kind field of search option region
When I select Postings option in filter by label
And I click on project posting in 'Invest or Lend' search
And I return back to the searched page
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Invest or Lend' link
And I click on 'Forword Sales' Link
When I click route to sponsor field
And I select direct only option in route to sponsor drop down
Then I verify project posting is displayed in Invest or Lend search
When I click route to sponsor field
And I clear direct only option in route to sponsor drop down
And I click on asset interest
And I click on asset type field in investment direct into search
And I select a asset type office in investment direct into search
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
When I click on asset type field in investment direct into search
And I clear asset type drop down in investment direct into search
When I click on 'RiskProfile' drop down field in investment direct into project
And I clear core in risk profile drop down of investment direct into project
And I click on 'RiskProfile' drop down field in investment direct into project
And I select core option in risk profile drop down of investment direct into project
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
And I click on deal stage drop down field
And I select owned option in deal stage drop down field
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
When I clear owned option in deal stage drop down field
And I click on current asset status drop down field
And I select fully rented option in current asset status field
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
And I click on asset strategy drop down
And I select acquisition option in asset strategy field
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
When I click on return profile in investment direct into
And I select COC Percent value in return profile
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
When I clear COC Percent value in return profile
And I enter values for capital return IRR
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
When I clear IRR Percent value in return profile
And I select ROE Percent value in return profile
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
When I clear ROE Percent value in return profile
And I select CAP Percent value in return profile
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
When I clear CAP Percent value in return profile
And I select holding min value in return profile
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
When I clear holding min value in return profile
And I select holding max value in return profile
Then I verify project posting is displayed in Invest or Lend search
And I verify listing project of investments is displayed
When I clear holding max value in return profile
When I logout from RealConnex application








