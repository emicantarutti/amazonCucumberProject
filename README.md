# appiumCalculatorTests

# Test Suite

These tests are written in Java using 'Appium' as a testing framework. 
The test suite contains 6 (six) test cases which test the basic functionality of the 'Wonky Calculator'.
Please bear in mind that for the tests to run smoothly, an instance of Appium should be up and running!

When running the test suite, three extra test cases get executed. These test cases verify and validate the proposed scenarios.
These scenarios use the RestAssured library in order to simplify the verification of the different responses, as well as to make more human readable the sent requests.

Just one test suite was created in order to simplify and fasten the execution up. Ideally, two different suites should be created, to maintain the granularity of the tests.


### TestNG Suite

The TestNG Suite executes 6 (six) tests to verify the behaviour of the Wonky Calculator and 3 (three) to check the 'https://jsonplaceholder.typicode.com/' endpoint.

## Test Suite

### Wonky Calculator Tests

The suite has six different test cases:

- CalculatorDivisionTests: This test adds up four units and then divides by two and verifies that the result is actually 2 (two);

- CalculatorMultiplicationTests: This test adds up four units and then multiplies by two and verifies that the result is actually 8 (eight);

- CalculatorPowerTests: This test adds up three units and then powers it by two and verifies that the result is actually 9 (nine);

- CalculatorSubstractionTests: This test adds up two units and then substracts four and verifies that the result is actually -2 (negative two);

- CalculatorSquareRootTests: This test adds up four units, performs the square root on it and verifies that the result is actually 2 (two);

- CalculatorSumTests: This test adds up 10 units and verifies that the result is actually 10 (ten);

// Disclaimer: Currently the test that verifies the 'Power by 2' fails due to the functionality is faulty. That functionality, instead of following the formula 'x2 = x * x', is doing 'x2 = x * (x + 1)' //

### JsonPlaceHolder Tests

- gettingAUserId: This test gets the details of a user with ID = 1, prints its email and verifies if it complies with the email standarts;

- verifyingValidContent: This test gets the posts of the user with ID = 1, and checks  if the userId, id, title and body are the expected ones;

- postingWithAValidUser: This test posts a json with valid data and then verifies if the service responds with a 201 status code.

### Maven Project

This is a maven project, so the test suite can be executed through command line. All you need to execute is:
```
    $mvn test
```
and this will run all the tests.

### TestNG Tests

If you prefer to execute one test at a time, the command that you should execute is 
```
    $mvn test -Dtest='name of the test'.
```
You can execute more than one, separated by comma ','.

If you decide to import the whole maven project to an IDE (Eclipse, for instance), all you have to do, is to run the classes that are in the package 'appium.wonkyCalculatorTests.tests' as 'TestNG test'. Au contraire, if you prefer to run the tests altogether also from the IDE, you can do the same, but running as a 'TestNG Suite' the testng.xml file located under the 'src' folder.

### Structure
#### Set Up Class
The class 'BaseTestSetUp' located under the 'appium.wonkyCalculatorTests.setUp' package, is in charge of recognize the Android emulator and use to APK file directly in it.
#### Page Object class
The class 'ObjectRepository' located under the 'appium.wonkyCalculatorTests.objectModel' package, holds each and every one of the objects that are present within the 'Wonky Calculator' app.
#### Test classes
The test classes located under the 'appium.wonkyCalculatorTests.tests' hold the test cases that verify the correct behaviour of the application.

## Preconditions

The only requirements that you need to run this tests are:
- Maven;
- Appium (up & running);
- Java


