Meta:
@storyType BQS

Narrative:
As a user
Perform: "Design, Build & Engineering >> Engineer >> Environmental Engineer" search and Verify that companies of "Design, Build & Engineering" role with "We are a" as "Environmental Engineer" are retrieved.

Scenario: TC 150258 :  Search and Verify the company of "Design, Build & Engineering role" role in "Design, Build & Engineering >> Environmental Engineer" search
When I update TestCaseId 150258
When I update TestCaseName Perform: "Design, Build & Engineering >> Engineer >> Environmental Engineer" search and Verify that companies of "Design, Build & Engineering" role with "We are a" as "Environmental Engineer" are retrieved.
When I launch RealConnex application
And I click on Log In button in RealConnex login page
And I enter user email ID
And I enter Password
And I click on login button
Then I should see 'RCMP MarketPlace' image
When I click on 'RCMP MarketPlace' button
And I click on 'Design, Build & Engineering' link
And I click on 'Engineer' link
And I click on 'Environmental Engineer' link
Then I verify 'Design Build & Engineering' is displayed in find of search option
And I verify 'Environmental Engineer' is displayed in provider of search option
When I click on service drop down field
And I select energy conservation option in service drop down field
Then I verify 'ACN Inc Company' is displayed in search result of DBE search
When I click on service drop down field
And I clear energy conservation option in service drop down field
And I click on asset focus drop down
And I select solar option in asset focus drop down
Then I verify 'ACN Inc Company' is displayed in search result of DBE search
When I click on asset focus drop down
And I clear solar option in asset focus drop down
And I click on engagement stage drop down
And I select design option in engagement stage drop down field
Then I verify 'ACN Inc Company' is displayed in search result of DBE search
When I click on engagement stage drop down
And I clear design option in engagement stage drop down field
And I set the value for year in business field in DBE search
Then I verify 'ACN Inc Company' is displayed in search result of DBE search
When I clear the value for year in business field in DBE search
And I set the value for average project value field in DBE search
Then I verify 'ACN Inc Company' is displayed in search result of DBE search
When I clear the value for average project value field in DBE search
And I click on geographical coverage field
And I click on countries field
And I select United States checkbox in countries field
And I click on region field
And I click on MidWest region
And I click on states field
And I click on Wisconsin state
And I click on cities field
And I enter and select Eden city
Then I verify 'ACN Inc Company' is displayed in search result of DBE search
When I logout from RealConnex application



