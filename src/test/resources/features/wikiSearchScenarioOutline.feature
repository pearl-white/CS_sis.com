@so
Feature: Wikipedia Search feature


  Scenario Outline: Wikipedia Search Functionality Title Verification

    Given user is on the wikipedia homepage
    When User types "<searchKey>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<title>" in the wiki search title

    Examples: Test data for search functionality

      | searchKey    | title        |
      | Steve Jobs   | Steve Jobs   |
      | Ricky Martin | Ricky Martin |
      | Leonel Messi | Leonel Messi |