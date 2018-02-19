Feature: Submit a valid contact

  Scenario: Submit form using valid data
    Given I am on my zoo website
     When I navigation to "Contact"
      And I submit the form with valid data
      | Fields   | Value                         |
      | Name     | Paul Arenas                   |
      | Address  | Happy Land                    |
      | Postcode | A1 S22                        |
      | Email    | iWillSubscribe@tothis.channel |
     Then I should be on the contact confirmation page
