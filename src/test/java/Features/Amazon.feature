Feature: Amazon HomePage Validation

  Scenario Outline: Verify Sign in link
    Given I am in the Amazon HomePage
    When I clicks on Signin link
    And I Enter UserName <UserName> and password <Password>
    Then I Navigated to Signin Page

    Examples: 
      | UserName | Password |
      | Suresh   |    13242 |
      | Sanjay   |    54333 |
      | Uma      |    13243 |
      | Srimathi |    97756 |

  Scenario: print all links
    Given I am in the amazon Home page
    When I am in the Home page
    Then I am printing in the mobile links

  Scenario: print all links2
    Given I am in the amazon Home page
    When I am in the Home page
    Then I am printing in the mobile links
