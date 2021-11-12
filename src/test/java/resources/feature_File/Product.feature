Feature: Search the product and add in a Basket
  User want to search for a "Dell Laptop" product and add product in a basket.

  Background: User is on a HomePage

  @Smoke
  Scenario Outline: User add product in a search field.
    Given User enter desire "<Product>" name name in a search field
    When User click on a SearchButton
    Then User is on a Result Page verify the text <"Dell Laptop">
    When User select RamSize

    Examples:

      | Product     |
      | Dell Laptop |





