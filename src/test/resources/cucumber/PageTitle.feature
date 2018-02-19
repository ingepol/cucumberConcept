Feature: Check the page title

  Scenario: Check page title for Adoption page
    Given I am on my zoo website
     When I navigation to "Adoption"
     Then I check page title is "Adoption"
      And I close the browser

  Scenario: Check page title for About page
    Given I am on my zoo website
     When I navigation to "About"
     Then I check page title is "About"
      And I close the browser

  Scenario: Check page title for Contact page
    Given I am on my zoo website
     When I navigation to "Contact"
     Then I check page title is "Contact"
      And I close the browser
