#Author: jefferson.cardenas@sophossolution.com
Feature: Search for cheaper lodging near the beach

  Scenario: search for a successful flight
    Given I am on the main booking page "https://www.booking.com/index.es.html"
    When looking for accommodation
      | arrival      | San Andrés, Colombia |
      | dateCheckin  | 31-agosto 2022       |
      | dateCheckout | 4-septiembre 2022    |
      | adults       |                    2 |
      | children     |                    0 |
      | rooms        |                    2 |
    Then I see the available accommodations
      | currency | COP |
