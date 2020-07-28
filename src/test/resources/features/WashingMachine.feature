Feature: As a user I should search a product so I can select some features to filter results.

  @regression
  Scenario: After searching the washing machines, I select the features and list the products.
    Given As a user navigates to the web page.
    When Searches for Washing Machines.
    And Click on Bosch brand.
    And Selects colour of silver.
    Then Verify the results are successfully filtered silver colour Bosch Washing Machines.

