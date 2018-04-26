package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Ali on 06/12/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "junit:build/test-results/TEST-cucumber.xml"},
//        junit ={"--filename-compatible-names"},
        features = "src/test/resources/features"
)
public class CukeRunnerTest {

}
