package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"C:\\eclipse\\Illumination\\Free\\src\\test\\resource\\login.feature"},
		features = {"src/test/resource"},
		//features = {"C:\\eclipse\\Illumination\\Free\\src\\test\\resource\\contact.feature"},
        format = {"pretty" ,"json:target/cucumber.json"},
        strict = false,
        monochrome = true,
        tags = {"~ignore"},
        glue = {"stepDefinition"}
		         )

public class TestRunner {

}
