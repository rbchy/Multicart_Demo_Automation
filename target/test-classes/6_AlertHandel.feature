Feature: Alert

  @alert
  Scenario: web page Alert Handeling
    Given I Open my computers "chrome" browser
    And I browse to mct website using url "http://the-internet.herokuapp.com/javascript_alerts"
    When I click for js alert button
    Then I can Accept the Alert and get result
