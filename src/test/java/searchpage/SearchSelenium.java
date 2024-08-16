package searchpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;



public class SearchSelenium {
	WebDriver driver;

    @BeforeClass
    public void setup() {
        // Step 1: Set up the WebDriver and point it to the location of your ChromeDriver
        
        driver = new ChromeDriver();
    }

    @Test
    public void testSearchFunctionality() {
        // Step 2: Navigate to the Wikipedia homepage
        driver.get("https://www.wikipedia.org/");
        
        // Step 3: Locate the search input field by its id and enter the search term "Selenium"
        driver.findElement(By.id("searchInput")).sendKeys("Selenium");
        
        // Step 4: Locate the search button by its XPath and click it
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        // Step 5: Wait for the results to load and locate the results area
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement results = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstHeading")));
        
        // Step 6: Verify that the results area displays the expected outcome
        String expectedText = "Selenium";
        Assert.assertTrue(results.getText().contains(expectedText), "Test Failed: The expected text was not found in the results area.");
        
        System.out.println("Test Passed: The results area displays the expected text.");
    }

    @AfterClass(enabled = false)
    public void teardown() {
        // Step 7: Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
	

}
