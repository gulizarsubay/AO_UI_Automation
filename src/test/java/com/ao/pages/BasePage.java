package com.ao.pages;

import com.ao.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@id='acceptMessage']")
    public WebElement acceptClose;

    @FindBy(xpath = "//button[@data-tag-name='clicked_accept_all']")
    public WebElement acceptAll;

}
