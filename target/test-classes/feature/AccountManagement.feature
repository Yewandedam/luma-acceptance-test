@accountManagement
Feature: Account Management

  @createAccount
  Scenario Outline: Create account using a valid Email
    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then my account page is displayed

    Examples:
      | FirstName | LastName | Email                | Password    | ConfirmPassword |
      | John      | Doe      | Johndoe456@gmail.com | Johndoe123. | Johndoe123.     |

  @accountLogin
  Scenario Outline: Account login- Registered customer
    Given I am on customer login page
    When I enter "<Email>" "<Password>"
    And I click on login
    Then Account page is displayed

    Examples:
      | Email                | Password    |
      | Johndoe456@gmail.com | Johndoe123. |
