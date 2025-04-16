package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc004Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By fileInput = By.id("fileInput");
    By errorMessage = By.id("errorMessage");

    public tc004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCorruptFile() {
        WebElement inputFile = driver.findElement(fileInput);
        inputFile.sendKeys("/path/to/corrupt/file");
    }

    public void attemptToUploadFile() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click();
    }

    public boolean isCorruptionDetected() {
        String expectedErrorMessage = "El archivo está corrupto.";
        return driver.findElement(errorMessage).getText().contains(expectedErrorMessage);
    }

    public boolean isUploadFailed() {
        // Assuming upload status can be verified by checking error message presence
        return driver.findElements(errorMessage).size() > 0;
    }
}