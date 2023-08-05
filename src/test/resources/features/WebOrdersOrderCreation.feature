@regression @ui @webOrders @ordersCreation
Feature: Validating Order Creation
  Background: Logging in
    Given User navigates to application
    When User logs in with username "Tester" and  password "test"
    And User clicks on Orders tab

  Scenario Outline: Validating discount calculator
    When User selects "<product>" and <quantity>
    Then User validates the price is correctly calculated for <quantity>
    Examples:
    | product      | quantity   |
    | MyMoney      |    5       |
    | FamilyAlbum  |    10      |
    | ScreenSaver  |    15      |


    @placeOrder
    Scenario: Validating Order Creation functionality
      And User creates order with data
        | PRODUCT     | QUANTITY | CUSTOMER NAME | STREET     | CITY    | STATE         | ZIP   | CARD | CARD NUM  | EXP DATE |
        | ScreenSaver | 5        | Jane Doe      | 123 Lee St | Boston  | Massachusetts | 12345 | Visa | 123456789 | 01/25    |
        | FamilyAlbum | 10       | Karim Patel   | 123 Dee St | Seattle | Washington    | 45567 | Visa | 123456789 | 06/25    |

      Then User validates success message "New order has been successfully added."
      And User validates created order is in the list of all orders.