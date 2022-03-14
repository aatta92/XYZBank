Feature: Login
  user should be able to login into the system selecting user's associated name

  @test
  Scenario: Login
    Given user is on homepage
    And   click on customer login button
    And   select user name
    And   click on login button
    Then  verify user is logged in successfully