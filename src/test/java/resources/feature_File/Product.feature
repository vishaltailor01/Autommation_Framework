Feature: Search the product and add in a Basket
  1. Search for a “Dell Laptop”
  2. Refine your search by clicking on 4GB in the left filter panel
  3. Pick a “2020 Newest Dell Inspiron 15 3000 PC Laptop”
  4. Check the price is $373.00
  5. Add the laptop to your basket

  @Smoke
  Scenario Outline: User want to search Laptop Product and add in to basket .
    Given User enter desire "<Product>" name name in a search field
    When User click on a SearchButton
    Then User is on a Result Page verify the text "Dell Laptop"
    When User select RamSize
    When User click on next page
    When user select the product
    And User is on product Page
    And User verify the price
    When User click on add to cart
    Then  User click on cart
    And verify product is add on a cart
    When User enter "Monitor" in a search field
    And User add product in basket

    Examples:

      | Product     |
      | Dell Laptop |







