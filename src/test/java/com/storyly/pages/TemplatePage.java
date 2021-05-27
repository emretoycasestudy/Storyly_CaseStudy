package com.storyly.pages;

import com.storyly.utilities.BrowserUtils;
import com.storyly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplatePage extends BasePage{
    @FindBy(xpath = "(//div[@class='ant-collapse-header'])[1]")
    public WebElement imageBtn;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/div/div/div[2]/div/div/div[4]/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div/div/span[1]")
    public WebElement imageBtnLst;

    @FindBy(xpath= "/html/body/div[8]/div/div/div/div[2]/div[1]/div/div/div[2]/div")
    public WebElement image_g_image;


    @FindBy(xpath = "(//div[@class='ant-collapse-header'])[2]")
    public WebElement text1Btn;

    @FindBy(xpath = "(//input[@class=\"ant-radio-input\"])[1]")
    public WebElement selectSync;

    @FindBy(xpath = "(//div[@class='ant-select ant-select-lg ant-select-single ant-select-show-arrow'])[2]")
    public WebElement text1BtnLst;

    @FindBy(xpath = "/html/body/div[9]/div/div/div/div[2]/div[1]/div/div/div[3]")
    public WebElement Text1_g_artist;

    @FindBy(xpath = "(//div[@class='ant-collapse-header'])[3]")
    public WebElement text2Btn;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/div/div/div[2]/div/div/div[4]/div/div[2]/div/div[1]/div[3]/div[2]/div/div/div[2]/div")
    public WebElement text2BtnLst;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/div/div/div[2]/div/div/div[4]/div/div[2]/div/div[1]/div[3]/div[2]/div/div/div[1]/div/label[1]")
    public WebElement test2SelectSync;

    @FindBy(xpath = "/html/body/div[10]/div/div/div/div[2]/div[1]/div/div/div[1]")
    public WebElement text2_g_id;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/div/div/div[2]/div/div/div[4]/div/div[2]/div/div[2]/div/div[2]/input")
    public WebElement numberOfStories;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/div/div/div[3]/div[2]/button")
    public WebElement nextBtn;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/span/div/span/input")
    public WebElement uploadImageBtn;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/input")
    public WebElement groupName;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div/div/div[3]/div/button")
    public WebElement createBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/section/section/main/section/div[3]/div[1]/div/div/div[3]/span")
    public WebElement statusTitle;

    @FindBy(className = "active-story-text")
    public WebElement activeStatus;


    public void openTemplate(){
        BrowserUtils.wait(3);
        BrowserUtils.hover(selectThirdTemplate);
        selectTemplateBtn.click();
        nextBtn.click();
    }
    public void selectTemplateMenu(){
        plsSelectBtn.click();
        selectLanscapeTemplate.click();
    }
    public void setTemplateData(){

        imageBtn.click();
        imageBtnLst.click();
        BrowserUtils.wait(2);
        image_g_image.click();
        BrowserUtils.wait(2);
        text1Btn.click();
        BrowserUtils.wait(2);
        selectSync.click();
        BrowserUtils.wait(2);
        text1BtnLst.click();
        BrowserUtils.wait(2);
        Text1_g_artist.click();
        BrowserUtils.scrollToElement(numberOfStories);
        text2Btn.click();
        BrowserUtils.wait(2);
        test2SelectSync.click();
        BrowserUtils.wait(2);
        text2BtnLst.click();
        BrowserUtils.wait(2);
        text2_g_id.click();
        BrowserUtils.scrollToElement(numberOfStories);
        numberOfStories.sendKeys("10");
        BrowserUtils.wait(2);
        nextBtn.click();

    }
    public void setGroupPhoto(){
        String projectPath=System.getProperty("user.dir");
        String filePath="/src/test/resources/karabas.png";
        String fullPath=projectPath+filePath;
        String path="/Users/emreemre/Desktop/pom.jpeg";

        uploadImageBtn.sendKeys(fullPath);
        Driver.get().findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/button[2]")).click();
        groupName.sendKeys("Landscape");
        BrowserUtils.wait(2);
        createBtn.click();

    }
    public void verifyActiveStatus(){
        String expectedStatus= BrowserUtils.waitForVisibility(activeStatus,120).getText();

        // BrowserUtils.waitFor(120);
        Assert.assertTrue("120 saniyeden az sürmüştür",expectedStatus.contains("Active"));


    }
}