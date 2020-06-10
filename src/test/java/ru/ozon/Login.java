package ru.ozon;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login extends Main{

    @Before
    public void StartTestLogin() {
        StartChrome();
    }

    @Test
    @Step("Login via sms")
    public void LoginOzone(){
        // here we login via sms
    }

    @Test
    @Step("Check login (“Войти в аккаунт” --> “Мой профиль”)")
    public void MyProfile(){
        WebElement loginRefactor =
                driver.findElement(By.xpath("//a[@class='a0i0 a9e8 c0b3']//span[@class='a9f1']"));
        Assert.assertNotEquals(loginRefactor, "Войти");
    }

}
