Feature: Free CRM create Contact

  Scenario Outline: Free CRM create a new Contact Scenario
    Given user navigate to Login page
    And User hits the login
    And User hits the Classic CRM button
    And user verify that title of login page is CRM PRO
    Then user enters "<username>" and "<password>"
    And user clicks on login button
    Then user is on home page
    And user moves to new contact page
    And user enter new "<firstname>" and "<lastname>" and "<position>"
    And user click on save button
    And user verifies he is in new contact page
    Then user close the browser

    Examples: 
      | username       | password  | firstname   | lastname | position       |
      | christophodibo | Tkogl1979 | christopher | ovie     | Automation eng |
   #   | naveenk        | test@123  | Tom         | Peter    | Manager        |
