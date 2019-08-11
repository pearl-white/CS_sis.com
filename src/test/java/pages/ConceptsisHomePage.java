package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ConceptsisHomePage {

    public ConceptsisHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id="tbxUserName")
    public WebElement usernameBox;

    @FindBy (id= "tbxPassword")
    public WebElement passwordBox;

    @FindBy (id="btnSubmit")
    public WebElement submitButton;

    @FindBy (id="ctl00_ctl00_hdr_hdr_lblUserMessage")
    public WebElement welcomeText;


}

