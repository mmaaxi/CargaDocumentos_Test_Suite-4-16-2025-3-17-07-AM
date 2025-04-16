package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc006Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By cancelButton = By.id("cancelButton");
    By uploadProgress = By.id("uploadProgress");
    By initialScreen = By.id("initialScreen");

    public tc006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void startDocumentUpload() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadInProgress() {
        return driver.findElement(uploadProgress).isDisplayed();
    }

    public void cancelUpload() {
        driver.findElement(cancelButton).click();
    }

    public boolean isOnInitialScreen() {
        return driver.findElement(initialScreen).isDisplayed();
    }
}