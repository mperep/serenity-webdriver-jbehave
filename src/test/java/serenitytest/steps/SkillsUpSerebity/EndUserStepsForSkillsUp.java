package serenitytest.steps.SkillsUpSerebity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.NewPageSkillsUp;

import static org.junit.Assert.assertTrue;

/**
 * Created by mperep on 20.05.2016.
 */
public class EndUserStepsForSkillsUp extends ScenarioSteps {
    NewPageSkillsUp newPageSkillsUp;

    @Step
    public void goToTeacherPage(){
        newPageSkillsUp.open();
        newPageSkillsUp.goToCoachPage();}

    @Step
    public void openTeacherPage(String cardCoach){newPageSkillsUp.openPersonalInfoPage(cardCoach);}

    @Step
    public void shouldSeeNameOfTeacher(String nameCoach){assertTrue(newPageSkillsUp.searchPersonalPage(nameCoach));}

   // @Step
    //public void is_the_home_page() {newPageSkillsUp.open();}

    @Step
    public void looks_for(String term) {
       // goToTeacherPage();
        openTeacherPage(term);

    }
}
