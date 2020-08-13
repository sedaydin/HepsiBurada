package com.testinium;

import com.testinium.Base.BaseTest;
import com.testinium.Page.HomePage;
import com.testinium.Page.LoginPage;

public class Test extends BaseTest {
@org.junit.Test
    public  void test() throws InterruptedException {
        new HomePage (driver)
                .home ()
                .index ()
                .login ()
                .loginControll ()
                .home ()
                .selectCategori ();
    }
    @org.junit.Test
    public void test3() throws InterruptedException {
        new HomePage (driver)
                .home ().selectCategori ()
                .product().minMAxPrice ("10","4000").selectProduct ()
                .detail ().write ("C:\\Users\\testinium\\Desktop\\gittigidiyo\\Proje\\Yeni.csv")
                .addBasket ();
    }
}
