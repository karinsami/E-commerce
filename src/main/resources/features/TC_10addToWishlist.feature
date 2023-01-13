@smoke
Feature: TC_10Wishlist | users could add items to their wishlist
  Scenario: users could add items to their wishlist
    Given  user go to login page
    When   user login with "valid" "Mervat@Mervat.Mervat" and "Mervat Bardo"
    And    user press on login button
    And user click on add to wishlist icon
    Then item is added to wishlist successfully
