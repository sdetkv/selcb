package stepdefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.carfax.Home;
import sun.security.util.PendingException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class carfax {

    String driverPath = "C:\\Users\\kvg10\\vkatkam\\softwares\\gecko\\GeckoDriver.exe";
    public WebDriver driver;
    Properties appProps;
    public Home home;
    Logger logger;

    @Before
    public void startBrowser() throws IOException {
        logger = Logger.getLogger(carfax.class.getName());
        String driverPath = "C:\\Users\\kvg10\\vkatkam\\softwares\\gecko\\GeckoDriver.exe";
        System.setProperty("webdriver.gecko.driver", driverPath);
        String appConfigPath = "src/test/java/config/app/app.properties";
        driver = new FirefoxDriver();
        appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));
        logger.info((appProps.getProperty("carfaxurl")));


    }
    @Test
    void simpleTest()
    {
        System.out.println("simple test");
    }

    @Given("^I am on Carfax online portal$")
    public void i_am_on_Carfax_online_portal() throws Throwable {
        logger.info((appProps.getProperty("carfaxurl")));
        driver.get(appProps.getProperty("carfaxurl"));
      }

    @When("^I explore used cars by all  Automakers$")
    public void i_explore_used_cars_by_all_Automakers() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I get Count and verify respective used cas sales page opened\\.$")
    public void i_get_Count_and_verify_respective_used_cas_sales_page_opened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
