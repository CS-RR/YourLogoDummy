package co.com.yl.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Page_Your_Logo.feature",
        tags = "@scenario2",
        glue = "co.com.yl.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class YouLogoRunner {
}
