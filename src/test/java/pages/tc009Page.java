package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class tc009Page {
    private WebDriver driver;
    private WebDriverWait wait;
    private By fileInput = By.id("fileUpload");
    private By uploadButton = By.id("uploadButton");
    private By successMessage = By.id("successMessage");

    public tc009Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigateToPage() {
        driver.get("http://example.com/upload");
    }

    public void selectLargeFile() {
        WebElement fileUploadElement = wait.until(ExpectedConditions.elementToBeClickable(fileInput));
        fileUploadElement.sendKeys("/path/to/large/file");
    }

    public boolean isLargeFileRecognized() {
        return driver.findElement(uploadButton).isEnabled();
    }

    public void startFileUpload() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadPerformanceAcceptable() {
        long startTime = System.currentTimeMillis();
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        long endTime = System.currentTimeMillis();
        boolean isPerformanceAcceptable = (endTime - startTime) < 30000; // 30 seconds threshold
        return message.isDisplayed() && isPerformanceAcceptable;
    }
}