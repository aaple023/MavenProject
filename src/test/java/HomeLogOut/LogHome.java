package HomeLogOut;

import Home.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogHome {
    public static WebDriver driver;
    @BeforeMethod
    public  static  void setUp(){
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }
    @Test
    public static void allFruit_item(){
        HomePage.product_list_fruit();
        HomePage.reviewProduct();
        HomePage.compare_card_view_items();

    }
}
