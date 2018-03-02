
Feature: Google Footer Links Test
I want to use this template for my feature file
 
 
 Background:
 Given As a google tester I want to test Google Footer Links
    
    Scenario: Privacy link test
    When I click on the Privacy link of google page
    Then I validate the outcomes by page source 
   

  
  Scenario: Terms link test
    When I click on the Terms link of google page
    Then I verify the outcome by page title
    
    Scenario:Settings link test
    When I click on the Settings link of google page
    Then I verify the outcome by page source
    
    
    
    
    
    
    
    #Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Table

    
