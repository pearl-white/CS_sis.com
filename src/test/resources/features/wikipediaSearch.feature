@wikipedia
Feature: Wikipedia Search feature


  Scenario: Wikipedia Search Functionality Title Verification

    Given user is on the wikipedia homepage
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" in the wiki search title

  Scenario: Wikipedia Search Functionality Title Verification

    Given user is on the wikipedia homepage
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" in the main header

  Scenario: Wikipedia Search Functionality Title Verification

    Given user is on the wikipedia homepage
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" in the image header
