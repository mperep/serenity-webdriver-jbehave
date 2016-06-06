package serenitytest.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import gherkin.lexer.Sk;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.yecht.Data;
import serenitytest.pages.NewPageSkillsUp;
import serenitytest.pages.PageTrainings;
import serenitytest.pages.SearchPage;
import serenitytest.pages.SkillsUpMainPage;

public class EndUserSteps extends ScenarioSteps {

    NewPageSkillsUp newPageSkillsUp;
    SkillsUpMainPage skillsUpMainPage;
    PageTrainings pageTrainings;
    SearchPage searchPage;

    @Step
    public void goToHomePage() {
        newPageSkillsUp.open();
    }

    @Step
    public void goToCoachPage() {
        skillsUpMainPage.goToCoachPage();
    }

    @Step
    public void goToTeacherPage() {
        newPageSkillsUp.open();
        skillsUpMainPage.goToCoachPage();
    }

    @Step
    public void goToCourcePage() {
        newPageSkillsUp.open();
        pageTrainings.goToCourcesTab();
    }

    //Step to find name of teacher on page "About Us"
    @Step
    public void shouldSeeNameOfTeacher(String nameCoach) {
        assertTrue(skillsUpMainPage.checkThatPersonIsPresented(nameCoach));
    }

    //Step to open specific cource
    @Step
    public void goToInfoCource(String cource) {
        pageTrainings.openInfoCources(cource);
    }

    //Step to see cost of specific cource
    @Step
    public void shouldSeeCostOfCource(String cost) {
        assertTrue("Cost is not right", pageTrainings.costOfCource(cost));
    }

    //Step to see size of specific cource
    @Step
    public void shouldSeeSizeOfCource(String size) {
        assertTrue("Size is not right", pageTrainings.sizeOfCource(size));
    }

    //Step to enter something in search field om Home page
    @Step
    public void userFindPeople(String word){
        searchPage.open();
        searchPage.findPeople(word);
    }

    //Step to see result about cource of cource
    @Step
    public void shouldSeeCourceOfTeacherAfterSearchResult (String cource){
        assertTrue("cource is not right for this teacher", searchPage.courceInSchool(cource));
    }

    //Step to see result about position of teacher
    @Step
    public void shouldSeePositionTeacherAfterSearchResult(String position){
        assertTrue("Position is not right for this teacher", searchPage.positionOfTeacher(position));
    }

    //Step to see result about name of teacher
    @Step
    public void shouldSeeNameTeacher (String name) {
        assertTrue("Name of teacher doesn`t matche", searchPage.nameOfTeacher(name));
    }

    //Step to see result about sertificate of teacherc
    @Step
    public void shouldSeeNumberOfSertificate (String sertificate){
        assertTrue("Sertificate is not right", searchPage.sertificateOfTeacher(sertificate));
    }

    //Step to not see search result
   @Step
    public void shouldNotSeeNameTeacher (String name){
        assertFalse("Result is displayed", searchPage.nameOfTeacher(name));
    }



}