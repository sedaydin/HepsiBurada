package com.testinium.Page;

import com.testinium.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage extends BasePage {


    public IndexPage(WebDriver driver) {
        super (driver);
    }

    public IndexPage click(){
        clickId ("lb-way");
        clickId ("reSearchPassenger");
        select ("select-list","2");
        clickCssSelector ("button[data-dir='up']");
         clickClassName ("checkbox-icon");

        return new IndexPage (driver);
    }
    public IndexPage selectCity(String name, String name2) throws InterruptedException {
        setCssSelector ("input[name='flight_origin']",name);
        clickCssSelector ("ul[id='ui-id-1']>li");
        setCssSelector ("input[name='flight_destination']",name2);
        clickCssSelector ("ul[id='ui-id-2']>li");
        return  new IndexPage (driver);

    }

    public  IndexPage selectDate()  {
        clickCssSelector ("div[class='panel-right']>div");
        clickCssSelector ("td[data-month='8']>a");
        clickCssSelector ("div[class='panel-right']>div[class='search-form-item calendar return  datepicker-wrapper dtp-wrap-to']");
        clickCssSelector ("td[data-month='9']>a");
        clickId ("btnSearch");
        return  new IndexPage (driver);
    }

    public IndexPage pageBuy(){
     WebElement element=  clickCssSelector ("div[class='airline-img-wrapper']>img[src='https://res.cloudinary.com/turna/image/upload/q_auto,f_auto/w_30/Images/Flight/Airlines/TK.png']");

        return new IndexPage (driver);
    }
}
