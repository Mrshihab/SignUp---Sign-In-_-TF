import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUp {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

 //       try {

            driver.get("https://career.techforing.com/auth/register");
            driver.manage().window().maximize();
            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));


//            WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
//            emailField.sendKeys("mshihab2021@gmail.com");


            WebElement nameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("fullName")));
            nameField.sendKeys("Hasib");


            WebElement numberField = wait.until(ExpectedConditions.elementToBeClickable(By.className("signup_form_phone_input")));
            numberField.sendKeys("12345678901");

        // Selects the input inside div with class
            WebElement dobInput = driver.findElement(By.cssSelector(".signup_form_dateofbirth input"));
            dobInput.sendKeys("2000-01-01");


            WebElement genderOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender")));
            genderOption.click();

            WebElement maleOption = driver.findElement(By.className("MuiMenuItem-root"));
            maleOption.click();

            WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
            emailField.sendKeys("demo54@demo.com");

            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("Hasib1234");

            WebElement confrmPass = driver.findElement(By.className("MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart css-1ixds2g"));
            confrmPass.sendKeys("Hasib1234");


//            WebElement passwordField = driver.findElement(By.id("password"));
//            passwordField.sendKeys("Shihab0189");
//
//
//            WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
//            signInButton.click();
//
//
//            Thread.sleep(5000); // OR use WebDriverWait for production quality
//
//
//            System.out.println(":white_check_mark: Login attempted successfully");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // driver.quit();
//        }
    }
}