@all_activities
Feature: Perform Login and Trade

  Background:
    Given User wants to perform Trading


  Scenario Outline: Check Login
    Given user is on <login> page
    When user enters valid <username> and <password>
    And clicks on Login button
    Then user is navigated to Trading page

    Examples:
      | login                   | username | password    |
      | www.eqonex.com/login    | user 1   | password 1  |
      | www-qa.eqonex.com/login | user qa  | password qa |






