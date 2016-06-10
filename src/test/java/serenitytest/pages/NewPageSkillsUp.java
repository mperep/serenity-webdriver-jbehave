package serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mperep on 20.05.2016.
 */
@DefaultUrl("http://skillsup.ua/")
public class NewPageSkillsUp extends PageObject {
    private By memberclass = By.className("name");
    private By infoAboutCoach = By.className("text");
    private String coach;


    public void openPersonalInfoPage(String name){
        List<WebElementFacade> element = findAll(memberclass);
        for (WebElement i : element){
            if (i.getText().contains(name)){
                i.click();
                break;
            }
        }
    }

    public boolean searchCourcesOfCoach(String coach){
        return find(infoAboutCoach).getText().contains(coach);
    }


}
