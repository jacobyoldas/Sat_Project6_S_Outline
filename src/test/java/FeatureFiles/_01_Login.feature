Feature: Login Functionality

  @SmokeTest@LoginSuccess
  Scenario Outline: Login with valid username and password as positive test
    Given User navigate to website
    When User enter valid "<username>" and "<password>"
    Then User should login successfully
    Then User close the website

    Examples:
      | username | password |
      | username | password |

  @Regressions
  Scenario: Login with invalid username or password as negative test
   # Given User navigate to website BAHSET CODE REUSEBILITY HOOK NEEDED
    When User enter invalid username and password
      | yasinyoldas66@outlook.com | #1234hello |
      | apple@gmail.com           | Yozgat-666  |
    Then User should NOT login and receive error message
    #Then User close the website

