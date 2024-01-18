Feature: feature to test login functionality
  @SmokeTest
  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page


#when parameterizing
 ## Scenario Outline: Check login is successful with valid credentials
   # Given user is on login page
    #When user enters <username> and <password>
    #And clicks on login button
    #Then user is navigated to home page

    #Examples:
     # | username | password |
      #| admin1   | pass1    |
      #| admin2   | pass2    |
