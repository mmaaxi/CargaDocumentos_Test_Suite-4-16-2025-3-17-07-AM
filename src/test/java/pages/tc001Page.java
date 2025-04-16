package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc001Page {
    
    WebDriver driver;

    By fileInput = By.id("file-upload-input");
    By uploadButton = By.id("upload-button");
    By successMessage = By.id("success-message");

    public tc001Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void seleccionarArchivo(String filePath) {
        WebElement fileUploadElement = driver.findElement(fileInput);
        fileUploadElement.sendKeys(filePath);
    }
    
    public void clicEnCargar() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.click();
    }
    
    public void verificarCargaExitosa() {
        WebElement messageElement = driver.findElement(successMessage);
        if (!messageElement.isDisplayed() || !messageElement.getText().contains("Carga exitosa")) {
            throw new AssertionError("El mensaje de éxito no se mostró o fue incorrecto");
        }
    }
}