package serenitytest.pages;

import groovy.swing.factory.ActionFactory;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mperep on 05.06.2016.
 */
@DefaultUrl("http://skillsup.ua/")
public class PageTrainings extends PageObject {
    private By training = By.xpath(".//*[@id='mi1']");
    private By cources = By.xpath("//a[@href='/training/courses/']");
    //private By cources = By.xpath("#menu1078>ul>li>a");
    private By titlecources = By.cssSelector(".title>a");
    private By text = By.cssSelector(".cell.left.padTopBottom");

    public void goToCourcesTab() { // method move to page "Курсы"
        WebElementFacade educationTab = find(training);
        WebElementFacade courcesTab = find(cources);
        Actions goToAllCourcesTab = new Actions(getDriver());
        goToAllCourcesTab.moveToElement(educationTab).perform();
        goToAllCourcesTab.moveToElement(courcesTab).click().perform();
    }

    public void openInfoCources(String cource) { // method select list of cources and choose one of them
        List<WebElementFacade> listcource = findAll(titlecources);
        for (WebElement i : listcource) {
            if (i.getText().contains(cource)) {
                i.click();
                break;
            }
        }
    }

    public List<String> getDetailsOfCourse() {
        List<String> textList = new ArrayList();
        List<WebElementFacade> element = findAll(text);
        for (WebElement i : element) {
            textList.add(i.getText());
        }
        return textList;
    }

    /*public boolean costOfCource(String cost){
        WebElementFacade costCource = find(text);
        return costCource.getText().contains(cost);
    }

    public boolean sizeOfCource(String fullsize){
        WebElementFacade sizeCource = find(text);
        return sizeCource.getText().contains(fullsize);
    }*/
}
