Feature: demo feature

  Background:
    Given homepage is opened


  Scenario: register verification
    Given homepage is opened
    When clicks on sign up button
    Then user should see register page

  Scenario: Category check
    And clicks "Mobilya" under "Ev & Yaşam"
    When clicks on 1st product
    Then user should see add to cart button

  @wip
  Scenario Outline: Verify search result
    When search for "<searchKey>"
    Then user should see search result
    Examples:
      | searchKey   |
      | ayakkabı    |
      | gömlek      |
      | diş fırçası |



