import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProjectTest {

    WebDriver driver = null;

//    @BeforeClass
//    void setup(){
//        WebDriverManager.chromedriver().setup();
//    }

    @Test
    void registration(){
        driver = Helper.setupDriver();
        driver.get(Helper.PETSTOREURL);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.ENTERTHESTORE))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.SIGNINLINK))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.REGISTERLINK))).click();

        RegistrationForm form = new RegistrationForm(driver);
        form.registration(Helper.account1);
    }

}
