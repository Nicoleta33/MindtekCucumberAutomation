@regression @elarLogistics
Feature: Validates search engine functionality

  Background: Logging in to app
    Given User navigates to application Elar Logistic
    When User logs in with user name "student@mindtekbootcamp.com" and  password "ilovejava"
    And User click on login in btn


    @search
  Scenario: Validates Search Button Appearing
    Then Validates search engine


    Scenario: Create and Validates a company in to company List
      And User click on a company btn
      And User click on search btn
      Then User click on (aad company) btn
      And User created company
        | NAME | COMPANY TYPE   | STATUS | MC#        | DOT#       | IFTA | PHONE      | STREET           | CITY    | STATE    | ZIP CODE | EMAILE                    | INSURANCE   | PRODUCER PHONE | PRODUCER STREET     | PRODUCER CITY | PRODUCED STATE | PRODUCED ZIP CODE | PRODUCER EMAIL       | EMPLOYER ID NUMBER | OTHER INSURANCE | NOTES              |
        | ABC  | Broker company | Active | 1234567890 | 0987654321 | Yes  | 7733153678 | 5441 Main Avenue | Chicago | Illinois | 60539    | marielagongales@gmail.com | Progressive | 7753153677     | 4567 Levaine Avenue | Lombard       | Illinois       | 45789             | ginapistol@gmail.com | 12-3456789         | NO              | please Pay in time |
      And User validates company name "Broker company"

      Scenario: User Validates all tags
        Then User type ""