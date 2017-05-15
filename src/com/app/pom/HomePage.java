package com.app.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    //Anchors
    public static String titleH = "NBA.com";
    static By scoreLink = By.xpath("//*[@id=\"block-mainnavigation\"]/nav/div[2]/ul/li[1]/a");
    static By shedule1 = By.xpath("//*[@id=\"block-mainnavigation\"]/nav/div[2]/ul/li[2]/a");

    //Elements
    public static WebElement score(WebDriver driver){
        return driver.findElement(scoreLink);
    }
    public static WebElement schedule(WebDriver driver){
        return driver.findElement(shedule1);
    }

}
