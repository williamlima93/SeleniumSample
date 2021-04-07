package com.william.tests;

import com.william.factory.FunctionalTest;
import com.william.webpages.HomePage;
import org.junit.Test;

public class HomePageTest extends FunctionalTest {

    @Test
    public void clickOnHireButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHireTopTalentButton();
    }


}
