Feature: Google Title verifications
#Gherkin
  @googleTitle
  Scenario: Google title verification
    When User is on Google search page
    And User searches for apples
    Then User should see apples inside of the title

    @new
    Scenario: Google title verification with preferred data
      When User is on Google search page
      And User searches for a word "iphone"
      Then User should see a word "iphone" inside of the title

      @dataType
      Scenario: Google Title Test
        Given User tests with words "apple" "pen" "paper"
        Then user checks numbers 12 and 55

