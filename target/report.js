$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/TrainBooking.feature");
formatter.feature({
  "name": "TrainBooking",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Train"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Book a Train in RedBus application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enters the value in from place \"\u003cFromPlace\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the value in to place \"\u003cToPlace\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on date",
  "keyword": "And "
});
formatter.step({
  "name": "User selects a date in the Date Dropdown",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the buses displayed as per given value",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FromPlace",
        "ToPlace"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Tiruchchirapali"
      ]
    }
  ]
});
formatter.background({
  "name": "Application Launch",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the browser and application \"https://www.redbus.in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.redBus.StepDefinition.BusBooking.launch_the_browser_and_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Book a Train in RedBus application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Train"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enters the value in from place \"Chennai\"",
  "keyword": "When "
});
formatter.match({
  "location": "in.redBus.StepDefinition.BusBooking.user_enters_the_value_in_from_place(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the value in to place \"Tiruchchirapali\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus.StepDefinition.BusBooking.user_enters_the_value_in_to_place(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on date",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus.StepDefinition.BusBooking.user_clicks_on_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects a date in the Date Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus.StepDefinition.TrainBooking.user_selects_a_date_in_the_date_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus.StepDefinition.TrainBooking.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the buses displayed as per given value",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus.StepDefinition.TrainBooking.validate_the_buses_displayed_as_per_given_value()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});