package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class WikipediaHomePage {

   public WikipediaHomePage(){
       PageFactory.initElements(Driver.getDriver(), this);

   }

   @FindBy (id = " searchInput")
    public WebElement searchBox;


    @FindBy (xpath = "//button[@type'submit']")
    public WebElement searchButton;

    @FindBy (id="firstHeading")
    public WebElement mainHeader;

    @FindBy (className="fn")
    public WebElement imageHeader;



}
