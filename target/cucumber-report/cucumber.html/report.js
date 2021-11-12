$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/feature_File/Product.feature");
formatter.feature({
  "line": 1,
  "name": "Search the product and add in a Basket",
  "description": "User want to search for a \"Dell Laptop\" product and add product in a basket.",
  "id": "search-the-product-and-add-in-a-basket",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "User add product in a search field.",
  "description": "",
  "id": "search-the-product-and-add-in-a-basket;user-add-product-in-a-search-field.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enter desire \"\u003cProduct\u003e\" name name in a search field",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on a SearchButton",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User is on a Result Page verify the text \u003c\"Dell Laptop\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User select RamSize",
  "keyword": "When "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "search-the-product-and-add-in-a-basket;user-add-product-in-a-search-field.;",
  "rows": [
    {
      "cells": [
        "Product"
      ],
      "line": 15,
      "id": "search-the-product-and-add-in-a-basket;user-add-product-in-a-search-field.;;1"
    },
    {
      "cells": [
        "Dell Laptop"
      ],
      "line": 16,
      "id": "search-the-product-and-add-in-a-basket;user-add-product-in-a-search-field.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10418883901,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is on a HomePage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 16,
  "name": "User add product in a search field.",
  "description": "",
  "id": "search-the-product-and-add-in-a-basket;user-add-product-in-a-search-field.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enter desire \"Dell Laptop\" name name in a search field",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on a SearchButton",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User is on a Result Page verify the text \u003c\"Dell Laptop\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User select RamSize",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Dell Laptop",
      "offset": 19
    }
  ],
  "location": "ProductStepdefs.userEnterDesireNameNameInASearchField(String)"
});
formatter.result({
  "duration": 998614500,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.userClickOnASearchButton()"
});
formatter.result({
  "duration": 3479508399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dell Laptop",
      "offset": 43
    }
  ],
  "location": "ProductStepdefs.userIsOnAResultPageVerifyTheText(String)"
});
formatter.result({
  "duration": 315643601,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[\"Dell Laptop\"]\u003e but was:\u003c[Dell Laptop]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.amazon.pages.Product.userIsOnAResultPage(Product.java:41)\r\n\tat com.amazon.step_Def.ProductStepdefs.userIsOnAResultPageVerifyTheText(ProductStepdefs.java:36)\r\n\tat ✽.Then User is on a Result Page verify the text \u003c\"Dell Laptop\"\u003e(src/test/java/resources/feature_File/Product.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProductStepdefs.userSelectRamSize()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2049198301,
  "status": "passed"
});
});