package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElarLogisticsHomePage {

    WebDriver driver;

    public ElarLogisticsHomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
}
