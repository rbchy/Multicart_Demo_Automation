Feature: Login Feature Of the Internet Page 

  ############ HOOOOKS in COmputer ###############
  ########## Very nice Way to use some Similar Steps before ANy Scenarios
  Background: 
  
    Given I Open my computers "chrome" browser
    And I browse to mct website using url "http://the-internet.herokuapp.com/"
    And I click on "Form Authentication" "Link"

  Scenario: Successfull login to Internet Page secure area
    When I Enter "tomsmith" on "UserName" Text Box
    And I Enter "SuperSecretPassword!" on "Password" Text Box
    And I click on "Login" "Button"
    Then I validate a text "You logged into a secure area!"

  Scenario: Error login to Internet Page secure area
    When I Enter "random" on "UserName" Text Box
    And I Enter "random!" on "Password" Text Box
    And I click on "Login" "Button"
    Then I validate a text "Your username is invalid!"

  Scenario: Error Black Password Filed
    When I Enter "tomsmith" on "UserName" Text Box
    And I Enter "random!" on "Password" Text Box
    And I click on "Login" "Button"
    Then I validate a text "Your Password is invalid!"
