@smartBear
Feature: Smart bear order process

  Scenario: Smart bear order process

    Given User is on the SmartBearSoftware landing page
    When User log in into the WebOrder page with name "Tester" and password "test"
    And User go to the Order feature
    Then User should see Order header
    And User selects "FamilyAlbum" from product dropdown
    And User enters 4 to quantity
    And User enters "John Wick" to costumer name
    And User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And User enters 60056
    And User selects "Visa" as card type
    And User enters "1111222233334444" to card number
    And User enters "12/22" to expiration date
    And User clicks process button
    And User verifies "John Wick" is in the list
