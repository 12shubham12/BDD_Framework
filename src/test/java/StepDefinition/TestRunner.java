package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/Shubham Raj/Desktop/All Automation/BRM_NEW/cucumberJava/Features",
glue = {"StepDefinition"}, monochrome = true,plugin = {"pretty","html:Reports/HtmlReports.html",
        "json:Reports/report.json","junit:Reports/report.xml"},
tags = "@SmokeTest")

/*
In order to generate different types of reports one at a time or all 3 together
below we can use
plugin = {"pretty","html:Reports/HtmlReports"}
plugin = {"pretty","json:Reports/report.json"}
plugin = {"pretty","junit:Reports/report.xml"}
 */
public class TestRunner {
}
