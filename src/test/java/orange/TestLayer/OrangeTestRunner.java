package orange.TestLayer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"OrangeFeature"},
		glue= {"orange.stepdafination"},
		monochrome= true,
				dryRun=false
		)
public class OrangeTestRunner {

}
