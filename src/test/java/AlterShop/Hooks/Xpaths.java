package AlterShop.Hooks;

import org.openqa.selenium.By;

public class Xpaths {

	
//	Browser= chrome, firefox, edge, ie, safari
	
	public static String strBrowserName = "chrome";
	
	public static String URL = "https://betashop.alter.game/";
	
	// Test Data
	
	public static String validKeyword = "pist";
	
	public static String invalidKeyword = "Qwerty";
	
	
	
	// Paths for Search and Filter		
	
	public static By searchBox = By.id("auto-suggestion-search");
	public static By searchBtn = By.xpath("(//img[@alt='search'])");
	public static By assets = By.xpath("(//div[@class=\"card h-[max-content] transform transition-all hover:-translate-y-2 \"])//span[@data-testid=\"assetName\"]");
	public static By assetName = By.xpath("//span[@data-testid=\"assetName\"]");
	public static By sortSelect = By.xpath("//div[@data-testid=\"sortSelector\"]");
	public static By sortList = By.xpath("//li[@role=\"option\"]");
	public static By priceSelectStart = By.xpath("//span[@class=\"MuiSlider-rail css-b04pc9\"]");
	public static By priceSelectEnd = By.xpath("//span[@class=\"MuiSlider-track css-1t2bqnt\"]");
	
	
	// Paths for Asset		
	
	public static By seeAll = By.xpath("//span[normalize-space(text()) = 'see all']");
	public static By allAsset = By.xpath("(//div[@class=\"bg-pattern min-h-[calc(100vh-7rem)] bg-opacity-40 bg-cover bg-fixed bg-no-repeat pb-12  md:pb-24 \"])//span[@data-testid=\"assetName\"]");
	public static By creater = By.xpath("//span[@class=\"truncate font-SocialGothicMedium text-base  uppercase text-white md:text-lg lg:w-40\"]");
	public static By createON = By.xpath("//span[@class=\"w-full truncate font-SocialGothicMedium text-base uppercase text-white md:text-lg lg:w-40\"]");
	public static By owner = By.xpath("//span[@class=\"truncate  font-SocialGothicMedium text-base  uppercase text-white md:text-lg lg:w-40\"]");
	public static By price = By.xpath("//div[@class=\"flex flex-row items-center\"]//span[@class=\"ml-2 w-40 truncate font-SocialGothicBold text-base uppercase text-white md:text-lg\"]");
	
	
	public static By allSee = By.xpath("//span[normalize-space(text()) = 'See all']");
}
