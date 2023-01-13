@smoke
  Feature: TC_01registration | user is able to register with new account

    Scenario: guest user is able to register with valid data successfully
      Given user navigate to registration page
      When  user select gender type
      And   user enter first name "automation" and last name "tester"
      And   user enter date of birth
      And   user enter email "test@example.com" field
      And   user fills Password fields "P@ssw0rd" "P@ssw0rd"
      And   user clicks on register button
      Then  success message is displayed
