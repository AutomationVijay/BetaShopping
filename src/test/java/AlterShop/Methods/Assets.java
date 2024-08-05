package AlterShop.Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import AlterShop.Actions.ActionsEngine;
import AlterShop.Hooks.TestHooks;
import AlterShop.Hooks.Xpaths;

public class Assets extends ActionsEngine {

	TestHooks hooks;

	public Assets(TestHooks hooks) {
		hooks.getDriver();
	}

	public void assetNames() throws Exception {

		driver.findElement(Xpaths.seeAll);
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

	public void assetDetails() throws Exception {

		System.out.println("-----------------------------------------------");
		Thread.sleep(2000);
		String assetItems = driver.findElement(Xpaths.assets).getText();
		System.out.println("Asset Name : " + assetItems);
		driver.findElement(By.xpath("//span[normalize-space(text()) = '" + assetItems + "']")).click();
		Thread.sleep(4000);

		String create = driver.findElement(Xpaths.creater).getText();
		System.out.println("Creater Name : " + create);

		String createon = driver.findElement(Xpaths.createON).getText();
		System.out.println("Create On : " + createon);

		String own = driver.findElement(Xpaths.owner).getText();
		System.out.println("Owner Name : " + own);

		String price = driver.findElement(Xpaths.price).getText();
		System.out.println("Price : " + price);

		System.out.println("-----------------------------------------------");
		Thread.sleep(3000);

	}
}
