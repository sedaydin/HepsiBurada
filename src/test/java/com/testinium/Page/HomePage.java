package com.testinium.Page;

import com.testinium.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super (driver);
    }

    public HomePage selectCategori() throws InterruptedException {
        int random = new Random ().nextInt(8);
        int random2 = new Random ().nextInt(8);
        int x = new Random ().nextInt(9);

       clickXpath ("//*[@class='MenuItems-oCEzK']//ul//li["+random+"]");
       TimeUnit.SECONDS.sleep (2);
        clickXpath ("//*[@class='ChildMenuItems-2DIVP navigationContainer']/div[@class='ChildMenuItems-3bApg']/a["+random2+"]");


        return new HomePage (driver);
    }



}
