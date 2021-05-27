package com.storyly.pages;

import com.storyly.utilities.BrowserUtils;
import com.storyly.utilities.ConfigurationReader;
import com.storyly.utilities.Driver;
import org.openqa.selenium.By;

public class ContentPage extends BasePage{
    public void settings(){
        username.click();
        settingsBtn.click();
    }
    public void setUpFeed(){
        addFeedUrl.sendKeys(ConfigurationReader.get("feed"));
        BrowserUtils.wait(2);
        feedName.sendKeys("Landscape");
        BrowserUtils.wait(2);
        saveBtn.click();
    }
    public void goToContent(){
        Driver.get().findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div[1]/div/div[2]/div/div/div/div[1]/button")).click();

    }
}