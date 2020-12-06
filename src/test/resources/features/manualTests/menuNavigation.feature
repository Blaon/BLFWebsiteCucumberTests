Feature: Menu navigation on main page
  Scenario: Links menu is working
    Given I am on the main page
    When I hoover the mouse over links
    Then I should see all the basketball related links
#    [MKOSZ,BKSZ,PMKSZ,FIBA,NBA]

  Scenario: Introduction menu is working
    Given I am on the main page
    When I hoover the mouse over introduction
    Then I should see all the introduction menu points
#    [Klubtörténet,Célkitűzések,Alapszabály]

  Scenario: Information menu is working
    Given I am on the main page
    When I hoover the mouse over information
    Then I should see all the information menu points
#    [Házirend,Tagdíjfizetés,Felszerelés,Tao Pályázat,Támogatóink]

  Scenario: Contact menu is working
    Given I am on the main page
    When I hoover the mouse over Contact
    Then I should see all the Contact menu points
#    [Munkatársak,Termek]

  Scenario: Programs menu is working
    Given I am on the main page
    When I hoover the mouse over programs
    Then I should see all the programs menu points
#    [Egyesületi,Csapatok,Hanga Ádám Terem]

  Scenario: Results menu is working
    Given I am on the main page
    When I hoover the mouse over results
    Then I should see all the results menu points
#    [Egyesületi,Csapatok]

  Scenario: Teams menu is working
    Given I am on the main page
    When I hoover the mouse over teams
    Then I should see all the teams menu points
#    [Előkészítő,Mini,Gyermek,Serdülő,Kadet,Junior,Felnőtt]

  Scenario: Teams menu is working
    Given I am on the main page
    When I hoover the mouse over teams
    Then I should see all the teams menu points
#    [Előkészítő,Mini,Gyermek,Serdülő,Kadet,Junior,Felnőtt]