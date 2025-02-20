import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class haha {
       @Test
       public void aslam() throws InterruptedException, AWTException, IOException{
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("ASLAM");
        // Thread.sleep(1000);
        // driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(Keys.CONTROL+"c");


        // driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(Keys.CONTROL+"c");
        // Thread.sleep(1000);

        // driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(Keys.CONTROL+"v");
        // Thread.sleep(1000);

        Robot robot = new Robot();
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
                
         // Define the file path to save the image
            String filePath = ("C:\\Users\\aslam\\OneDrive\\seleniumscreenshots\\screenshot.png");
            // Save the screenshot as a PNG file
            ImageIO.write(screenFullImage, "png", new File(filePath));



          FileInputStream file = new FileInputStream("D:\vscode29th\batch52\excel.handling\excel.practice1.xlsx");
          XSSFWorkbook workbook = new XSSFWorkbook(file);
          XSSFSheet sheet = workbook.getSheetAt(0);
          XSSFRow row = sheet.getRow(0);
          XSSFCell cell = row.getCell(0);





       }
}
