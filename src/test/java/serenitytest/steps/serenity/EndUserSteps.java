package serenitytest.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import gherkin.lexer.Sk;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.yecht.Data;
import serenitytest.pages.NewPageSkillsUp;
import serenitytest.pages.PageTrainings;
import serenitytest.pages.SearchPage;
import serenitytest.pages.SkillsUpMainPage;

import java.util.List;

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
    public void goToCourcePage() {
        newPageSkillsUp.open();
        pageTrainings.goToCourcesTab();
    }

    @Step
    public void goToPageWithPersonalInfo(String name){
        newPageSkillsUp.openPersonalInfoPage(name);
    }

    @Step
    public void goToInfoCource(String cource) {
        pageTrainings.openInfoCources(cource);
    }

    //Step to find name and position of teacher on page "About Us"

    @Step
    public void shouldSeeNamAndPositionOfTeacherOnAboutUsTab(String nameCoach, String position){
        assertTrue("Coach is not present on page", skillsUpMainPage.checkThatPersonIsPresented(nameCoach));
        assertThat("Position does not matche with this teacher", skillsUpMainPage.findCoachPosition(), hasItem(containsString(position)));
    }

    //Step to find cource for teacher on personalInfo page
    @Step
    public void shouldSeeCourceForTeacherOhPersonalInfoPage(String cource){
        assertTrue("Cource is right", newPageSkillsUp.searchCourcesOfCoach(cource));
    }


    //Step to see cost of specific cource
    @Step
    public void shouldSeeCostOfCource(String cost) {
        assertThat("Price does not matche with this cource", pageTrainings.getDetailsOfCourse(), hasItem(containsString(cost)));
    }

    //Step to see size of specific cource
    @Step
    public void shouldSeeSizeOfCource(String size) {
        assertThat("Size is incorrect", pageTrainings.getDetailsOfCourse(), hasItem(containsString(size)));
    }

    //Step to enter something in search field om Home page
    @Step
    public void userFindPeople(String word){
        searchPage.open();
        searchPage.findPeople(word);
    }


    //Step to see result about name of teacher
    @Step
    public void shouldSeeNameAndCourceAndPositionTeacherAfterSearchResult (String name, String cource, String position) {
        assertThat("Name does not matche with title result", searchPage.allTitleResult(), hasItem(containsString(name)));
        assertThat("Name does not matche with title result", searchPage.allDescriptionResult(), hasItem(containsString(cource)));
        assertThat("Position is right", searchPage.allDescriptionResult(), hasItem(containsString(position)));
    }


    @Step
    public void shouldSeeNameOfTeacherForSertificate (String name){
        assertThat("Name is incorrectly", searchPage.allDescriptionResult(), hasItem(containsString(name)));
    }

    @Step
    public void shouldSeeNumberOfSertificate (String sertificate){
        assertThat("Sertificate is incorrect", searchPage.allTitleResult(), hasItem(containsString(sertificate)));
    }


    //Step to see that search result did not give result
   @Step
    public void shouldNotSeeNameTeacher (String name){
        assertFalse("Result is displayed", searchPage.nameOfTeacher(name));
    }



}