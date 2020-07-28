package com.ao.pages;

import com.ao.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WashingMachinesPage {

    public WashingMachinesPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@data-tag-name='bosch']")
    public WebElement Bosch;

}
