package serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created by mperep on 05.06.2016.
 */
@DefaultUrl("http://skillsup.ua/")
public class SearchPage extends PageObject {
    private By inputField = By.id("u5016-2");
    private By searchResult = By.cssSelector("#xsltsearch");

    public void findPeople (String search){
        WebElementFacade searchField = find(inputField);
        searchField.typeAndEnter(search);
    }

    public boolean courceInSchool(String cource){
        WebElementFacade courceSchool = find(searchResult);
        return courceSchool.getText().contains(cource);
    }

    public boolean positionOfTeacher (String position){
        return find(searchResult).getText().contains(position);
    }

    public boolean sertificateOfTeacher (String sertificate){
        return find(searchResult).getText().contains(sertificate);
    }

    public boolean nameOfTeacher (String teachersName){
        return find(searchResult).getText().contains(teachersName);
    }



}
