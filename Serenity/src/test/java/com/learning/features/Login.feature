
@tag
Feature: Login Feature File


  @tag1
  Scenario: Login with Valid Crendentials
    Given user is on login Page
    When user enters username and password
    And clicks on LoginButton
    Then user is on HomePage