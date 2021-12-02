Feature: gittigidiyor page tests

@wip
  Scenario: login tests
    Given I open the homepage
    And I open the login page
    And I fill usernamebox with "stemizsoyy"
    And I fill passwordbox with "deneme1234"
    When I click on login button
    Then I should see logged in
  Scenario: demo2
    Given login as "personal"

