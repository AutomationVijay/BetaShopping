package AlterShop.Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import AlterShop.Actions.ActionsEngine;
import AlterShop.Hooks.TestHooks;
import AlterShop.Hooks.Xpaths;

public class Search extends ActionsEngine {

	TestHooks hooks;

	public Search(TestHooks hooks) {
		hooks.getDriver();
	}

	public void userOnHomePage() {
		fnGetCurrentURL();
	}

	// enter test in search box
	public void validWord() throws Exception {
		Thread.sleep(2000);
		driver.findElement(Xpaths.searchBox).sendKeys(Xpaths.validKeyword);
	}

	// click on search button
	public void searchButton() throws Exception {
		Thread.sleep(2000);
		driver.findElement(Xpaths.searchBox).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	// Asset list
	public void assetList() throws Exception {
		List<WebElement> assetItem = driver.findElements(Xpaths.assets);
		boolean haveEntity = false;
		for (WebElement item : assetItem) {
			haveEntity = item.getText().toLowerCase().contains(Xpaths.validKeyword);
			if (haveEntity) {
				System.out.println("Asset Name : " + item.getText());
			} else {
				System.out.println("No Asset found");
			}
		}

	}

	// enter test in search box
	public void invalidWord() throws Exception {
		Thread.sleep(2000);
		driver.findElement(Xpaths.searchBox).sendKeys(Xpaths.invalidKeyword);
	}

	// test filter by sorting
	public void sortFilter() throws Exception {
		Thread.sleep(2000);
		driver.findElement(Xpaths.sortSelect).click();
		Thread.sleep(1000);
		List<WebElement> srt = driver.findElements(Xpaths.sortList);
		srt.get(srt.size() - 1).click();
		Thread.sleep(3000);
	}

	// // test filter by pricing
	public void priceFilter() throws Exception {
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//span[@class=\"MuiSlider-rail css-b04pc9\"]"));
		WebElement drop = driver.findElement(By.xpath("//span[@class=\"MuiSlider-track css-1t2bqnt\"]"));
		
		Actions builder = new Actions(driver);   
		builder.moveToElement(drag).click().dragAndDrop(drag, drop ).build().perform();
		Thread.sleep(3000);
	}
	
	// test filter by sorting and pricing
	public void sortPriceFilter() throws Exception {
		Thread.sleep(2000);
		driver.findElement(Xpaths.sortSelect).click();
		Thread.sleep(1000);
		List<WebElement> srt = driver.findElements(Xpaths.sortList);
		srt.get(srt.size() - 1).click();
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//span[@class=\"MuiSlider-rail css-b04pc9\"]"));
		WebElement drop = driver.findElement(By.xpath("//span[@class=\"MuiSlider-track css-1t2bqnt\"]"));
		
		Actions builder = new Actions(driver);   
		builder.moveToElement(drag).click().dragAndDrop(drag, drop ).build().perform();
		Thread.sleep(3000);
	}
}
