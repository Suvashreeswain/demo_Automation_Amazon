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
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: e2e

Background: Setup a menu item
    Given I have a menu item with name "Chicken Sandwich" and price 35
    When I add that menu item
    Then Menu item with name "Chicken Sandwich" should be added
	
	@SmokeTest @RegressionTest
  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber sandwich" and price $20
    When I add that menu item
    Then Menu item with name "Cucumber Sandwich" should be added
    
	@RegressionTest
  Scenario: Add another menu item
    Given I have a menu item with name "Cucumber Salad" and price 15
    When I add that menu item
    Then Menu item with name "Cucumber Salad" should be added
    
	@NightlyBuildTest @RegressionTest
  Scenario: Add third menu item
    Given I have a menu item with name "Chicken Sandwich" and price 35
    When I add that menu item
    Then Menu item with name "Chicken Sandwich" should be added
