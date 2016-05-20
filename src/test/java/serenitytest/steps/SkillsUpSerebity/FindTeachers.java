package serenitytest.steps.SkillsUpSerebity;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import serenitytest.steps.serenity.EndUserSteps;

/**
 * Created by mperep on 20.05.2016.
 */
public class FindTeachers {

    @Steps
    EndUserStepsForSkillsUp endUser;

    @Given("the user is on the Our Team page")
    public void gevenTheUserIsOnTheOurTeamPage (){
        endUser.goToTeacherPage();
    }

    @When("the user click on teacher '$teacher")
    public void whenTheUserClickOnTeacher(String teacher){
        endUser.openTeacherPage(teacher);
    }

    @Then("they should see the name of teacher '$name'")
    public void thenTheyShouldSeeTheNameOfTeacher(String name){
        endUser.shouldSeeNameOfTeacher(name);
    }
}
