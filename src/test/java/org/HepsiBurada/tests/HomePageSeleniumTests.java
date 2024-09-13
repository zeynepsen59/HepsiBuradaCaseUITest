package org.HepsiBurada.tests;

import org.HepsiBurada.page.ProductDetailPage;
import org.HepsiBurada.utils.BrowserUtils;
import org.HepsiBurada.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.HepsiBurada.page.HomePage;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageSeleniumTests {
    public HomePage homePage;
    public ProductDetailPage productDetailPage;
    public WebDriverWait wait;
    public JavascriptExecutor jsExecutor;

    @BeforeEach
    public void setUp() {
        Driver.getDriver().get("https://www.hepsiburada.com/");
        init();
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        jsExecutor = (JavascriptExecutor) Driver.getDriver();
    }

    @AfterEach
    public void tearDown() {
        Driver.closeDriver();
    }

    public void init() {
        homePage = new HomePage();
        productDetailPage = new ProductDetailPage();
    }

    public void goProductDetailPage() {
        BrowserUtils.sleep(2);
        homePage.searchDiv.click();

        homePage.searchInput.sendKeys("iphone");
        homePage.searchInput.sendKeys(Keys.ENTER);
        homePage.firstProduct.click();

        BrowserUtils.switchBrowserTab();
    }

    public void goReviewsTab() {
        BrowserUtils.scrollIntoView(productDetailPage.reviewsTab);
        productDetailPage.reviewsTab.click();

        BrowserUtils.scrollIntoView(productDetailPage.reviewFilterTags);
    }

    @Test
    public void testGoHomePageTest() {
        Assertions.assertEquals("https://www.hepsiburada.com/", Driver.getDriver().getCurrentUrl());
    }

    @Test
    public void testLikeReview() {
        goProductDetailPage();
        goReviewsTab();

        if (productDetailPage.reviewFilterTags.isDisplayed()) {
            productDetailPage.likeReviewIcon.click();

            BrowserUtils.sleep(2);

            Assertions.assertEquals(productDetailPage.likeReviewText.getText(), "Teşekkür Ederiz.");
        } else {
            Assertions.assertTrue(productDetailPage.noReviewText.isDisplayed());
        }
    }
}