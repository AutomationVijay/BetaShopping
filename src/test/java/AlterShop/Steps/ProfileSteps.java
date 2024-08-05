package AlterShop.Steps;

import AlterShop.Hooks.TestHooks;
import AlterShop.Methods.Assets;
import AlterShop.Methods.Profile;
import AlterShop.Methods.Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {

	TestHooks hook;

	private Search search;
	private Assets asset;
	private Profile profile;

	public ProfileSteps(TestHooks hooks) {
		this.hook = hooks;

	}

	@Given("Open AlterShop application and assets")
	public void open_AlterShop_application_for_profile() {
		search = new Search(hook);
		asset = new Assets(hook);
		profile = new Profile(hook);
		search.userOnHomePage();
	}

	@When("Get the asset detail")
	public void Get_the_asset_detail() throws Exception {
		asset.assetDetails();
	}

	@Then("click on creaters name")
	public void click_on_creaters_name() throws Exception {
		profile.createName();
	}

	@And("get the list of all assets")
	public void get_the_list_of_all_assets() throws Exception {
		profile.createrAssetList();
	}

}
