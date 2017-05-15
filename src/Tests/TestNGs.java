package Tests;

import com.app.pom.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGs extends Setups{

    @BeforeClass
    public void beforeMethod(){
        //for FireFox: "fox"
        //for Chrome: "chrome"
        BrowserSetup("chrome");
    }

    @AfterClass
    public void afterMethod(){
        driver.quit();
    }

    @Test(description = "Check Title")
    public void checkTitle(){
        Assert.assertEquals(HomePage.titleH, driver.getTitle());
    }
    
    @Test(description = "Check if Scores Link is presented")
    public void checkScoresLink(){
        Assert.assertNotNull(HomePage.score(driver));
    }

    @Test(description = "Check if Schedule Link is presented")
    public void scheduleCheck(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(HomePage.schedule(driver)));
        Assert.assertTrue(HomePage.schedule(driver).isDisplayed());
    }

}
