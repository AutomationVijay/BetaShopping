Feature: Profile and Asset List Feature

  Scenario: TC001 - Get profile and Asset list
    Given Open AlterShop application and assets
    When Get the asset detail
    Then click on creaters name
    And get the list of all assets
