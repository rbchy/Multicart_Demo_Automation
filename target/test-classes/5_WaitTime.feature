
Feature: Wait time learnig 

Background: Jetty server Initiliaze
  #### Dont Coment this Code 
	Given a jetty server started

@wait
Scenario: Loading Three Dynamic Timed Element
 Given I Open my computers "chrome" browser
 And I browse to mct website using url "http://localhost:8886/Sample-Web/dynamicWebElementLoading.htm"
 
  When I click button load element One
  Then I Expect Hellow World One Displayed in Page
   
  And I click button load element Two
  Then I Expect Hellow World Two Displayed in Page   
 
  And I click button load element Three
  Then I Expect Hellow World Three Displayed in Page  
  
    
  ###### This Button Can Create Issue   
  And I click button load element four
  Then I Expect Hellow World four Displayed in Page   
  
  
  #### Dont Coment this Code 
  And I close the jetty server
  