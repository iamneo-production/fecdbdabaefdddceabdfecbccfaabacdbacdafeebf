import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class stepdef {

    private WebDriver driver;

    @Given("the user navigates to JavaTpoint.com")
    public void userNavigatesToJavaTpoint() {
        // Initialize the WebDriver (you should add logic for configuring the browser dynamically)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.javatpoint.com"); // Replace with the actual URL
    }

    @When("the user clicks on Feedback")
    public void userClicksOnFeedback() {
        WebElement feedbackLink = driver.findElement(By.linkText("Feedback")); // Replace with the actual link text
        feedbackLink.click();
    }

    @Then("the Feedback page opens")
    public void feedbackPageOpens() {
        WebElement feedbackPageHeader = driver.findElement(By.tagName("h1")); // Replace with the actual header element
        Assert.assertEquals("Feedback Page", feedbackPageHeader.getText());
    }

    @And("the user submits feedback message")
    public void userSubmitsFeedbackMessage() {
        // Implement the logic to submit feedback message on the feedback page
        // You may need to locate and interact with form elements (text area, submit button, etc.)
    }

    @And("feedback should be received on the admin page")
    public void feedbackReceivedOnAdminPage() {
        // Implement the logic to verify that feedback is received on the admin page
        // You may need to log in as an admin and check for the received feedback.
    }

    @And("admin can reply to the user")
    public void adminCanReplyToUser() {
        // Implement the logic to reply to the user's feedback as an admin
        // This may involve filling out a reply form and submitting it.
    }

    // Add a method to close the browser after the test
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
