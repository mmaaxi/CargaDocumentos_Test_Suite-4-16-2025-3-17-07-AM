package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc007Page {
    WebDriver driver;
    
    By fileInput = By.id("fileUploadInput");
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFileWithExtension(String extension) {
        // Simulación de la selección de un archivo con una extensión específica.
        // Esto puede existir en un directorio temporal para pruebas.
        driver.findElement(fileInput).sendKeys("/path/to/file" + extension);
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}