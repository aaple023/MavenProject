package Lohout;

import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cont {
    public static WebDriver driver;
    @BeforeMethod
    public void webLnch() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



    }
    @Test
    public  void  title() {

        System.out.println(driver.getTitle());
    }

    @Test
    public static void lung(){
        Login log= new Login();
        log.lunch1();


    }
    @AfterMethod
    public static  void closed(){
        driver.close();
    }


}


