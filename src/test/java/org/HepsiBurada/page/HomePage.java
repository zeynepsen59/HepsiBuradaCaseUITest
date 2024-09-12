package org.HepsiBurada.page;

import org.HepsiBurada.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@class,'SearchBoxOld')]/div/div")
    public WebElement searchDiv;

    @FindBy(xpath = "//div[contains(@class,'SearchBoxOld')]/div/div/div/div/div/input")
    public WebElement searchInput;

    @FindBy(xpath = "//*[@id='i0']/div/a/div[1]/div[1]/div[2]")
    public WebElement firstProduct;
}


