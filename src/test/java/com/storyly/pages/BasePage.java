package com.storyly.pages;

import com.storyly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "username")
    public WebElement username;

    @FindBy(xpath = "(//*[a=\"Settings\"]/a)[1]")
    public WebElement settingsBtn;

    @FindBy(xpath = "//*[@id=\"rc-tabs-0-tab-8\"]")
    public WebElement dataSourceManagement;

    @FindBy(xpath = "//*[@id=\"rc-tabs-0-panel-8\"]/div/div[1]/button")
    public WebElement addFeedBtn;

    @FindBy(id = "url")
    public WebElement addFeedUrl;

    @FindBy(xpath = "//*[@placeholder=\"My Product Feed\"]")
    public WebElement feedName;

    @FindBy(xpath = "//*[@class=\"btn-group\"]/button[2]")
    public WebElement saveBtn;

    @FindBy(xpath = "//*[@class=\"ant-btn ant-dropdown-trigger storyly-btn storyly-btn-primary storyly-btn-sm\"]")
    public WebElement addStoryGroupBtn;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/ul[1]/li[2]/button[1]")
    public WebElement createFromTemplateBtn;

    @FindBy(xpath = "(//*[@class='template-container'])[3]")
    public WebElement selectThirdTemplate;

    @FindBy(xpath = "(//span[@class='action-buttons'])[3]")
    public WebElement selectTemplateBtn;

    @FindBy(xpath = "(//button[@class='ant-btn storyly-btn storyly-btn-primary'])")
    public WebElement nextBtn;

    @FindBy(xpath = "//*[@class='ant-select ant-tree-select ant-select-lg ant-select-single ant-select-show-arrow ant-select-show-search']")
    public WebElement plsSelectBtn;

    @FindBy(xpath = "//span[@title=\"Landscape\"]")
    public WebElement selectLanscapeTemplate;

}
