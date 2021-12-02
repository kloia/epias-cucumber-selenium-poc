Feature: gittigidiyor page tests

  Scenario: login tests
    Given I open the homepage
    And I open the login page
    And I fill usernamebox with "stemizsoyy"
    And I fill passwordbox with "deneme1234"
    When I click on login button
    Then I should see logged in

  Scenario: demo2
    Given I open the homepage
    When I open the mobile app page
    Then I should see mobile app page


