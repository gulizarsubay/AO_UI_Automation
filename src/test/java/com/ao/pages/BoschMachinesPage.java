package com.ao.pages;

import com.ao.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoschMachinesPage {

    public BoschMachinesPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[@data-tag-name='more-filter-options-clicked']")
    public WebElement moreFilterOptions;

    @FindBy(xpath = "//div[@class='facet-type__colour-swatch fv_silver']")
    public WebElement colourSilver;

}
