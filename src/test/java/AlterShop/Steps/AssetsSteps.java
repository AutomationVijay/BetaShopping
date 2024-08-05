package AlterShop.Steps;

import AlterShop.Hooks.TestHooks;
import AlterShop.Methods.Assets;
import AlterShop.Methods.Profile;
import AlterShop.Methods.Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class AssetsSteps {

	TestHooks hook;

	private Search search;
	private Assets asset;

	public AssetsSteps(TestHooks hooks) {
		this.hook = hooks;

	}

	@Given("Open AlterShop application and asset")
	public void open_AlterShop_application_and_asset() {
		search = new Search(hook);
		asset = new Assets(hook);
		search.userOnHomePage();
	}

	@And("Get all the asset names")
	public void Get_all_the_asset_names() throws Exception {
		asset.assetNames();
	}

	@And("Get the asset details")
	public void Get_the_asset_details() throws Exception {
		asset.assetDetails();
	}

}
