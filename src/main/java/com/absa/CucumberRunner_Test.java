package com.absa;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/com/absa/features",glue={"com.absa.stepdefinitions"},
monochrome=true,
plugin = {"pretty","html:target/HtmlReports.html"})
public class CucumberRunner_Test {
}
