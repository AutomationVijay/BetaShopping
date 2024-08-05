package AlterShop.Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import AlterShop.Actions.ActionsEngine;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHooks {

	public static WebDriver driver;

	public void setUp() throws Exception {
		if (Xpaths.strBrowserName.toLowerCase().startsWith("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			ActionsEngine.waits();
		} else if (Xpaths.strBrowserName.toLowerCase().startsWith("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			// System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			ActionsEngine.waits();
		} else if (Xpaths.strBrowserName.toLowerCase().startsWith("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			ActionsEngine.waits();
		} else if (Xpaths.strBrowserName.toLowerCase().startsWith("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			ActionsEngine.waits();
		} else if (Xpaths.strBrowserName.toLowerCase().startsWith("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			ActionsEngine.waits();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(Xpaths.URL);
	}

	public void tearDown() throws Exception {
	//	driver.close();
		ActionsEngine.waits();
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}
}
