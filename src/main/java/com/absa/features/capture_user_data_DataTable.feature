Feature: Capture User Details
  @Adduser @Adduser_DataTable
  Scenario Outline: Add new user reading data from table
    Given dataCapture was able to open the application "https://www.way2automation.com/angularjs-protractor/webtables/"
    When dataCapture adds user with details firstName "<firstName>", lastName "<lastName>", userName "<userName>", passWord "<passWord>", customer "<customer>", role "<role>", email "<email>", cell "<cell>"
    Then dataCapture should be able to see newly added user on the list "<firstName>", lastName "<lastName>", userName "<userName>", passWord "<passWord>", customer "<customer>", role "<role>", email "<email>", cell "<cell>"
    Examples:
      | firstName | lastName | userName | passWord     | customer      | role      | email                   | cell          |
      | Mable     | Slovakia | slovoM   | mbl@Pass001  |    CompanyAAA |   Admin   | Mable.Slovakia@mail.com | 27891205658   |
      | Joseph    | Malapile | maljosh  | @Passjmal    |    CompanyBBB |   Sales   | salesa@companyBBB.com   | 27890213657   |
