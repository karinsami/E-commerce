@smoke
Feature: TC_12createOrder | logged in users could place orders successfully
  Scenario: user could place orders successfully
    Given  user go to login page
    When   user login with "valid" "Mervat@Mervat.Mervat" and "Mervat Bardo"
    And    user press on login button
    And   user login to the system successfully
    And   user click on category
    And user add item to their cart
    And  user navigate to cart
    And user accept terms and conditions
    And user click on checkout
    And user fill in his data
    Then order is placed successfully
