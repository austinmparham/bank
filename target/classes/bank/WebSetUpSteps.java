package bank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSetUpSteps {
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\austi\\Downloads\\codeTools\\chrome-headless-shell-win64\\chrome-headless-shell-win64\\chrome-headless-shell.exe");
    }

    WebDriver driver;

    @Given("I open my web page")
    public void iOpenMyWebPage() {
        driver = new ChromeDriver();
        driver.get("http://52.91.160.147/");
    }

    @Then("The greeting should read {string}")
    public void theGreetingShouldRead(String greeting) {
        String liveGreeting = driver.findElement(By.tagName("h1")).getText();
        assert liveGreeting.equals(greeting);
    }

    @Then("The logo should be present")
    public void theLogoShouldBePresent() {
        assert driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
    }
}
