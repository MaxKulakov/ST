package ru.ozon;

import io.qameta.allure.Step;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PowerJuicer extends Juicer {

    @Before
    public void StartTestLogin() {
        StartChrome();
    }

    public void waitSecond() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    @Step("SelectJuicer Power")
    public void SelectJuicer() throws InterruptedException {

        WebElement SearchField =
                driver.findElement(By.name("search"));
        waitSecond();
        SearchField.sendKeys("Соковыжималки");
        waitSecond();

        WebElement searchButton =
                driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]" +
                        "/header[1]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/button[1]/div[1]"));
        searchButton.click();
        waitSecond();

        WebElement startRange =
                driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[2]" +
                        "/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[1]/input[1]"));
        for (int i = 0; i < 6; i++)
            startRange.sendKeys(Keys.BACK_SPACE);
        waitSecond();
        startRange.sendKeys("3000");
        waitSecond();

        WebElement endRange =
                driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[2]" +
                        "/div[1]/div[1]/aside[1]/div[2]/div[2]/div[2]/div[2]/input[1]"));
        for (int i = 0; i < 6; i++)
            endRange.sendKeys(Keys.BACK_SPACE);
        waitSecond();
        endRange.sendKeys("4000");
        waitSecond();

        //sometimes there is no power choice
//        WebElement startRangePower =
//                driver.findElement(By.xpath("//div[8]//div[2]//div[2]//div[1]//input[1]"));
//        for (int i = 0; i < 6; i++)
//            startRange.sendKeys(Keys.BACK_SPACE);
//        waitSecond();
//        startRangePower.sendKeys("1000");
//        waitSecond();
//
//        WebElement endRangePower =
//                driver.findElement(By.xpath("//div[8]//div[2]//div[2]//div[2]//input[1]"));
//        for (int i = 0; i < 6; i++)
//            startRange.sendKeys(Keys.BACK_SPACE);
//        waitSecond();
//        endRangePower.sendKeys("5000");
//        waitSecond();

        WebElement popularRange = driver.findElement(By.cssSelector("div.layout-page.desktop div.block-vertical " +
                "div.container.b0c9:nth-child(4) div.bz9:nth-child(2) div.by:nth-child(2) " +
                "div.b0f.by1 div.b3t6:nth-child(1) div.ui-a1k6.ui-a1k7.b3t7 " +
                "div.ui-a0l0.ui-a0g5.ui-a0j2.ui-a0l1 div.ui-a0s9.ui-a1f " +
                "div.ui-a1j5.ui-a1h div.ui-a1k8 > input.ui-a1f3"));
        popularRange.click();
        waitSecond();
        for (int i = 0; i < 2; i++)
            popularRange.sendKeys(Keys.DOWN);
        popularRange.sendKeys(Keys.ENTER);
        waitSecond();
    }
}

