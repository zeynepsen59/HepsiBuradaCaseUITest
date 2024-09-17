package org.HepsiBurada.page;

import org.HepsiBurada.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

    public ProductDetailPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "section[data-test-id='tab']>div>button:nth-child(2)")
    public WebElement reviewsTab;

    @FindBy(xpath = "(//div[contains(@class,'thumbsUp')])[1]")
    public WebElement likeReviewIcon;

    @FindBy(xpath = "//*[@id='hermes-voltran-comments']/div[5]/div[3]/div/div[1]/div[2]/div[5]/div[2]/span")
    public WebElement likeReviewText;

    @FindBy(xpath = "(//div[contains(@class,'hermes-FilterTags')])[1]")
    public WebElement reviewFilterTags;

    @FindBy(xpath = "//*[text()='Henüz değerlendirme yok']")
    public WebElement noReviewText;
}
