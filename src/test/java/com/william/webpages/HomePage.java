package com.william.webpages;

import com.william.factory.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(PAGE_URL);
    }

    private static String PAGE_URL = "https://www.toptal.com";

    @FindBy(linkText = "Hire Top Talent")
    private WebElement hireTopTalentButton;

    public void clickOnHireTopTalentButton() {
        hireTopTalentButton.click();
    }


}
