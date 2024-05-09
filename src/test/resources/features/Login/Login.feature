@Login @All
Feature: Login
  Scenario: Login with account valid username and valid password
    Given User already on login page
    When User input username with valid username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page

  Scenario: Login with account invalid username and valid password
    Given User already on login page
    When User input username with invalid username
    And User input password with valid password
    And User click button button Login
    Then Show information Username and password do not match

  Scenario: Login with account valid username and invalid password
    Given User already on login page
    When User input username with valid username
    And User input password with invalid password
    And User click button button Login
    Then Show information Username and password do not match

  Scenario: Login with account valid username and blank password
    Given User already on login page
    When User input username with valid username
    And User input password with blank password
    And User click button button Login
    Then Show information password required

  Scenario: Login with account valid blank username dan valid password
    Given User already on login page
    When User input username with blank username
    And User input password with valid password
    And User click button button Login
    Then Show information username required

  Scenario: Login with account valid username and blank password
    Given User already on login page
    When User input username with locked account username
    And User input password with valid password
    And User click button button Login
    Then Show information user has been locked out

    @Login
  Scenario: Login with account problem username and valid password
    Given User already on login page
    When User input username with problem username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page
    And User click button Add to Cart first product with name Sauce Labs Backpack
    And User can't click button Add to Cart


  Scenario: Login with account slow response username and valid password
    Given User already on login page
    When User input username with valid username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page

  Scenario: Login with account slow response username and valid password
    Given User already on login page
    When User input username with error username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page
    And User click button Add to Cart first product with name Sauce Labs Backpack
    And User can't click button Add to Cart
