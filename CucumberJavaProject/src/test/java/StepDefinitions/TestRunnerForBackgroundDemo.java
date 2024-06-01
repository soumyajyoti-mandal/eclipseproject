package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/BackgroundDemo/BackgroundDemo.feature", 
glue= {"StepsForBackground"}, 
monochrome = true, 
plugin={"pretty","html:target/HtmlReport/HtmlReports.html","json:target/JsonReport/jsonreport.json"})

public class TestRunnerForBackgroundDemo {

}
