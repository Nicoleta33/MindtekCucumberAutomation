@regression @ui @porsche
Feature: Validating Porsche Price

  Scenario: Validate Base Price for Porsche 718 Cayman

    Given User navigates to Porsche application
    When User stores the price for the selected model
    And User selects the model "718 Cayman"
    Then User validates that the Base price is matched with the listed price