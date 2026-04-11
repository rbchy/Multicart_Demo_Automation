Feature: My Account Test scearios

  @debug_may25
  Scenario: User see all my Account Options
    Given I Open my computers "chrome" browser
    And I browse to mct website using url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #### Class:Homepag Responsibility is to do all below Steps
    And I click on login link
    And I Enter user id as "user"
    And I Enter password as "pass"
    And I Click the login button
    And I click on myprofile-name link
    When I click on my-account link
    #### Class:MyAccount Page Responsibility is to do all below Steps
    #Then I expect "First" my account option link is "My Orders"
    #And I expect "second" my account option link is "Profile"
    #And I expect "Third" my account option link is "My Return Requests"
    #And I expect "Fourth" my account option link is "Change Password"
    Then I see all my account options available
      | My Orders         |
      | Profile              |
      | My Return Requests   |
      | Change Password      |
      | My Favorite Products |
      | My Favorite Sellers  |
      | Seller Dashboard     |
      
      

  ######## Try this
  ##### 1. Take THis Below Sceario to an Apporopiate Feature File
  ##### 2. Write the Code TO Appropiate Steps Code Class File
  ##### 3. COnvert the Gherkin List on step 3 as a List
  ##### 4. Creaet a Selenium.findeEments() method to get the Links text from UI
  ##### 5. use this Xpath for step 4
  #####    //h1[contains(text(),'Get to know us')]/..//a
  Scenario: User see all Get to Know us Footer Links
    Given I Open my computers "chrome" browser
    And I browse to mct website using url "https://www.demo.iscripts.com/multicart/demo/index.php"
    Then I validate all Page Footer Get to know us links are like below
      | About Us           |
      | FAQ                |
      | Help               |
      | Site Feedback      |
      | Terms & Conditions |
      | Contact Us         |
      
    ### Xapth : //div[@class='col-xs-12 col-sm-6 col-md-3']//h1[contains(text(),'Get')]/..//a
    ### Xapth : //div[@class='col-xs-12 col-sm-6 col-md-3']//h1[contains(text(),'Shop with us')]/..//a
    
