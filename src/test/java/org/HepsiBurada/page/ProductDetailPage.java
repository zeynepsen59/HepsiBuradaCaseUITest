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

    @FindBy(css = "#hermes-voltran-comments > div.hermes-ReviewList-module-eY_sarN5VMgtON43g9EM > div.paginationOverlay > div > div:nth-child(1) > div.hermes-ReviewCard-module-BJtQZy5Ub3goN_D0yNOP > div.hermes-ReviewCard-module-PIYjivsoZ80VfkdrlGgg > div.hermes-ReviewCard-module-QA5PqdPP5EhkpY_vptfv > span")
    public WebElement likeReviewText;

    @FindBy(xpath = "(//div[contains(@class,'hermes-FilterTags')])[1]")
    public WebElement reviewFilterTags;

    @FindBy(xpath = "//*[text()='Henüz değerlendirme yok']")
    public WebElement noReviewText;
}
