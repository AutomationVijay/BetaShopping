Feature: Search and Filter Feature

  Scenario: TC001 - Search for an asset by keyword
    Given Open AlterShop application for search
    When Enter a valid keyword into the search bar
    And Click the search button for search
    And Asset visibles in the grid for search

  Scenario: TC002 - Search with invalid keyword
    Given Open AlterShop application for search
    When Enter a invalid keyword into the search bar
    And Click the search button for search
    And Asset not visibles in the grid for search

  Scenario: TC003 - Apply filter by sort
    Given Open AlterShop application for search
    When Enter a valid keyword into the search bar
    And Click the search button for search
    And Apply a filter by selecting a sort by for search

  Scenario: TC004 - Apply filter by price
    Given Open AlterShop application for search
    When Enter a valid keyword into the search bar
    And Click the search button for search
    And Apply a filter by selecting a price range for search

  Scenario: TC005 - Apply multiple filters
    Given Open AlterShop application for search
    When Enter a valid keyword into the search bar
    And Click the search button for search
    And Apply a filter by selecting a sort by and price range for search
