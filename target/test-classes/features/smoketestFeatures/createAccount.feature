Feature: Create an account
  user should be able to open account successfully

  Scenario: Create account
    Given user is on homepage
    And   click on Manager Login link
    And   click on open account link
    And   choose customer name and currency
    And   click on process
    Then  verify user created account successfully