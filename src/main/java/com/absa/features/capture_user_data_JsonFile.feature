Feature: Capture User Details File
  @Adduser @Adduser_JsonFile
  Scenario Outline: Add new user reading data from file
    Given dataCapture was able to open the application "https://www.way2automation.com/angularjs-protractor/webtables/"
    When dataCapture adds user with details firstName "<firstName>", lastName "<lastName>", userName "<userName>", passWord "<passWord>", customer "<customer>", role "<role>", email "<email>", cell "<cell>"
    Then dataCapture should be able to see newly added user on the list
#    Examples: {'dataFile':'src/main/resources/testData/user_date.json'}
    Examples: {'dataFile':'src/main/resources/testData/user_date.csv'}
