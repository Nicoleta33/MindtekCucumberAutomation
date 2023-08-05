package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElarLogisticsListOfCompanyPage {

    WebDriver driver;

    public ElarLogisticsListOfCompanyPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


}
