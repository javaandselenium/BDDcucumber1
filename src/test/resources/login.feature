
@tag
Feature: login

  @tag1
  Scenario: login with valid details
  Given  open the browser and enter the url of appplication
  When   click on login button enter the valid username and password
  Then clcik on login button home page should be dispalyed
  
   @tag1
  Scenario: login with invalid details
  Given  open the browser
  When   Enter the url
  When   enter valid username
  And    enter the valid password
  When   clcik on login button
  Then home page is dispalyed
  
  
  

  