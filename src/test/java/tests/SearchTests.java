package tests;

import screen.SearchScreen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;
public class SearchTests extends TestBase {

    SearchScreen searchScreen = new SearchScreen();

    @Test
    @Tag("Позитивный")
    @DisplayName("Поиску по слову 'Test'")
    void successfulSearchTest() {
            searchScreen.clickInputSearch();
            searchScreen.inputTextInSearchInput("Testing");
            searchScreen.searchInputByText();
            searchScreen.checkResultSearchText();
            searchScreen.clickFirstArticle();
            searchScreen.openPageArticle();
    }
}