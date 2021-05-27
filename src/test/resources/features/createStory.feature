Feature: create story

  Scenario: Create story from template
    Given the user is on the login page
    When log in with valid credentials
    When click to Go To Content button
    And click to Add Story Group button
    And select Create From Template option
    And select source Landscape
    And set placeholders
    And set group photo and name
    Then verify the story is active