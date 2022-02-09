Feature: smoke test
  Testing the crucial function of the website


  Scenario: website loading
    When home page is loaded
    Then verify that all the tabs are loaded

  Scenario: Available flight for round trip should be displayed when searched
    When home page is loaded
    And click the flights at main tabs
    And set up the locations
    And click search button
    Then verify that available results are displayed

  Scenario: checks out one way fight dir the date
    When home page is loaded
    And click the flights at main tabs
    And click one-way trip
    And set up the locations
    And check flight for date "Jan 15, 2022"
    And click search button
    Then verify that available results are displayed
