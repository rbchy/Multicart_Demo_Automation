Feature: Login Mechanism Test scearios 

  Background: 
    Given I Open my computers "chrome" browser
    And I browse to mct website using url "https://www.demo.iscripts.com/multicart/demo/index.php"
    And I click on login link

 @wipnew
  Scenario: Successfull Login as a User
    And I Enter user id as "user"
    And I Enter password as "pass"
    When I Click the login button
    Then I expect my profile name text as "james williams"

  Scenario: Login with Invalid ID
    And I Enter user id as "invalid"
    And I Enter password as "pass"
    When I Click the login button
    Then I expect an error text as "invalid username or password. try agian with correct details."

  Scenario: Blank user name Entry Error Show Up
    And I Enter user id as ""
    And I Enter password as "pass"
    When I Click the login button
    Then I expect an error name text as "Enter username"

  Scenario: Blank Password Entry Error Show Up
    And I Enter user id as "user"
    And I Enter password as ""
    When I Click the login button
    Then I expect an error password text as "Enter password"

  Scenario: Successfull Login & log out of a New User
    And I click on signup button
    When I complete the registration form for a new "userxy004"
    Then I expect my profile name text as "Mr Auto userxy004"
    And I logout for the user

 
  Scenario: Forgot Password Reover
    And I click on forgotpassword link
    And I enter regemail as "abc@aa.bb"
    When I click on reset password button
    Then I validate a error text as "a error "
