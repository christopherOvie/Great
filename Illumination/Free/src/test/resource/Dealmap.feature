@ignore
Feature: Deal Data creation

  Scenario: Free CRM Deal Data Creation
    Given I am on Login page
    And I enter login button
    And I click the Classic CRM button
    Then I enter enters username and password
      | username       | password  |
      | christophodibo | Tkogl1979 |
      
    And I  clicks login button
    Then I am on home page
    And I move on to new deal page
    And I enter deal details
    
      | Title | Amount | Probability | Commision |
      | Mr    |   5000 |          20 |        50 |
      | Mrs   |   4000 |          10 |        75 |
      | Dr    |   2000 |          55 |        45 |
    And I click on the save button
    And I verify that I am on new contact page
    Then I close the browser
