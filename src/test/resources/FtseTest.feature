Feature: Summarise the FTSE-100 index fund

  Scenario: Find the top riser
    Given The correct address
    When I navigate to the risers page
    Then I can view the top riser
    
  Scenario: Find the top faller
    Given The correct address
    When I navigate to the falers page
    Then I can view the top faller
