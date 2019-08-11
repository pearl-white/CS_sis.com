package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Ignore;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    //(value="@amazon",  order=1)


    //@Before
    public void setUp(){
        System.out.println("This will run before every single scenario for every step defs class");


    }


    //@Before (order=2)
    public void setUp2(){
        System.out.println("This is a setup for google ");
    }





    // @After
    public void TearDown(Scenario scenario){
        System.out.println("Hooks clean up");
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());

        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.embed(screenshot, "image/png");


        }

        Driver.quitDriver();


    }







}
