package com.vinicius.theinternet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SetupVerificationTest extends BaseTest {

    @Test
    public void homePageLoads() {
        openPage("");
        Assert.assertEquals(driver.getTitle(), "The Internet", "Unexpected page title");
    }
}