package scripts;

import org.openqa.selenium.WebDriver;

import modules.AdmissionDashboardmodules;
import modules.HomePageModule;
import modules.LoginModules;
import utils.WebElementUtils;

public class Search {

	public void search() {
		LoginModules lm = new LoginModules();
		AdmissionDashboardmodules am = new AdmissionDashboardmodules();
		HomePageModule hm = new HomePageModule();
		WebDriver driver = WebElementUtils.setBrowserDriverAndLauch("chrome");
		hm.naviagetTOBaseUrl(driver);
		lm.login(driver);
		lm.checkLogin(driver);
		am.searchAnyString(driver);
		am.assertSeartchResults(driver);
		WebElementUtils.close(driver);
		WebElementUtils.quit(driver);
		
		
	}
	
}
