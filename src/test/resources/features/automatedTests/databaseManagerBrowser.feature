Feature: Database Manager Browser

  Scenario: Show correct data on seasons table
    Given I am on admin Page
    When I click on the seasons button
    And Order the table by ascending id
    Then The first record should be 2011-2012

  Scenario: Show correct data on leagues table
    Given I am on admin Page
    When I click on the leagues button
    And Order the table by ascending id
    Then The first record should be ismeretlen liga

  Scenario: Show correct data on matches table
    Given I am on admin Page
    When I click on the matches button
    And Order the table by ascending id
    Then The first record should be a match on 2010-09-04 13:00

  Scenario: Show correct data on players table
    Given I am on admin Page
    When I click on the players button
    And Order the table by ascending id
    Then The first record should be Bitvai Attila

  Scenario: Show correct data on teams table
    Given I am on admin Page
    When I click on the teams button
    And Order the table by ascending id
    Then The first record should be BLF Palota - NB.II.

  Scenario: Show correct data on users table
    Given I am on admin Page
    When I click on the users button
    And Order the table by ascending id
    Then The first record should be AAATesterAdmin

  Scenario: Show correct data on statistics table
    Given I am on admin Page
    When I click on the statistics button
    And Order the table by ascending id
    Then The first record should be Solymosi Tamás