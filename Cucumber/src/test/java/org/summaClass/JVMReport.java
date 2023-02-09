package org.summaClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void buildReport(String jsonpath) {

		// file location
		File f = new File("C:\\Users\\Admin\\eclipse-workspace1\\Cucumber\\Reports\\JVMReport");

		// add additional details
		Configuration c = new Configuration(f, "facebook");
		c.addClassifications("Platform", "Windows-10");
		c.addClassifications("jdkversion", "1.8");
		c.addClassifications("IDE", "Eclipse Photon R");
		
		//add jsonpath to list
		List<String> li = new ArrayList<String>();
		li.add(jsonpath);
		
		//use Report Builderclass and call generate Report
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		
		
		
	}

}
