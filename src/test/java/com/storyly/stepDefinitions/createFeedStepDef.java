package com.storyly.stepDefinitions;

import com.storyly.pages.ContentPage;
import com.storyly.pages.LoginPage;
import com.storyly.utilities.BrowserUtils;
import com.storyly.utilities.ConfigurationReader;
import com.storyly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class createFeedStepDef {
   LoginPage loginPage=new LoginPage();
   ContentPage contentPage=new ContentPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("log in with valid credentials")
    public void log_in_with_valid_credentials() {
        loginPage.login();
    }

    @When("go to Settings button under the account name")
    public void go_to_Settings_button_under_the_account_name() {
    contentPage.settings();
    }

    @When("click to Data Source Management button")
    public void click_to_Data_Source_Management_button() {
     contentPage.dataSourceManagement.click();
    }

    @When("click Add Feet button")
    public void click_Add_Feet_button() {
    contentPage.addFeedBtn.click();
    }

    @When("enter Feed URL and Feed Name")
    public void enter_Feed_URL_and_Feed_Name() {
     contentPage.setUpFeed();

    }

    @Then("verify item count")
    public void verify_item_count() {
     String expectedResult = BrowserUtils.waitForVisibility(By.xpath("//*[@class=\"feed-col-item-count\"]"), 120).getText();
     Assert.assertTrue("The process took less than 2 minutes",expectedResult.contains("6"));
    }

}
