package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc003Page {

    private WebDriver driver;

    // Locator for file upload input
    private By fileInputField = By.id("file-upload");
    private By uploadButton = By.id("upload-button");
    private By errorMessage = By.id("file-size-error");

    public tc003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToFileUploadPage() {
        driver.get("http://example.com/file-upload");
    }

    public void selectLargeFile() {
        WebElement fileInput = driver.findElement(fileInputField);
        fileInput.sendKeys("C:\\path\\to\\large\\file.txt");
    }

    public void uploadFile() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click();
    }

    public boolean isFileSizeErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}