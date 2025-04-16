package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc002Page {

    WebDriver driver;

    // Selectors
    By fileInputSelector = By.id("fileInput");
    By uploadButtonSelector = By.id("uploadButton");
    By invalidFormatMessageSelector = By.id("invalidFormatMessage");

    public tc002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectInvalidFormatFile() {
        driver.findElement(fileInputSelector).sendKeys("/path/to/invalid/format/file");
    }

    public void uploadFile() {
        driver.findElement(uploadButtonSelector).click();
    }

    public boolean isInvalidFormatMessageDisplayed() {
        return driver.findElement(invalidFormatMessageSelector).isDisplayed();
    }
}