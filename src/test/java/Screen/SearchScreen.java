package Screen;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchScreen {
    SelenideElement
            inputSearch = $(accessibilityId("Search Wikipedia")),
            inputForSearchText = $(id("org.wikipedia.alpha:id/search_src_text"));
    ElementsCollection
            titleText = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public void clickInputSearch() {
        inputSearch.click();
    }

    public void inputTextInSearchInput(String text) {
        inputForSearchText.sendKeys(text);
    }

    public void searchInputByText() {
        inputForSearchText.sendKeys(Keys.ENTER);
    }

    public void checkResultSearchText() {
        titleText.shouldHave(sizeGreaterThan(0));
    }
}
