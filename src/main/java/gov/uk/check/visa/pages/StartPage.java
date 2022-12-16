package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement  startNow;


       public void clickStartNow(){
        Reporter.log("Click start now button" + startNow);
        clickOnElement(startNow);
    }
}
//1.StartPage -
//startNowButton locators and
// create method 'void clickStartNow()'