@smoke
Feature: TC_08TagsSelection | logged in users could choose to filter items by tag
  Scenario: user could choose to filter items by tag
    Given  user go to login page
    When   user login with "valid" "Mervat@Mervat.Mervat" and "Mervat Bardo"
    And    user press on login button
    And   user login to the system successfully
    And   user hover over category
    And   user choose a category from sub-category menu
    And  user click on chosen tag
    Then vertify user naviagtes to tag page