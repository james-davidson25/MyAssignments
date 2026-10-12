import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SalesforceLogin {
    public static void main(String[] args) {
        // 1. Initialize the ChromeDriver instance
        WebDriver driver = new ChromeDriver();
        
        try {
            // 2. Maximize browser window
            driver.manage().window().maximize();
            
            // 3. Navigate to the Salesforce login url (Use "https://test.salesforce.com" for Sandbox)
            driver.get("https://login.salesforce.com");
            
            // 4. Set up an explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            
            // 5. Locate fields using stable Salesforce IDs and enter credentials
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
            usernameField.sendKeys("your_username@example.com");
            
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("your_password_here");
            
            // 6. Locate and click the Login button
            WebElement loginButton = driver.findElement(By.id("Login"));
            loginButton.click();
            
            System.out.println("Login button clicked successfully.");
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7. Quit the browser session
            driver.quit();
        }
    }
}

