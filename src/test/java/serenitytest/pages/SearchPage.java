package serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mperep on 05.06.2016.
 */
@DefaultUrl("http://skillsup.ua/")
public class SearchPage extends PageObject {
    private By inputField = By.id("u5016-2");
    private By searchResult = By.cssSelector("#xsltsearch");
    private By searchTitleResult = By.cssSelector(".xsltsearch_title");
    private By searchDecriptionResult = By.cssSelector(".xsltsearch_description");

    public void findPeople(String search) {
        WebElementFacade searchField = find(inputField);
        searchField.typeAndEnter(search);
    }

    public List<String> allTitleResult(){
        List<String> listTitles = new ArrayList<>();
        List<WebElementFacade> elementFacades = findAll(searchTitleResult);
        for (WebElement element : elementFacades){
            listTitles.add(element.getText());
        }
        return listTitles;
    }

    public List<String> allDescriptionResult(){
        List<String> listDescriptions = new ArrayList<>();
        List<WebElementFacade> elementFacades = findAll(searchDecriptionResult);
        for (WebElement element : elementFacades){
            listDescriptions.add(element.getText());
        }
        return listDescriptions;
    }

    public boolean nameOfTeacher (String teachersName){
        return find(searchResult).getText().contains(teachersName);
    }


}
