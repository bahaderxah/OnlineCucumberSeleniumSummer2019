@smoke_test
Feature: Smoke test

  Background: open login page and login as store manager
    Given user is on the login page
    Then user logs in as driver

     Scenario: Verify dashboard page
    And user verifies that "Dashboard" page subtitle is displayed


  Scenario: Verify Manage dashboard page
    And user navigates to "Dashboard" then to  "Manage Dashboard"
    Then user verifies that "All Manage Dashboard" page subtitle is displayed

  Scenario: Verify Vehicle page
    And user navigates to "Fleet" then to "Vehicles"
    Then user verifies that "All Cars" page subtitle is displayed

  Scenario: Verify Accounts page
    And user navigates to "Customers" then to "Accounts"
    Then user verifies that "All Accounts" page subtitle is displayed
