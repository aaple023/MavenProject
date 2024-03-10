package Pages;


import org.openqa.selenium.By;

import static Lohout.Cont.driver;

public class Login {
    public void lunch1(){


        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();


    }
}
