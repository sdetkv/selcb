Feature: Carfax
  Scenario: Explore Used Cars for Sale.
    Given I am on Carfax online portal
    When I explore used cars by all  Automakers
    Then I get Count and verify respective used cas sales page opened.