package com.lamtech.luma.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
        glue = {"com.lamtech.luma.stepDefinition","com.lamtech.luma.cucumber"},
        plugin = {"pretty","html:target/site/cucumber-report/cucumber.html"},
        tags = "@duplicateAccount"




)
public class TestRunner {




}
