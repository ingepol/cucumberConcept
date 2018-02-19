Feature: Check the page title

  Scenario Outline: Test Page Heading
    Given I am on my zoo website
     When I click on <Link>
     Then I check I am on <Title>
      And I close the browser

    Examples: 
      | Link          | Title    |
      | adoption_link | Adoption |
      | about_link    | About    |
      | contact_link  | Contact  |
	