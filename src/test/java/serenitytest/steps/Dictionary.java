package serenitytest.steps;

import org.jbehave.core.annotations.*;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.model.ExamplesTable;
import org.yecht.Data;
import serenitytest.steps.serenity.EndUserSteps;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Map;

public class Dictionary {

    @Steps
    EndUserSteps endUser;

    //new scenario to find name and position of teacher on About Us page

    @Given("the user is on the Home page")
    public void gevenTheUserIsOnHomePage() {
        endUser.goToHomePage();
    }

    @When("the user go to Coache Page")
    public void whenTheUserFindTeacher() {
        endUser.goToCoachPage();
    }

    @Then("user should see the name <name> and position <position>")
    public void thenTheyShouldSeeTheNameOfTeacher(String name, String position) {
        endUser.shouldSeeNamAndPositionOfTeacherOnAboutUsTab(name, position);
    }

    //new scenario to find cource for teachers on personal info page

    @Given("the user is on the Coache page")
    public void gevenTheUserIsOnTheOurTeamPage (){
        endUser.goToCoachPage();
    }

    @When ("the user click on teacher`s name <name>")
    public void goToPageWithPersonalInfo (String name){
        endUser.goToPageWithPersonalInfo(name);
    }

    @Then("they should see the name of cource <cource>")
    public void shouldSeeCourceForTeacher (String cource) {
        endUser.shouldSeeCourceForTeacherOhPersonalInfoPage(cource);
    }

    //new scenario to find cost and size of cource for specific cource

    @Given("the user is on the cource page")
    public void userGoToCourcePage(){
        endUser.goToCourcePage();
    }

    @When("the user go to cource $cource")
    public void userGoToInfoCourcePage(String cource){
        endUser.goToInfoCource(cource);
    }

    @Then("they should see the cost <cost> and size <size>")
    public void userSeeCostOfCource(String cost, String size){
        endUser.shouldSeeCostOfCource(cost);
        endUser.shouldSeeSizeOfCource(size);
    }

    //new scenario to find name, cource and position of teacher using search field


    @When("the user enter in input field word <word>")
    public void userEnterWordToFindInfo (String word){
        endUser.userFindPeople(word);
    }

    @Then ("they should see the name <name> and cource <cource> and position <position>")
    public void userSeeSearchResult(String name, String cource, String position){
        endUser.shouldSeeNameAndCourceAndPositionTeacherAfterSearchResult(name, cource, position);
    }

    //new scenarion to find name and number of sertificate using search field

    @Then("they should see the name <name> and number of sertificate <sertificate>")
    public void userSeeNameAndSertificate (String name, String sertificate){
        endUser.shouldSeeNameOfTeacherForSertificate(name);
        endUser.shouldSeeNumberOfSertificate(sertificate);
    }

    //new scenarion to make sure that result is not shown when user tries to find someting using Russian lenguage

    @When("the user enter in input field name $name")
    public void userEnterRussianWord (String name){
        endUser.userFindPeople(name);
    }

    @Then("the user should see the result $result")
    public void userDoNotSeeResult (String result){
        endUser.shouldNotSeeNameTeacher(result);
    }
}

