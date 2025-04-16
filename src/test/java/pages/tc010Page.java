package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc010Page {
    private WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By successMessage = By.id("successMessage");
    private By logEntry = By.cssSelector("div.log-entry");

    public tc010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToCargaDeDocumentosPage() {
        driver.get("https://www.example.com/carga-de-documentos");
    }

    public void cargarDocumento() {
        driver.findElement(uploadButton).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean isOperationLoggedCorrectly() {
        // Aquí se debería agregar una lógica más detallada para verificar los detalles del registro en la bitácora
        return driver.findElement(logEntry).getText().contains("Cargado exitosamente por usuario");
    }
}