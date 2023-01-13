@smoke
Feature: TC_11Comparelist | users could add items to their Comparelist
  Scenario: users could add items to their Comparelist
    Given  user go to login page
    When   user login with "valid" "Mervat@Mervat.Mervat" and "Mervat Bardo"
    And    user press on login button
    And user click on add to Comparelist icon
    Then item is added to Comparelist successfully
