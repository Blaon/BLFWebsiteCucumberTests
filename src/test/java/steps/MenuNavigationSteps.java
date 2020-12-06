package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesPOM.MainPagePOM;

public class MenuNavigationSteps {
    ChromeDriver driver = new ChromeDriver();
    MainPagePOM mainPagePOM;

    @Before
    public void setup(){
        mainPagePOM=new MainPagePOM(driver);
        driver.manage().window().maximize();
    }

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        mainPagePOM.goToMainPage();
    }

    @When("I hoover the mouse over links")
    public void iHooverTheMouseOverLinks() {
        mainPagePOM.hoverLinksButton();
        mainPagePOM.clickOnNBALink();
        mainPagePOM.waitForNBAPage();
    }


    @After
    public void teardown(){
        driver.quit();
    }
}
