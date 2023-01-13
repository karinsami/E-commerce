@smoke
Feature: TC_09addToShoppingCart | logged in users could add items to their cart
  Scenario: user could add items to their cart
    Given  user go to login page
    When   user login with "valid" "Mervat@Mervat.Mervat" and "Mervat Bardo"
    And    user press on login button
    And   user login to the system successfully
    And   user click on category
    And user add item to their cart
    Then vertify item is added to cart successfully
