import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public static void main(String[] args) {
        registerCreateAccount();
        registerCreateAccount2();
    }
        public static void registerCreateAccount () {

        //Create an account test
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("http://testfasttrackit.info/selenium-test/");
            driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        // Fill in the *required fields and click on Register.
            driver.quit();
        }


        public static void registerCreateAccount2 (){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            //Try to register without filling in the required fields
            driver.get("http://testfasttrackit.info/selenium-test/");
            driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
            driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();


        }



    }

