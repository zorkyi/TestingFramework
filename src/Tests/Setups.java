package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Setups {
    static WebDriver driver;
    String baseUrl = "http://www.nba.com";

    public void BrowserSetup(String brz) {
        switch (brz){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:/Framework/Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "fox":
                System.setProperty("webdriver.gecko.driver", "D:/Framework/Drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
}
