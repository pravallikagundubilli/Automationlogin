Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user is on the login page
    When user enters <username> and <password>
    And clicks the login button
    Then user is navigated to the home page

    Examples:
      | username                   | password |
      | utaorg1ad1@mailinator.com  | Test@123 |
      | utaorg1lea1@mailinator.com | Test@123 |

