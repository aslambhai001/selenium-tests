import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {

          @Test
          public void aslam(){
          System.out.println("aslam");
          }
          @BeforeClass
          public void baba(){
            System.out.println("baba");

          }
}
