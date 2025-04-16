Feature: Data Integrity Post Upload

  Scenario: Verify document integrity after upload
    Given I am on the document management system
    When I query the information of the document in the system
    Then the document information is retrieved correctly
    And I compare it with the original document content
    Then the data matches without any loss or corruption