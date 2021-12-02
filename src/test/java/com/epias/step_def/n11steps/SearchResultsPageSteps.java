package com.epias.step_def.n11steps;

import com.epias.pages.n11pages.SearchResultPage;
import io.cucumber.java.en.Then;

public class SearchResultsPageSteps {
    SearchResultPage searchResultPage = new SearchResultPage();

    @Then("user should see search result")
    public void user_should_see_search_result() {
        searchResultPage.verifySearchResult();
    }
}
