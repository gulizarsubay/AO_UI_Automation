package com.ao.pages;

import com.ao.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SilverBoschMachinesPage {

    public SilverBoschMachinesPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h2[text() ='Bosch Serie 6 WAT2840SGB 9Kg Washing Machine with 1400 rpm - Silver - A+++ Rated']")
    public WebElement silverText;

}


