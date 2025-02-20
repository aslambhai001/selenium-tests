
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationPageAutomation {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
    }

    @Test
    public void fillRegistrationForm() {
        // Fill First Name
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");

        // Fill Last Name
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Doe");

        // Fill Address
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("123 Main St, Springfield");

        // Fill Email
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("john.doe@example.com");

        // Fill Phone Number
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");

        // Select Gender (Male)
        driver.findElement(By.xpath("//input[@value='Male']")).click();

        // Select Hobbies (Cricket and Movies)
        driver.findElement(By.xpath("//input[@value='Cricket']")).click();
        driver.findElement(By.xpath("//input[@value='Movies']")).click();

        // Select Skills (Java)
        driver.findElement(By.xpath("//select[@id='Skills']/option[text()='Java']")).click();

        // Select Country
        driver.findElement(By.xpath("//select[@id='countries']/option[text()='India']")).click();

        // Select Date of Birth (Year, Month, Day)
        driver.findElement(By.xpath("//select[@id='yearbox']/option[text()='1990']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Month']/option[text()='January']")).click();
        driver.findElement(By.xpath("//select[@id='daybox']/option[text()='1']")).click();

        // Fill Password
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Password123");

        // Confirm Password
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Password123");

        // Submit the form
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

}
