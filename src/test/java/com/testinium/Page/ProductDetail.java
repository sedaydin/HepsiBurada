package com.testinium.Page;

import com.opencsv.CSVWriter;
import com.testinium.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProductDetail extends BasePage {
    public ProductDetail(WebDriver driver) {
        super (driver);
    }



    public ProductDetail write(String filePath) {
        String yazdır = driver.findElement (By.id ("product-name")).getText ();
        String yazdır2 = driver.findElement (By.id ("offering-price")).getText ();
        File file = new File (filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter (file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter (outputfile);

            // adding header to csv



            writer.writeNext (new String[]{yazdır});
            writer.writeNext (new String[]{yazdır2});

            // add data to csv

            // closing writer connection
            writer.close ();


        } catch (IOException e) {
            e.printStackTrace ();
        }

  return new ProductDetail (driver);
    }

    public ProductPage addBasket(){

       clickId ("addToCart");

     clickCssSelector ("div[class='SalesFrontCashProductInfo-343IQ']>a");
     clickCssSelector ("div[class='input-group']>button[title='Arttır']");
        return new ProductPage (driver);
    }
    public ProductDetail basketDetails(String filePath) {
        String adet = driver.findElement (By.className ("quantity")).getText ();
        String tutar = driver.findElement (By.className ("total-amount")).getText ();
        File file = new File (filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter (file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter (outputfile);

            // adding header to csv



            writer.writeNext (new String[]{adet});
            writer.writeNext (new String[]{tutar});

            // add data to csv

            // closing writer connection
            writer.close ();


        } catch (IOException e) {
            e.printStackTrace ();
        }
    clickCssSelector ("div[class='cart-proceed-container']>button");
        return new ProductDetail (driver);

    }
}
