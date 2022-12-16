package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {

//    @CacheLookup
//    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
//    WebElement resultMessage;
//
//    public void getResultMessage(){
//        Reporter.log("Getting result msg");
//        getTextFromElement(resultMessage);
//    }
//
//    public void confirmResultMessage(){
//        Reporter.log("Confirming result msg" + resultMessage);
//
//
//    }

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/h2[1]")
    WebElement resultMessage;


    public String getResultMessage() {
        Reporter.log("Getting result message");
        return getTextFromElement(resultMessage);
    }

    public void confirmResultMessage(String expectedMessage){
        Reporter.log("Expected message to compare");
        Assert.assertEquals(getResultMessage(), expectedMessage, "You will need visa to visit UK");
    }

}
//4.ResultPage
//- resultMessage locator and
//create methods 'String getResultMessage()' and
//'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)