Feature: To test  contact form works when there are no errors

  Background: 
    Given I am on my zoo website

  Scenario: To populate the contact form
     When I navigation to "Contact"
#      And I enter "Name test" into the name field
#      And I enter "Address test" into the address field
#      And I enter "Postcode test" into the postcode field
#      And I enter "Email test" into the email field
			And I populate the entire form
      And I submit the contact form
     Then I should be on the contact confirmation page
      And I close the browser
