Feature: Automatically creating feeds

  Scenario: Create new feed template
    Given the user is on the login page
    When log in with valid credentials
    When go to Settings button under the account name
    And click to Data Source Management button
    And click Add Feet button
    And enter Feed URL and Feed Name
    Then verify item count
