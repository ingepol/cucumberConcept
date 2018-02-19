Feature: To test  contact form works when there are no errors

  Scenario: Check form is validated when there are no errors
    Given I am on my zoo website
     When I navigation to "Contact"
      And populate the contact forms
     Then I should be on the contact confirmation page
      And I close the browser
