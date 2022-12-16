package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {

//    @CacheLookup
//    @FindBy(xpath = "//option[contains(text(),'Australia')]")
//    WebElement nationalityDropDownList;
//    //option[contains(text(),'Australia')]
//
//    @CacheLookup
//    @FindBy(xpath = "//button[@class = 'gem-c-button govuk-button gem-c-button--bottom-margin']")
//    WebElement  nextStepButton;
//
//public void selectNationality(String nationality) {
//    Reporter.log("Select Nationality" + nationality);
//    selectByValueFromDropDown(nationalityDropDownList, nationality);
//}
//
//    public void clickNextStepButton(){
//        Reporter.log("Click on next Button" + nextStepButton);
//        clickOnElement(nextStepButton);
//
//    }

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/select[1]")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
    WebElement nextStepButton;


    public void selectNationality(String nationality){
        Reporter.log("Selecting Nationality from dropdown");
        selectByValueFromDropDown(nationalityDropDownList, nationality);
    }
    public void clickNextStepButton(){
        Reporter.log("Clicking on next step button");
        clickOnElement(nextStepButton);
    }
}
//3.SelectNationalityPage
// -nationalityDropDownList,
// nextStepButton locators and
//create methods  'void selectNationality(String nationality)'and '
//void clickNextStepButton()'
