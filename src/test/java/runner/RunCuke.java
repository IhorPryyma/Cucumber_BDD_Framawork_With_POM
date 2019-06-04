package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		plugin = {"json:target/RunCuke/cucumber.json", "pretty", "html:target/RunCuke/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter"},
		features = "src/test/resources/features",
		glue = "steps",
		tags = {"@Login, @Shop"})
public class RunCuke extends AbstractTestNGCucumberTests{

	@BeforeClass
	public static void setup() {
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir") + "/target/Extent_Reports/" + strDate + ".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);
		
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));
		
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "v.74.0");
		ExtentCucumberFormatter.addSystemInfo("Selenium version", "v.3.141.59");
		
		Map systemInfo = new HashMap();
		systemInfo.put("Cucumber version", "1.2.5");
		systemInfo.put("Extent Cucumber Reporter version", "1.1.1");
		ExtentCucumberFormatter.addSystemInfo(systemInfo);
	}
	
}
