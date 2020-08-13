package com.testinium.Util;

import com.testinium.Page.HomePage;
import com.testinium.Page.LoginPage;
import com.testinium.Page.ProductDetail;
import com.testinium.Page.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;

public class Steps extends Method {


    public static String productName = "";
    public static String detailProductName = "";
    public static String productQuantity = "";
    public static String basketProductQuantity ="";
    public static String totalPrice = "";

    public LoginPage index(){

        return new LoginPage (driver);

    }
    public ProductDetail detail(){


        return new ProductDetail (driver);

    }public ProductPage product(){

        return new ProductPage (driver);

    }
    public HomePage home() throws InterruptedException {
        driver.get ("https://www.hepsiburada.com/");
        TimeUnit.SECONDS.sleep (2);
        return new HomePage (driver);

    }

    public void clictToElement(WebElement element) {
        scrollToElement(element);

        element.click();
    }
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'})", element);
    }
    public void optionClick(String key,Integer number){
        List<WebElement> elements = driver.findElements(By.cssSelector(key));
        clictToElement(elements.get(number));
    }


    public void dropdown(String name, int index){
        WebElement testDropDown = driver.findElement(By.className(name));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByIndex(index);
    }

    public void select(String id,String value){
        Select select= new Select (driver.findElement (By.id (id)));
        select.selectByValue (value);


    }  public void actionsID(String id){
        Actions actions= new Actions (driver) ;
        actions.moveToElement (driver.findElement (By.id (id))).build ().perform ();

    }
    public void setId(String id,String value){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (By.id (id)));
        element.clear ();
        element.sendKeys (value);

    } public void setClassName(String name, String value){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (className (name)));
        element.clear ();
        element.sendKeys (value);

    } public void setXpath(String name,String value){
        WebElement element=new WebDriverWait ((WebDriver) driver,30).until (ExpectedConditions.visibilityOfElementLocated (xpath (name)));
        element.clear ();
        element.sendKeys (value);

    }
    public void setCssSelector(String name,String value){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (cssSelector (name)));
        element.clear ();
        element.sendKeys (value);

    }
    public void setByXpath(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(id)));
        element.clear();
        element.sendKeys(value);
    }

    public void clickId(String id){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (By.id (id)));

        element.click ();

    }

    public WebElement clickCssSelector(String name){
        WebElement element=new WebDriverWait (driver,10).until (ExpectedConditions.visibilityOfElementLocated (By.cssSelector (name)));

        element.click ();

        return element;
    }
    public void clickClassName(String name){
        WebElement element=new WebDriverWait (driver,50).until (ExpectedConditions.visibilityOfElementLocated (className (name)));

        element.click ();



    }public String clickXpath(String xpath){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (By.xpath (xpath)));

        element.click ();


        return xpath;
    }
    public List<WebElement> getElementsByXpath(String s) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[contains(@class, 'products__item-inner'] "))));
    }

    public List<WebElement> getElementsByClass(String s ) {
        return new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(className ("products__item-inner"))));
    }
    public List<WebElement> getElementsByCssSelector(String s ) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(cssSelector ("div.products__item-inner"))));
    }
}
