package serenitytest.steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.model.ExamplesTable;
import org.yecht.Data;
import serenitytest.steps.serenity.EndUserSteps;

import java.util.Map;

public class Dictionary {

    @Steps
    EndUserSteps endUser;
    //new scenario to find name of teacher

    @Given("the user is on the Home page")
    public void gevenTheUserIsOnHomePage() {
        endUser.goToHomePage();
    }

    @When("the user go to Coache Page")
    public void whenTheUserFindTeacher() {
        endUser.goToCoachPage();
    }

    @Then("they should see the name <name>")
    public void thenTheyShouldSeeTheNameOfTeacher(String name) {
        endUser.shouldSeeNameOfTeacher(name);
    }

    //new scenario to find cource for teachers

    @Given("the user is on the Our Team page")
    public void gevenTheUserIsOnTheOurTeamPage (){
        endUser.goToTeacherPage();
    }

    @Then("they should see the name and cource contains: $coachTables")
    public void findAllCoaches(ExamplesTable coachTables) {
        for (Map<String, String> row : coachTables.getRows()) {
            String name = row.get("name");
            String cource = row.get("cource");
            System.out.println(name + " " + cource);
        }
    }

    //new scenario to find cource and size of cource

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

    //new scenario to find information using search field

    @When("the user enter in input field word <word>")
    public void userEnterWordToFindInfo (String word){
        endUser.userFindPeople(word);
    }

    @Then ("they should see the cource <cource> and position <position>")
    public void userSeeSearchResult(String cource, String position){
        endUser.shouldSeeCourceOfTeacherAfterSearchResult(cource);
        endUser.shouldSeePositionTeacherAfterSearchResult(position);
    }

    //new scenarion to find name and number of sertificate

    @Then("they should see the name <name> and number of sertificate <sertificate>")
    public void userSeeNameAndSertificate (String name, String sertificate){
        endUser.shouldSeeNameTeacher(name);
        endUser.shouldSeeNumberOfSertificate(sertificate);
    }

    //new scenarion to make sure that result is not shown when user tries to find usinf Russian lenguage

    @When("the user enter in input field name $name")
    public void userEnterRussianWord (String name){
        endUser.userFindPeople(name);
    }

    @Then("the user should see the result $result")
    public void userDoNotSeeResult (String result){
        endUser.shouldNotSeeNameTeacher(result);
    }
}

