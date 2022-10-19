Feature: Final Bill Calculation

  @ScenarioOutlineExample
  Scenario Outline: Customer bill amount calculation
    Given I have a customer
    And User enters initial bill amount as <InitialBillAmount>
    And Sales Tax rate is <TaxRate> percent
    Then final bill amount calculate is <CalculatedBillAmount>
    Examples:
      | InitialBillAmount | TaxRate | CalculatedBillAmount |
      | 100               | 10      | 110                  |
      | 200               | 8       | 216                  |
