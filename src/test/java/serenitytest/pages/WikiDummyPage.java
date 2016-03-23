package serenitytest.pages;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")
public class WikiDummyPage extends PageObject {

	By searchTerms = By.name("search");
	By lookupButton = By.name("go");
	By ol = By.tagName("ol");
	By li = By.tagName("li");

    public void enterKeywords(String keyword) {
		find(searchTerms).type(keyword);
    }

    public void lookupTerms() {
        find(lookupButton).click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(ol);
        List<WebElement> results = definitionList.findElements(li);
        return results.stream().map(WebElement::getText).collect(toList());
    }

}