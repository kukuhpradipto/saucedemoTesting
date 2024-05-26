@All @Transaction
Feature: Transaction
  Scenario: Transactions with three selected products and deleting one product during the verify check out process
    Given User already on login page
    When User input username with valid username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page
    And User click button Add to Cart first product with name Sauce Labs Backpack
    And User verify change make Remove Button at first product
    And User click button Add to Cart second product with name Sauce Labs Bolt T-Shirt
    And User verify change make Remove Button at second product
    And User click button Add to Cart third product with name Sauce Labs Fleece Jacket
    And User verify change make Remove Button at third product
    And User verify the number of product selected is the same as in the Cart Icon
    Then User click on icon cart to step verify product
    And User delete product with name Sauce Labs Backpack
    And Users verify products with the name Sauce Labs Backpack are missing on the list
    And User click checkout button
    When User input Firs Name field on form Detail information
    And User input Last Name field on form Detail information
    And User input Postal Code field on form Detail information
    And User click Continue Button fot next step
    And User verify price total product
    And User verify tax nominal base on price total product
    And User click button finish
    Then User complete order


  Scenario: Transactions with three selected products and Check out form information not input data all field
    Given User already on login page
    When User input username with valid username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page
    And User click button Add to Cart first product with name Sauce Labs Backpack
    And User verify change make Remove Button at first product
    And User click button Add to Cart second product with name Sauce Labs Bolt T-Shirt
    And User verify change make Remove Button at second product
    And User click button Add to Cart third product with name Sauce Labs Fleece Jacket
    And User verify change make Remove Button at third product
    And User verify the number of product selected is the same as in the Cart Icon
    Then User click on icon cart to step verify product
    And User delete product with name Sauce Labs Backpack
    And Users verify products with the name Sauce Labs Backpack are missing on the list
    And User click checkout button
    When User input Firs Name field on form Detail information with blank data
    And User input Last Name field on form Detail information with blank data
    And User input Postal Code field on form Detail information with blank data
    And User click Continue Button fot next step
    And show information First Name is required


  Scenario: Transactions with three selected products and input first name in Check out form information with blank data
    Given User already on login page
    When User input username with valid username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page
    And User click button Add to Cart first product with name Sauce Labs Backpack
    And User verify change make Remove Button at first product
    And User click button Add to Cart second product with name Sauce Labs Bolt T-Shirt
    And User verify change make Remove Button at second product
    And User click button Add to Cart third product with name Sauce Labs Fleece Jacket
    And User verify change make Remove Button at third product
    And User verify the number of product selected is the same as in the Cart Icon
    Then User click on icon cart to step verify product
    And User delete product with name Sauce Labs Backpack
    And Users verify products with the name Sauce Labs Backpack are missing on the list
    And User click checkout button
    When User input Firs Name field on form Detail information with blank data
    And User input Last Name field on form Detail information
    And User input Postal Code field on form Detail information
    And User click Continue Button fot next step
    And show information First Name is required


  Scenario: Transactions with three selected products and input last name in Check out form information with blank data
    Given User already on login page
    When User input username with valid username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page
    And User click button Add to Cart first product with name Sauce Labs Backpack
    And User verify change make Remove Button at first product
    And User click button Add to Cart second product with name Sauce Labs Bolt T-Shirt
    And User verify change make Remove Button at second product
    And User click button Add to Cart third product with name Sauce Labs Fleece Jacket
    And User verify change make Remove Button at third product
    And User verify the number of product selected is the same as in the Cart Icon
    Then User click on icon cart to step verify product
    And User delete product with name Sauce Labs Backpack
    And Users verify products with the name Sauce Labs Backpack are missing on the list
    And User click checkout button
    When User input Firs Name field on form Detail information
    And User input Last Name field on form Detail information with blank data
    And User input Postal Code field on form Detail information
    And User click Continue Button fot next step
    And show information Last Name is required


  Scenario: Transactions with three selected products and input portal code in Check out form information with blank data
    Given User already on login page
    When User input username with valid username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page
    And User click button Add to Cart first product with name Sauce Labs Backpack
    And User verify change make Remove Button at first product
    And User click button Add to Cart second product with name Sauce Labs Bolt T-Shirt
    And User verify change make Remove Button at second product
    And User click button Add to Cart third product with name Sauce Labs Fleece Jacket
    And User verify change make Remove Button at third product
    And User verify the number of product selected is the same as in the Cart Icon
    Then User click on icon cart to step verify product
    And User delete product with name Sauce Labs Backpack
    And Users verify products with the name Sauce Labs Backpack are missing on the list
    And User click checkout button
    When User input Firs Name field on form Detail information
    And User input Last Name field on form Detail information
    And User input Postal Code field on form Detail information with blank data
    And User click Continue Button fot next step
    And show information Postal Code is required


  Scenario: Transactions with three selected products and Check out form information input invalid data all field
    Given User already on login page
    When User input username with valid username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page
    And User click button Add to Cart first product with name Sauce Labs Backpack
    And User verify change make Remove Button at first product
    And User click button Add to Cart second product with name Sauce Labs Bolt T-Shirt
    And User verify change make Remove Button at second product
    And User click button Add to Cart third product with name Sauce Labs Fleece Jacket
    And User verify change make Remove Button at third product
    And User verify the number of product selected is the same as in the Cart Icon
    Then User click on icon cart to step verify product
    And User delete product with name Sauce Labs Backpack
    And Users verify products with the name Sauce Labs Backpack are missing on the list
    And User click checkout button
    When User input Firs Name field on form Detail information with invalid data
    And User input Last Name field on form Detail information with invalid data
    And User input Postal Code field on form Detail information with invalid data
    And User click Continue Button fot next step
    And show information Input valid data


  Scenario: Transactions with three selected products and Check out form information input one hundred words data all field
    Given User already on login page
    When User input username with valid username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page
    And User click button Add to Cart first product with name Sauce Labs Backpack
    And User verify change make Remove Button at first product
    And User click button Add to Cart second product with name Sauce Labs Bolt T-Shirt
    And User verify change make Remove Button at second product
    And User click button Add to Cart third product with name Sauce Labs Fleece Jacket
    And User verify change make Remove Button at third product
    And User verify the number of product selected is the same as in the Cart Icon
    Then User click on icon cart to step verify product
    And User delete product with name Sauce Labs Backpack
    And Users verify products with the name Sauce Labs Backpack are missing on the list
    And User click checkout button
    When User input Firs Name field on form Detail information with one hundred words data
    And User input Last Name field on form Detail information with one hundred words data
    And User input Postal Code field on form Detail information with one hundred words data
    And User click Continue Button fot next step
    And Show information your data very long

  Scenario: Transactions with three selected products and Check out form information input one hundred words data all field
    Given User already on login page
    When User input username with valid username
    And User input password with valid password
    And User click button button Login
    Then User navigated to Home Page
    And User click button Add to Cart first product with name Sauce Labs Backpack
    And User verify change make Remove Button at first product
    And User click button Add to Cart second product with name Sauce Labs Bolt T-Shirt
    And User verify change make Remove Button at second product
    And User click button Add to Cart third product with name Sauce Labs Fleece Jacket
    And User verify change make Remove Button at third product
    And User verify the number of product selected is the same as in the Cart Icon
    Then User click on icon cart to step verify product
    And User delete product with name Sauce Labs Backpack
    And Users verify products with the name Sauce Labs Backpack are missing on the list
    And User click checkout button
    When User input Firs Name field on form Detail information with one letter data
    And User input Last Name field on form Detail information with one letter data
    And User input Postal Code field on form Detail information with one letter data
    And User click Continue Button fot next step
    And Show information your data very short
