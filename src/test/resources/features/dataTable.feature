Feature: Examples of Cucumber data table implementations

  Scenario: Something happens
    #Given user does something
    Then user should see below words displayed
      | Apple      |
      | Kiwi       |
      | Orange     |
      | Strawberry |
      | Mango      |
      | Tomato     |



  Scenario: Library login example using data table
    Given user is on the login page of library app
    When user enter username and password as below
      | username | librarian13@library |
      | password | 9rf6axdD            |
    Then user should see title is something

  @data
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January |
      | February |
      | March |
      | April |
      | May |
      | June |
      | July |
      | August |
      | September |
      | October |
      | November |
      | December |

    #To fix pipes' order
  #MAC: command + option + L
  #Window: Control + Shift + L