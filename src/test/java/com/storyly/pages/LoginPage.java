package com.storyly.pages;

import com.storyly.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    String myEmail= ConfigurationReader.get("email");
    String myPassword=ConfigurationReader.get("password");

    public void login(){
        email.sendKeys(myEmail);
        password.sendKeys(myPassword, Keys.ENTER);
    }

}
