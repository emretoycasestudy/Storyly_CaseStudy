package com.storyly.stepDefinitions;

import com.storyly.pages.ContentPage;
import com.storyly.pages.TemplatePage;
import com.storyly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createStoryDef {
    ContentPage contentPage=new ContentPage();
    TemplatePage templatePage=new TemplatePage();

    @When("click to Go To Content button")
    public void click_to_Go_To_Content_button() {
    contentPage.goToContent();
    }

    @When("click to Add Story Group button")
    public void click_to_Add_Story_Group_button() {
    contentPage.addStoryGroupBtn.click();

    }

    @When("select Create From Template option")
    public void select_Create_From_Template_option() {
    contentPage.createFromTemplateBtn.click();
    }

    @When("select source Landscape")
    public void select_source_Landscape() {
        templatePage.openTemplate();
        templatePage.selectTemplateMenu();

    }

    @When("set placeholders")
    public void set_placeholders() {
    templatePage.setTemplateData();

    }

    @When("set group photo and name")
    public void set_group_photo_and_name() {
        templatePage.setGroupPhoto();
    }

    @Then("verify the story is active")
    public void verify_the_story_is_active() throws InterruptedException {
        templatePage.verifyActiveStatus();
    }

}
