@smokeTest
Feature: Ability to create a new record for community registration
  Sign off - (Pending)

  @TC_001
  Scenario: Registration for community Marathi
    Given Navigate to "https://www.marathishaadi.com/"
    And Click on SignUp Option
    And Enter Below Details
    |Email           |Password|
    |AA24534@gmail.com|password@123|
    And Create profile for "Self"
    And Select Gender
    And Validate Mother Tongue to "Marathi"
    
   @TC_002
  Scenario: Registration for community Marathi
    Given Navigate to "https://www.gujaratishaadi.com/"
    And Click on SignUp Option
    And Enter Below Details
    |Email            |Password|
    |Guj4534@gmail.com|password@123|
    And Create profile for "Self"
    And Select Gender
    And Validate Mother Tongue to "Gujarati"
    
   