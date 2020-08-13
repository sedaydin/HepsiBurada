package com.testinium.Page;

import com.testinium.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super (driver);
    }


    public LoginPage login() throws InterruptedException {
        actionsID ("myAccount");
        TimeUnit.SECONDS.sleep (3);
        clickId ("login");
        setId ("txtUserName","xxx");
        setId ("txtPassword","xxx");
        clickId ("btnLogin");
        TimeUnit.SECONDS.sleep (3);
          return  new LoginPage (driver);
    }

    public HomePage loginControll(){
        WebElement conrolElement= driver.findElement (By.cssSelector ("div[class='sc-fzoLsD fYZyZu']>div[class='sc-fznKkj fQkkzS']"));
        String elementText = conrolElement.getText();
        System.out.printf (elementText);
        return  new HomePage (driver);

    }
}
