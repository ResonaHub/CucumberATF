  package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FlipcartFeature",glue= {"stepDefination"},tags= {"~@multipleUserLogin"})
public class Runner {

}