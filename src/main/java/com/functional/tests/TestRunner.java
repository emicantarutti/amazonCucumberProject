package com.functional.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"}, glue={"com.functional.stepdefinitions"}
		)
 
public class TestRunner {
	
	/*@BeforeClass
    public static void setUp() {
    	TestSuiteConfiguration.getInstance().setupSuite("http://localhost:8080/");
    }

    @AfterClass
    public static void tearDown() {
    	TestSuiteConfiguration.getInstance().shutdownSuite();
    }
*/
 
}