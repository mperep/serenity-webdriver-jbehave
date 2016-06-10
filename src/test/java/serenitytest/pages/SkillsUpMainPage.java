package serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mperep on 02.06.2016.
 */
@DefaultUrl("http://skillsup.ua/")
public class SkillsUpMainPage extends PageObject {
    private By linkourteam = By.linkText("Наша команда");
    private By memberclass = By.className("name");
    private By positionclass = By.className("position");

    public void goToCoachPage() {
        WebElement goToCoachPage = find(linkourteam);
        goToCoachPage.click();
    }

    public List<String> findCoachNmae() {
        List<WebElementFacade> listmembers = findAll(memberclass);
        List<String> stringsNames = new ArrayList<String>();
        for (WebElement i : listmembers) {
            stringsNames.add(i.getText());
        }
        return stringsNames;
    }

    public List<String> findCoachPosition() {
        List<WebElementFacade> listpositions = findAll(positionclass);
        List<String> stringsPositions = new ArrayList();
        for (WebElement i : listpositions) {
            stringsPositions.add(i.getText());
        }
        return stringsPositions;
    }


   public Boolean checkThatPersonIsPresented(String teacher) {
        return findCoachNmae().contains(teacher);
    }

}