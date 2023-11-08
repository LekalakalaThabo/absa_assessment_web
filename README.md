# Cucumber Java Page Factory Pattern

Pre-Requisites

    Maven intalled globally in the system
    Intall IntelliJ or Eclipse IDE
    Intall Java JDk 11 and above

Setup Script

    Clone the project from your IDE, or via command Line then open it from your ID
    Run mvn clean istall to intall all dependencies on your pom.xml file

Folder Structure

    inside **com.absa.features** you'll find all scenarios under Test
    inside **com.absa.stepdefinitions** you'll find step definition for oulined scenarios
    Also hook to handle set up and tear up befor and after each scenario
    Inside **com.absa.actions** you you'll find action classes defining actions the user makes to accomplish the task
    inside **com.absa.user_interface** you'll find all element of the ui the program interacts with for maintainability and reuse  

Running Scripts

    Tests can be excecuted from the testRunner or
    Directly from the scenarios or
    Via terminal
        * all scenarios : mvn clean test
        * all scenarios using tags : mvn test -Dcucumber.options="--tags @tag Name"

Report

    Reports can be found under target folder after excecution
        Karate reports : look for target/cucumber-html-reports/overview-features.html and open in browser
