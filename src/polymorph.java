import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class polymorph {
    @Test
    public void aslam(){
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.youtube.com/");
      driver.close();
    }

}

