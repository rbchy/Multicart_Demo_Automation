Feature: Create Account Mechanism Test scearios

  Background: 
    Given I Open my computers "chrome" browser
    And I browse to mct website using url "https://www.demo.iscripts.com/multicart/demo/index.php"
    And I click on login link

  Scenario: Successfull creation of new User
    And I click on signup button
    When I complete the registration form for a new "generateNew"
    Then I expect my profile name text as "Mr Auto generateNew"

  Scenario: Error on Existing User Registration.
    And I click on signup button
    When I complete the registration form for a new "user008"
    Then I expect existing reg error name text as "Please correct the following errors to continue!* User Name already exists!* The email address is already in use!.Terms & Conditions cannot be empty !"
