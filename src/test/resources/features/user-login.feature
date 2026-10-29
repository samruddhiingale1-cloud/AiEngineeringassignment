Feature: User Login

#  @smoke
#  Scenario: Successful login with valid credentials
##    Given the user is on the login page
#    When the user enters a valid username and password
#    And the user Submit the form
#    Then the user should be redirected to their dashboard

@smoke
  Scenario Outline: login is refused with an error
    Given the user is on the login page
    When the user logs in as "<username>" with password "<password>"
    Then an error message containing "<message>" is shown

    Examples:

      | username        | password     | message              |
      | locked_out_user | secret_sauce | locked out           |
      | standard_user   | wrong_pass   | do not match         |
      |                 | secret_sauce | username is required |
      | standard_user   |              | password is required |







