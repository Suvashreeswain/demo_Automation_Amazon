Feature: Data Tables

  @datatable
  Scenario: Bill Amount Generation with list of lists example
    Given I placed an order for the following items
      | Cucumber Sandwich | 2 | 20 |
      | Chicken Sandwich  | 2 | 40 |
      | Salami Sandwich   | 2 | 50 |

    When I generate the bill
    Then A bill for $220 should be generated

  @ListOfMaps
  Scenario: Bill Amount Generation with list of maps example
    Given I placed an order for the following items one more time
      | Item Name         | Units | Price |
      | Cucumber Sandwich | 2     | 20    |
      | Chicken Sandwich  | 2     | 40    |
      | Salami Sandwich   | 2     | 50    |

    When I generate the bill
    Then A bill for $220 should be generated