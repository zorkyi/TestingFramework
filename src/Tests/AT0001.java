package Tests;

import com.app.pom.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AT0001 {
    static WebDriver driver;

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:/Framework/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("http://www.nba.com");
        HomePage.score(driver).click();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
