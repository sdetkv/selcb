Feature: : Wallgreens

  Scenario: this is a sample scenario.
    Given I am on wallgrees page
    When perform search with keyword
      | KeyWord   | Expected Count |
      | hair Care | 30             |
      | body Care | 30             |
    When select product type as Shampoo count the items
    Then get List of items1

  @f1
  Scenario Outline: this is a sample scenario.
    Given I am on wallgrees page
    When perform search with <keyword> and <ExpectedCount>

    When select product type as Shampoo count the items
    Then get List of items
    Examples:
      | keyword   | ExpectedCount |
      | hair Care | 30            |
      | body Care | 30            |