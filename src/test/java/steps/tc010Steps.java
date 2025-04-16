package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.tc010Page;

public class tc010Steps {
    private WebDriver driver;
    private tc010Page page;

    public tc010Steps() {
        this.driver = Hooks.getDriver();
        this.page = new tc010Page(driver);
    }

    @Given("el usuario está en la página de carga de documentos")
    public void usuarioEnPaginaDeCarga() {
        page.navigateToCargaDeDocumentosPage();
    }

    @When("el usuario carga un documento exitosamente")
    public void usuarioCargaDocumento() {
        page.cargarDocumento();
    }

    @Then("se muestra un mensaje de éxito")
    public void verificarMensajeExito() {
        Assert.assertTrue(page.isSuccessMessageDisplayed(), "El mensaje de éxito no se ha mostrado.");
    }

    @Then("la operación queda registrada en la bitácora del sistema con detalles")
    public void verificarRegistroBitacora() {
        Assert.assertTrue(page.isOperationLoggedCorrectly(), "La operación no está correctamente registrada en la bitácora.");
    }
}