Feature: To Test Orange HRM web Application

  Scenario Outline: To Test Login Functionality
    Given The User is on Login page "<URL>"
    Then user enters username "<USERNAME>"
    And user enters password "<PASSWORD>"
    Then User clicks on LOgInButton

    Examples: 
      | URL                                        | USERNAME | PASSWORD |
      | https://opensource-demo.orangehrmlive.com/ | Admin    | admin123 |
