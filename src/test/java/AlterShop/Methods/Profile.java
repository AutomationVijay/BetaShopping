package AlterShop.Methods;

import java.util.List;

import org.openqa.selenium.WebElement;

import AlterShop.Actions.ActionsEngine;
import AlterShop.Hooks.TestHooks;
import AlterShop.Hooks.Xpaths;

public class Profile extends ActionsEngine {

	TestHooks hooks;

	public Profile(TestHooks hooks) {
		hooks.getDriver();
	}

	// creater
	public void createName() throws Exception {
		Thread.sleep(2000);
		driver.findElement(Xpaths.creater).click();
	}

	// creater asset
	public void createrAssetList() throws Exception {

		Thread.sleep(2000);
//		driver.findElement(Xpaths.allSee).click();
		Thread.sleep(5000);
		System.out.println("-----------------------------------------------");
		List<WebElement> assetItem = driver.findElements(Xpaths.allAsset);
		for (WebElement item : assetItem) {
			String assestName = item.getText();
			if (!assestName.isEmpty()) {
				System.out.println("Asset Name : " + assestName);
			} else {
				System.out.println("No more Asset found");

			}
			System.out.println("-----------------------------------------------");
		}
	}
}
