Feature: Some operations on Heroku app

  @consoleLog
  Scenario: checking the console logs
    Given I will be at "https://the-internet.herokuapp.com/" page
    When i will click on the "Broken Images" link

  @consoleLog
  Scenario: checking the console logs
    Given I will be at "https://the-internet.herokuapp.com/" page
    When i will click on the "Context Menu" link

  @consoleLog
  Scenario: checking the console logs
    Given I will be at "https://the-internet.herokuapp.com/" page
    When i will click on the "Hovers" link

  @consoleLog
  Scenario: checking the console logs
    Given I will be at "https://the-internet.herokuapp.com/" page
    When i will click on the "Geolocation" link
