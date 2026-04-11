Feature: Selenium Multiple Window


	@multiWindow
  Scenario: Working With Multiple WIndow
    Given I Open my computers "chrome" browser
    And I browse to mct website using url "http://the-internet.herokuapp.com/windows"
    And I click on new window button
    And I can get the text from new window
    And I get back to parent & print parents Heeading