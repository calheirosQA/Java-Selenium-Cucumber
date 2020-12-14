package br.com.brasilprev.RunTest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = CucumberOptions.SnippetType.CAMELCASE, plugin = {
        "json:target/surefire-reports/cucumber.json" }, features = { ".\\src\\main\\resources\\features",
        },
        glue = {"br.com.brasilprev.steps.PessoaSteps"})
public class RunTest {
}
