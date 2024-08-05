package AlterShop.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/FeatureFiles/Search&Filter.feature",
		glue = "AlterShop.Steps",
//		tags = "@test", 
		monochrome = true,
		dryRun = false,
//		strict = true, 
		plugin = {
				"pretty",
				"junit:target/JUnitReports/report.xml",
				"json:target/JSONReports/report.json",
				"html:target/HtmlReports/report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				})

public class SearchRunner extends AbstractTestNGCucumberTests {

}
