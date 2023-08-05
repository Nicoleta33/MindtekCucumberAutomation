package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebOrderHomePage {
    WebDriver driver;
    public WebOrderHomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Order")
    public WebElement orderTab;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']//tr[2]/td")
    public List<WebElement>firstRowOrder;

@FindBy(linkText = "View all orders")
    public WebElement viewAllOrdersTab;


}
