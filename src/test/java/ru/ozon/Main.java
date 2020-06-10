package ru.ozon;

import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

import java.io.File;

public class Main {

    public ChromeDriver driver;

    public void StartChrome() {
        System.setProperty("webdriver.chrome.driver", "/Users/kulakov/IntelliJProjects/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.ozon.ru/");
    }

    public void TakeScreenshot () {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }

//    @After
//    public void CloseChrome() {
//        driver.quit();
//    }

}
