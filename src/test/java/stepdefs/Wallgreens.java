package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import datatypes.KeyWords;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.carfax.Home;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Wallgreens {

    String driverPath = "C:\\Users\\kvg10\\OneDrive\\Desktop\\genericSoftware\\gecko\\GeckoDriver.exe";
    public WebDriver driver;
    Properties appProps;
    public Home home;
    Logger logger;



    @Given("^I am on wallgrees page$")
    public void i_am_on_wallgrees_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" I am on wallgreesn page");
    }

    @When("^perform search with keyword  hair care$")
    public void perform_search_with_keyword_hair_care() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" I am on wallgreesn page");

    }

    @When("^select product type as Shampoo count the items$")
    public void select_product_type_as_Shampoo_count_the_items() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" I am on wallgreesn page");

    }

    @Then("^get List of items$")
    public void get_List_of_items() throws Throwable {
        System.out.println(" I am on wallgreesn page");

        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^get List of items(\\d+)$")
    public void getListOfItems(int arg0) {
    }

    @When("^perform search with keyword  \"([^\"]*)\"$")
    public void performSearchWithKeyword(String keyWord) throws Throwable {
        System.out.println("Keyowrd is " + keyWord);
    }

    @When("^perform search with keyword$")
    public void performSearchWithKeyword(DataTable table) {
        List<List<String>> rawData = table.raw();
//        System.out.println(rawData.get(1).get(1).toString());
//        System.out.println(rawData.get(1).get(0).toString());
        List<KeyWords> keyWords = new ArrayList<KeyWords>();
        keyWords = table.asList(KeyWords.class);
        keyWords.forEach(x -> {
            System.out.println(x.getExpectedCount());
            System.out.println(x.getKeyWord());
        });
//        table.asList()
    }

    @When("^perform search with ([^\"]*)and ([^\"]*)")
    public void performSearchWithKeywordAndExpectedCount(String keyWord,String count) {
    }
}
