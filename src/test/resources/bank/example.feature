Feature: Cards Remaining After Actions

  @Example-1
  Scenario: Draw Cards
    Given I start with a 50 card deck
    When I draw 5 cards
    Then There are 45 cards remaining in deck

  @Example-2
  Scenario: Draw More Cards
    Given I start with a 50 card deck
    When I draw 10 cards
    Then There are 40 cards remaining in deck
