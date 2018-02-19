Feature: To test the high level functionally of the zoo test page

  Background: 
    Given I am on my zoo website

  Scenario: To set the start date
    When I navigation to "Adoption"
    Then I set the start date to "Today"
    Then I close the browser

  Scenario: To populate the contac form
    When I navigation to "Contact"
    Then populate the contact forms
    Then I close the browser

  Scenario: Check page title for About page
    When I navigation to "About"
    Then I check page title is "About"
     And I close the browser

  Scenario: Check page title for About page
    When I navigation to "Home"
    Then I check page title is "Home"
     And I close the browser
