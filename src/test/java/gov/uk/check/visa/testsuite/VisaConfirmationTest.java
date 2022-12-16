package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends BaseTest {

        DurationOfStayPage durationOfStayPage;
        FamilyImmigrationStatusPage familyImmigrationStatusPage;
        ReasonForTravelPage reasonForTravelPage;
        ResultPage resultPage;
        SelectNationalityPage selectNationalityPage;
        StartPage startPage;
        WorkTypePage workTypePage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
        selectNationalityPage = new SelectNationalityPage();
        resultPage = new ResultPage();
        reasonForTravelPage = new ReasonForTravelPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        durationOfStayPage = new DurationOfStayPage();


    }


    @Test(groups = {"sanity", "regression"}, priority = 1)
    public void anAustralianCominToUKForTourism(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Tourism");
        reasonForTravelPage.clickNextStepButton();
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");

    }

    @Test(groups = {"smoke", "regression"}, priority = 2)
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("chile");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        reasonForTravelPage.clickNextStepButton();
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        durationOfStayPage.clickNextStepButton();
        workTypePage.selectJobType("Health and care professional");
        workTypePage.nextStepButton();
        resultPage.confirmResultMessage("You need a visa to work in health and care");
    }

    @Test(groups = "regression", priority = 3)
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("india");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        reasonForTravelPage.clickNextStepButton();
        familyImmigrationStatusPage.selectImmigrationStatus("yes");
        familyImmigrationStatusPage.clickNextStepButton();
        resultPage.confirmResultMessage("You’ll need a visa to join your family or partner in the UK");


    }

}

