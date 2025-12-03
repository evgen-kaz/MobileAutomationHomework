package tests;

import Screen.SearchScreen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;
public class SearchTests extends TestBase {

    SearchScreen searchScreen = new SearchScreen();

    @Test
    @Tag("Позитивный")
    @DisplayName("Поиску по слову 'Тестирование'")
    void successfulSearchTest() {
        step("Ввод слова 'Тестирование' в поисковую строку", () -> {
            searchScreen.clickInputSearch();
            searchScreen.inputTextInSearchInput("Тестирование");
        });

        step("Проверка наличия искомого текста в результатах поиска", () -> {
            searchScreen.searchInputByText();
            searchScreen.checkResultSearchText();
        });
    }
}