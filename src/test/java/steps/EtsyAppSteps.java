package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.EtsyHomePage;
import pages.WebOrdersLoginPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class EtsyAppSteps {
    WebDriver driver = Driver.getDriver();
    EtsyHomePage etsyHomePage = new EtsyHomePage();

    @Given("user navigates to Etsy application")
    public void user_navigates_to_etsy_application() {
      driver.get(ConfigReader.getProperty("EtsyURL"));


    }


    @When("User searches for {string}")
    public void user_searches_for(String itemName) {
        etsyHomePage.searchBar.sendKeys(itemName+ Keys.ENTER);


    }


    @Then("User validates search result contains")
    public void user_validates_search_result_contains(DataTable dataTable) {

        List <String> keywords = dataTable.asList();
       // System.out.println(keywords.get(0));

        for(WebElement item : etsyHomePage.items) {
            String itemDescription = item.getText();
            boolean isFound=false;
            String wordNotFound="";
            for(int i=0; i<keywords.size(); i++){
                if(itemDescription.toLowerCase().contains(keywords.get(i))){
                    isFound=true;
                } else {
                 wordNotFound= keywords.get(i);
                }
            }
            Assert.assertTrue("[" + itemDescription + "] does not contain keyword" + wordNotFound+"]", isFound);

        }

        }

    @When("User select price range over {double}")
    public void user_select_price_range_over(Double priceRange) {
        etsyHomePage.allFiltersBtn.click();
//        BrowserUtils.scrollDownBy(1000);
//        BrowserUtils.waitForElementToBeClickable();
        etsyHomePage.over1000Btn.click();
        etsyHomePage.applyBtn.click();

    }

    @Then("User validates price range for items over {double}")
    public void user_validates_price_range_for_items_over(Double priceRange) {
        driver.navigate().refresh();
        for (WebElement price : etsyHomePage.prices) {
            System.out.println(price.getText());
            Double priceDouble = Double.parseDouble(price.getText().replace(",", ""));
            Assert.assertTrue(priceDouble + " is less than" + priceRange, priceDouble >= priceRange);
        }
    }
        @When("User clicks on {string} module")
        public void user_clicks_on_module(String module) {

            if (module.equals("Fashion Favorites")) {
                etsyHomePage.fashionFavoritesTab.click();
            } else if (module.equals("Jewelry & Accessories")) {
                etsyHomePage.jewelryAccessoriesTab.click();
            } else if (module.equals("Clothing  & Shoes")) {
                etsyHomePage.clothingShoesTab.click();
            } else if (module.equals("Home & Living")) {
                etsyHomePage.homeLivingTab.click();
            } else if (module.equals("Wedding & Party")) {
                etsyHomePage.weddingPartyTab.click();
            } else if (module.equals("Toys & Entertainment")) {
                etsyHomePage.toysEntertaimentTab.click();
            } else if (module.equals("Art & Collectibles")) {
                etsyHomePage.artCollectiblesTab.click();
            } else if (module.equals("Craft Supplies")) {
                etsyHomePage.craftSuppliesTab.click();
            } else if (module.equals("Gifts & Gift Cards")) {
                etsyHomePage.giftsGiftCardsTab.click();

            }

        }

        @Then("User validates the {string} title")
        public void user_validates_the_title(String title) {
Assert.assertEquals("Title is incorrect" , title,driver.getTitle());

    }




    }
