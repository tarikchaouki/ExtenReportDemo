
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport1Demo {
	static ExtentReports  reports; 
	static ExtentTest logger ;
	
	public static void main(String[] args) {
		
		 String fileName = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm'.html'").format(new Date());
		 String path = "C:\\Users\\Tonesha\\Desktop\\ExtentReport1\\" +fileName;
		 
		 reports = new ExtentReports(path);
		 logger = reports.startTest("Login into Gmail");
         logger.log(LogStatus.INFO,"We have Entered valid email id");
         logger.log(LogStatus.PASS,"Enter email id");
         logger.log(LogStatus.INFO,"We have Entered valid password");
         logger.log(LogStatus.PASS,"Enter password");
         logger.log(LogStatus.PASS,"Click on Login ");
         
         logger = reports.startTest("Remember me ");
         logger.log(LogStatus.INFO,"We have Entered valid email id");
         logger.log(LogStatus.PASS,"Enter email id");
         logger.log(LogStatus.INFO,"We have Entered valid password");
         logger.log(LogStatus.PASS,"Enter password");
         logger.log(LogStatus.FAIL,"Click on Remember me");
         logger.log(LogStatus.FAIL,"Click on Login ");
         reports.endTest(logger);
         
         reports.flush();
                   
         
	}

}
