package StepDefinitions;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginDemoSteps {

    WebDriver driver=null;
    @Given("user is on the login page")
    public void userIsOnLoginPage() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://release3410.learn-staging.auzmor.com/");

    }
    @When("user enters <username> and <password>")
    public void userEntersValidCredentials() {
        WebElement usernameField = driver.findElement(By.xpath("//*[@placeholder='Enter Your Password']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@placeholder='Enter Your Password']"));

        usernameField.sendKeys("utaorg1ad1@mailinator.com");
        passwordField.sendKeys("Test@123");

    }
    @And("clicks the login button")
    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//*[@data-testid='login-submit-btn']"));
        loginButton.click();
    }
    @Then("user is navigated to the home page")
    public void userLoggedInSuccessfully() {
        WebElement welcomeMessage = driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div/div[2]/section/div[1]/div[1]/span[1]"));
        assertTrue("Welcome message is displayed", welcomeMessage.isDisplayed());
        throw new io.cucumber.java.PendingException();
    }

}
