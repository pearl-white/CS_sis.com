Feature: Etsy Search feature
  This is using POM design with BDD

  @etsy
  Scenario: Etsy title verification using search feature.
    Given user is on https://www.etsy.com
    When user types "Wooden spoon" in the search box
    And  user clikcs search button
    Then user sees "Wooden spoon" is in the title


