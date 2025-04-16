package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tc005Page {

    WebDriver driver;

    private By selectFilesButton = By.id("selectFiles");
    private By uploadButton = By.id("uploadFiles");
    private By filesReadyIndicator = By.id("filesReadyIndicator");
    private By successMessage = By.className("successMessage");

    public tc005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectMultipleFiles() {
        WebElement selectButton = driver.findElement(selectFilesButton);
        selectButton.sendKeys("/path/to/file1\n/path/to/file2\n/path/to/file3");
    }

    public boolean areFilesReadyForUpload() {
        return driver.findElement(filesReadyIndicator).isDisplayed();
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean areFilesUploadedSuccessfully() {
        List<WebElement> successMessages = driver.findElements(successMessage);
        return successMessages.size() >= 3; // Assuming we selected 3 files
    }

    public boolean areConfirmationMessagesDisplayed() {
        List<WebElement> confirmationMessages = driver.findElements(successMessage);
        return confirmationMessages.stream().allMatch(WebElement::isDisplayed);
    }
}