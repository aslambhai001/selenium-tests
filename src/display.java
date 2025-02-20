import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class display {
    @Test
    public void apple(){
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        //Gettext
        WebElement element=driver.findElement(By.xpath("//option[text()=' Day ']"));
        String a=element.getText();
        System.out.println(a);


        // WebElement element=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
        // String b=element.getDomAttribute("placeholder");

                 //To check weather an element is displayed or not
        WebElement element1=driver.findElement(By.xpath("//option[text()=' Day ']"));
        if(element1.isDisplayed()){
            System.out.println("Yes! The element is visible in the page");
        }
        else{
            System.out.println("No! The element is not visible in the webpage");
        }


                // Use JavaScript to click the hidden element

           WebElement hiddenElement = driver.findElement(By.id("hiddenElementId"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);

      


           
    
        
    }
    
}
