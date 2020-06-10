package ru.ozon;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ChangeCity extends Main {

    @Before
    public void StartTestLogin() {
        StartChrome();
    }

    @Test
    @Step("Edit  City")
    public void EditCity(){

        WebElement currentCity =
                driver.findElement(By.xpath("//span[@class='c2s']"));
        currentCity.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement inputField =
                driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]" +
                        "/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/input[1]"));
        //inputField.clear();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        inputField.sendKeys("Вольск");

        WebElement volskName =
                driver.findElement(By.partialLinkText("Вольск, Саратовская"));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        volskName.click();

        WebElement newCity =
                driver.findElement(By.xpath("//span[@class='c2s']"));
        Assert.assertEquals(currentCity, newCity);
    }
}
