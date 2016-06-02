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
    //new scenario to find name of Teacher

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
}

