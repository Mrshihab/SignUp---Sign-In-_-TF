import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://career.techforing.com/auth");
            driver.manage().window().maximize();
            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));


            WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
            emailField.sendKeys("mshihab2021@gmail.com");


            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("Shihab0189");


            WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
            signInButton.click();


            Thread.sleep(5000); // OR use WebDriverWait for production quality


            System.out.println(":white_check_mark: Login attempted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // driver.quit();
        }
    }
}