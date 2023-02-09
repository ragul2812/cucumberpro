package org.runAllClass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.summaClass.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", glue = "org.summaClass", dryRun = false, strict = true, plugin = {
		"html:C:\\Users\\Admin\\eclipse-workspace1\\Cucumber\\Reports\\HTMLReport",
		"json:C:\\Users\\Admin\\eclipse-workspace1\\Cucumber\\Reports\\Jsonreport\\fb.json",
		"junit:C:\\Users\\Admin\\eclipse-workspace1\\Cucumber\\Reports\\JunitReport\\facebook.xml" })
public class RunAllClass {

	@AfterClass
	public static void BuildReport() {

		JVMReport.buildReport("C:\\Users\\Admin\\eclipse-workspace1\\Cucumber\\Reports\\Jsonreport\\fb.json");

	}

}
