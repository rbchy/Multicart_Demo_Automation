Feature: Selenium Frame Switch Learning

	@frame
  Scenario: Working With Frame
    Given I Open my computers "chrome" browser
    And I browse to mct website using url "http://the-internet.herokuapp.com/nested_frames"
    Then I can acccess the Left Frame Text
    And I can acccess the Middle Frame Text
    And I can acccess the Right Frame Text by switching one by one
    And I Navigate to Iframe Page
    And I Also can acccess  Iframe
