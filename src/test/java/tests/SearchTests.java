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
        step("Ввод слова 'Test' в поисковую строку", () -> {
            searchScreen.clickInputSearch();
            searchScreen.inputTextInSearchInput("Testing");
        });

        step("Проверка наличия искомого текста в результатах поиска", () -> {
            searchScreen.searchInputByText();
            searchScreen.checkResultSearchText();
        });

        step("Открытие первой статьи", () -> {
            searchScreen.clickFirstArticle();
            searchScreen.openPageArticle();
        });
    }
}