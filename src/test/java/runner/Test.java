package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\QSP\\eclipse-workspace\\seleniumpro\\qspweekend\\CucumberFramework\\src\\test\\resources\\login.feature",
glue= {"stepdefinition"})

public class Test {

}
