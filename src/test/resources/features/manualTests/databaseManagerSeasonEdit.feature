Feature: Database Season Table Edit

  Scenario: Adding a new season
    Given I am on Admin/Season Table page
    And The system date is between jul 1 and august 31
    When I click on Új szezon hozzáadása gomb
    Then I see a new season generated in the table

  Scenario: Can't add new season outside of jul 1 - august 31
    Given I am on Admin/Season Table page
    And The system date is outside jul 1 and august 31
    When I click on Új szezon hozzáadása gomb
    Then I see a popup telling me that the date must be between jul 1 and august 31 to add