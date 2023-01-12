@smoke
Feature: TC_05switchCurrancy | logged in users could switch currancy
  Scenario: user could switch currancy
    Given  user go to login page
    When   user login with "valid" "Mervat@Mervat.Mervat" and "Mervat Bardo"
    And    user press on login button
    And   user login to the system successfully
    And   user click on currancy dropdown menu
    And   User choose Euro
    Then  User could switch between currencies US-Euro
