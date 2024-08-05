package AlterShop.Steps;

import AlterShop.Hooks.TestHooks;
import AlterShop.Methods.Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SearchSteps {
	TestHooks hook;

	private Search search;

	public SearchSteps(TestHooks hooks) {
		this.hook = hooks;

	}

	@Given("Open AlterShop application for search")
	public void open_AlterShop_application_for_search() {
		search = new Search(hook);
		search.userOnHomePage();
	}

	@When("Enter a valid keyword into the search bar")
	public void enter_a_valid_keyword_into_the_search_bar() throws Exception {
		search.validWord();
	}

	@And("Click the search button for search")
	public void click_the_search_button_for_search() throws Exception {
		search.searchButton();
	}

	@And("Asset visibles in the grid for search")
	public void Asset_visibles_in_the_grid_for_search() throws Exception {
		search.assetList();
	}

	@And("Asset not visibles in the grid for search")
	public void Asset_not_visibles_in_the_grid_for_search() throws Exception {
		search.assetList();
	}

	@When("Enter a invalid keyword into the search bar")
	public void enter_a_invalid_keyword_into_the_search_bar() throws Exception {
		search.invalidWord();
	}

	@When("Apply a filter by selecting a sort by for search")
	public void apply_a_filter_by_selecting_a_sort_by_for_search() throws Exception {
		search.sortFilter();
	}

	@When("Apply a filter by selecting a price range for search")
	public void apply_a_filter_by_selecting_a_price_range_for_search() throws Exception {
		search.priceFilter();
	}

	@When("Apply a filter by selecting a sort by and price range for search")
	public void apply_a_filter_by_selecting_a_sort_by_and_price_range_for_search() throws Exception {
		search.sortPriceFilter();
	}
}
