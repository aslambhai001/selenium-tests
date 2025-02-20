
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class aslam {
    @Test

    public void baba(){
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.automationtesting.in/Register.html");
                 //swithto()
                 //Alerts
                 Alert alt=driver.findElement(By.xpath("xpath"));
                 alt.accept();
                 alt.dismiss();
                 String a=alt.getText();
                System.out.println(a);
                 alt.sendKeys("aslam");
                 //frames
                 driver.switchTo().frame(driver.findElement(By.xpath("xpath")));
                 driver.switchTo().frame("Framename or ID");
                 driver.switchTo().frame(1);
                 //windows
                 String parentwindow=driver.getWindowHandle();
                 Set<String> allwindow=driver.getWindowHandles();
                 for(String window:allwindow){
                  if(!window.equalsIgnoreCase(parentwindow)){
                    driver.switchTo().window(window);
                  }

                 }
                 driver.switchTo().window(parentwindow);
                //---------------------------------------------------------------------------------------------------------------
                         //Actions
                         WebElement sourcWebElement=driver.findElement(By.xpath("xpath"));
                         WebElement Targetelement=driver.findElement(By.xpath("xpath"));
                         Actions act=new Actions(driver);
                         act.dragAndDrop(sourcWebElement, Targetelement).build().perform();
                         act.moveToElement(driver.findElement(By.xpath("xpath"))).build().perform();//mousehover
                         act.moveToElement(driver.findElement(By.xpath("xpath"))).contextClick().perform();
                         act.moveToElement(driver.findElement(By.xpath("xpath"))).doubleClick().perform();
                        //----------------------------------------------------------------------
                                 //scrollbar
                                 JavascriptExecutor js=(JavascriptExecutor) driver;
                                js.executeScript("window.ScrollBy(0,500);");
                                js.executeScript("window.ScrollBy(0,-500);");

                                        //hiddenelementclick
                                WebElement hiddenElement = driver.findElement(By.id("hiddenElementId"));
                                JavascriptExecutor js1 = (JavascriptExecutor) driver;
                                js.executeScript("arguments[0].click();", hiddenElement);

                                     //dropdown

                                     WebElement element4=driver.findElement(By.xpath("xpath"));
                                    Select sel=new Select(element4);
                                    sel.selectByVisibleText("apple");
                                    sel.selectByIndex(0);
                                    sel.selectByValue("0");

        //handling excel
            FileInputStream fis=new FileInputStream("excel path");  
            XSSFWorkbook workbook=new XSSFWorkbook(fis);
            XSSFSheet sheet=workbook.getSheetAt(0);                      //There are two types of excel version :
            XSSFRow row=sheet.getRow(0);                                 // 1.HSSF (format : .xls) 2003 year
            XSSFCell cell=row.getCell(0);                                //2.XSSF(format:.xlsx) 2007 year and later.

        //keyboardactions using senkeys

           driver.findElement(By.xpath("xpath")).sendKeys("aslam");
           driver.findElement(By.xpath("xpath")).sendKeys(Keys.ENTER);//to click in the text field
           driver.findElement(By.xpath("xpath")).sendKeys(Keys.TAB);//move to the next tab
           driver.findElement(By.xpath("xpath")).sendKeys(Keys.CONTROL, "a");
           driver.findElement(By.xpath("xpath")).sendKeys(Keys.CONTROL, "c");
           driver.findElement(By.xpath("xpath")).sendKeys(Keys.CONTROL, "v");
           driver.findElement(By.xpath("xpath")).sendKeys(Keys.F5);


                  //screeshots
              Robot robo=new Robot();
              Rectangle rect=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
              BufferedImage image=robot.createScreenCapture(rect);
              String file=("file where you want to save");
              ImageIO.write(image, "png", new File(file));

//explicit/implicit/fluent waits	
//implcit:
      //Waits for a specified time (10 seconds) before throwing an exception if the element is not found.
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Applies globally to all elements.

  //explicit:
    //Waits for a specific condition (e.g., visibility of an element) for a specified time (10 seconds).
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
  WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath")));

  // Fluent Wait:
  // More flexible, allowing you to define the maximum wait time, polling interval, and exceptions to ignore.
          // Waits for a specific condition (e.g., finding an element by ID) with custom settings.
Wait<WebDriver> fluentWait = new FluentWait<>(driver)
    .withTimeout(Duration.ofSeconds(30))
    .pollingEvery(Duration.ofSeconds(5))
    .ignoring(NoSuchElementException.class);
WebElement fluentElement = fluentWait.until(driver -> driver.findElement(By.id("elementId")));
          


         


                





        //  WebElement element= driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendkeys("aslam");
      //     String a=element.getText();
      //     System.out.println(a);
      
    }
       
         
        //swithto()
        //Actions
        //scrollbar
        //dropdown
        //handling excel
        //keyboardactions using senkeys
        //screeshots
        //explicit/implicit waits	
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Wait for elements globally

              // Robot robot=new Robot();
              // Rectangle rect=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
              // BufferedImage image=robot.createScreenCapture(rect);
              // String file = ("C:\\Users\\aslam\\OneDrive\\seleniumscreenshots\\screenshot.png");
              // ImageIO.write(image, "png", new File(file));
                     
                  




       

                            



             
           
                
               



































          





    }

}
