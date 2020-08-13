package com.testinium.Page;

import com.testinium.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super (driver);

    }


    public  ProductPage minMAxPrice(String i,String i2){
        clickCssSelector ("ol[class='show-all-brands scrollable-filter-container scroll-lock']>li[class='unselected']");

        setCssSelector ("div[class='range-contain-row left']>input[placeholder='En az']",i);
        setCssSelector ("div[class='range-contain-row left']>input[placeholder='En çok']",i2);
        clickCssSelector ("div[class='range-contain-row right']>button");

        return new ProductPage (driver);
    }

    public HomePage selectProduct() throws InterruptedException {
      int random = new Random ().nextInt(10);
        TimeUnit.SECONDS.sleep (3);
    String  x =clickXpath ("//*[@class='product-list results-container do-flex list']/li["+random+"]/div/a");

        return new HomePage (driver);
    }


}

