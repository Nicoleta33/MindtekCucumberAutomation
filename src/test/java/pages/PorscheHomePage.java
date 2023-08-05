package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PorscheHomePage {
    WebDriver driver;
    public PorscheHomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }
}
