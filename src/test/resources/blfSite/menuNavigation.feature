Feature: Menu navigation on main page
  Scenario: Links menu is working
    Given I am on the main page
    When I hoover the mouse over links
    Then I should see all the basketball related menupoints