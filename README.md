# Amazon Selenium Tests

# Test Suite

This test is written in Java using 'Cucumber' as a testing framework. 
The test suite contains only 1 (one) Test case that opens the Amazon main page, browses through the digital cameras, and adds 8 (eight) items of the fifth element within the best seller ones.


### Cucumber & Selenium

Cucumber was selected as BDD (behavior driven developemnt) tool due to gives a quick feedback to all the user and stakeholders about the application under test as well as the results of the test execution.
The tool that was used to interact with Amazon's UI was Selenium which was used along with Java.

### Maven Project

This is a maven project, so the test suite can be executed through command line. All you need to execute is:
```
    $mvn test
```
and this will run the test.

### Structure
#### Step Class
The class 'BaseSteps' located under the 'com.functional.stepdefinitions' package, is in charge of transforming every action phrase written down in the feature file into an actual executable method.
#### Page Object class
The class 'PageObjectsModel' located under the 'com.functional.selenium' package, holds each and every one of the objects that are present within the 'Amazon' web site.
#### Test runner
The 'TestRunner' located under the 'com.functional.tests' is the one that gathers the test written in the feature file and executes the test making sure that each action phrase matches a real step of the step class.
#### Feature file
The 'amazongPageTest.feature' located under 'src/test/resources/features' package is a plain text file where the test case is defined. Each and every sentence matches with a method of the Step class.

## Preconditions

The only requirements that you need to run this tests are:
- Maven;
- Google Chrome;
- Java

#### Disclaimer

- At the moment of writing the step of selecting the 5th element of the best seller camera, there was no possibility of buying more than one item due to lack of inventory. Therefore, the tests selects the 6th of that list.
- The test were designed to be executed in Google Chrome due to is the most used browser nowadays.

