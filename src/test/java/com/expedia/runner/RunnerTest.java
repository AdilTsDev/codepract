package com.expedia.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //plugin =  {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
        //plugin = {"html:target/cucumber-report/report.html"},
        features = {"src/test/resources/features"},
        glue = {"com/expedia"},
        tags = "",
        dryRun = false
        //publish = true

)

public class RunnerTest extends AbstractTestNGCucumberTests {


}
