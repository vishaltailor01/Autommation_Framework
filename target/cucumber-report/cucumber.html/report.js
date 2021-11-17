$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/feature_File/Product.feature");
formatter.feature({
  "line": 1,
  "name": "Search the product and add in a Basket",
  "description": "1. Search for a “Dell Laptop”\r\n2. Refine your search by clicking on 4GB in the left filter panel\r\n3. Pick a “2020 Newest Dell Inspiron 15 3000 PC Laptop”\r\n4. Check the price is $373.00\r\n5. Add the laptop to your basket",
  "id": "search-the-product-and-add-in-a-basket",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "User want to search Laptop Product and add in to basket .",
  "description": "",
  "id": "search-the-product-and-add-in-a-basket;user-want-to-search-laptop-product-and-add-in-to-basket-.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enter desire \"\u003cProduct\u003e\" name name in a search field",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User click on a SearchButton",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User is on a Result Page verify the text \"Dell Laptop\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User select RamSize",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User click on next page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user select the product",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User is on product Page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User verify the price",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User click on cart",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "verify product is add on a cart",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enter \"Monitor\" in a search field",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User add product in basket",
  "keyword": "And "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "search-the-product-and-add-in-a-basket;user-want-to-search-laptop-product-and-add-in-to-basket-.;",
  "rows": [
    {
      "cells": [
        "Product"
      ],
      "line": 26,
      "id": "search-the-product-and-add-in-a-basket;user-want-to-search-laptop-product-and-add-in-to-basket-.;;1"
    },
    {
      "cells": [
        "Dell Laptop"
      ],
      "line": 27,
      "id": "search-the-product-and-add-in-a-basket;user-want-to-search-laptop-product-and-add-in-to-basket-.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 25139700000,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User want to search Laptop Product and add in to basket .",
  "description": "",
  "id": "search-the-product-and-add-in-a-basket;user-want-to-search-laptop-product-and-add-in-to-basket-.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enter desire \"Dell Laptop\" name name in a search field",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User click on a SearchButton",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User is on a Result Page verify the text \"Dell Laptop\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User select RamSize",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User click on next page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user select the product",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User is on product Page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User verify the price",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User click on cart",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "verify product is add on a cart",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enter \"Monitor\" in a search field",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User add product in basket",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Dell Laptop",
      "offset": 19
    }
  ],
  "location": "LaptopStepdefs.userEnterDesireNameNameInASearchField(String)"
});
formatter.result({
  "duration": 21415440300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopStepdefs.userClickOnASearchButton()"
});
formatter.result({
  "duration": 5932852000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dell Laptop",
      "offset": 42
    }
  ],
  "location": "LaptopStepdefs.userIsOnAResultPageVerifyTheText(String)"
});
formatter.result({
  "duration": 193259700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopStepdefs.userSelectRamSize()"
});
formatter.result({
  "duration": 5945841600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopStepdefs.userClickOnNextPage()"
});
formatter.result({
  "duration": 2726706700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopStepdefs.userSelectTheProduct()"
});
formatter.result({
  "duration": 4734346000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopStepdefs.userIsOnProductPage()"
});
formatter.result({
  "duration": 211097400,
  "status": "passed"
});
formatter.match({
  "location": "LaptopStepdefs.userVerifyThePrice()"
});
formatter.result({
  "duration": 370709900,
  "status": "passed"
});
formatter.match({
  "location": "LaptopStepdefs.userClickOnAddToCart()"
});
formatter.result({
  "duration": 448346900,
  "status": "passed"
});
formatter.match({
  "location": "LaptopStepdefs.userClickOnCart()"
});
formatter.result({
  "duration": 7160775400,
  "status": "passed"
});
formatter.match({
  "location": "LaptopStepdefs.verifyProductIsAddOnACart()"
});
formatter.result({
  "duration": 169994800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Monitor",
      "offset": 12
    }
  ],
  "location": "LaptopStepdefs.userEnterInASearchField(String)"
});
formatter.result({
  "duration": 2783872000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopStepdefs.userAddProductInBasket()"
});
formatter.result({
  "duration": 5832401000,
  "status": "passed"
});
formatter.after({
  "duration": 1450001900,
  "status": "passed"
});
});