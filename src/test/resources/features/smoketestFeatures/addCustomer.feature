Feature: Add customer
  user should be able to add customer

  Scenario: Add customer
    Given user is on homepage
    And   click on Manager Login link
    And   click on add customer link
    And   enter customers info
    And   click on add customer button
    Then  verify customer is added successfully
