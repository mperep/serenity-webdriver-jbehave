package serenitytest.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertTrue;

import gherkin.lexer.Sk;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.NewPageSkillsUp;
import serenitytest.pages.SkillsUpMainPage;

public class EndUserSteps extends ScenarioSteps {

    NewPageSkillsUp newPageSkillsUp;
    SkillsUpMainPage skillsUpMainPage;

    @Step
    public void goToHomePage(){
        newPageSkillsUp.open();}
    @Step
    public void goToCoachPage(){
        skillsUpMainPage.goToCoachPage();
    }
    @Step
    public void goToTeacherPage(){
        newPageSkillsUp.open();
        skillsUpMainPage.goToCoachPage();}

    @Step
    public void openTeacherPage(String cardCoach){
        newPageSkillsUp.openPersonalInfoPage(cardCoach);
    }

    @Step
    public void shouldSeeNameOfTeacher(String nameCoach){
        assertTrue(skillsUpMainPage.checkThatPersonIsPresented(nameCoach));
    }

    @Step
    public void shouldSeeCourceForTeacher(String nameCource){
        assertTrue(newPageSkillsUp.searchCourcesOfCoach(nameCource));
    }

}