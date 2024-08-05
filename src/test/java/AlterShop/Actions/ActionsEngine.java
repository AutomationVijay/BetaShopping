package AlterShop.Actions;

import java.util.concurrent.TimeUnit;

import AlterShop.Hooks.TestHooks;

public class ActionsEngine extends TestHooks {
	/***
	 * Name of Function :- fnGetCurrentURL Class Name :- ActionEngine
	 */
	public String fnGetCurrentURL() {
		String strCurrentURL = "";
		try {
			strCurrentURL = driver.getCurrentUrl();
			System.out.println("Current URL : " + strCurrentURL);

		} catch (Exception e) {
			System.out.println("Unable to Get Current URL");
		}
		return strCurrentURL;
	}

	public static void waits() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}

}
