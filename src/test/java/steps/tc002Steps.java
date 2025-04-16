package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc002Page;

public class tc002Steps {

    tc002Page page = new tc002Page();

    @Given("El usuario selecciona un archivo con formato erróneo")
    public void elUsuarioSeleccionaUnArchivoConFormatoErroneo() {
        page.selectInvalidFormatFile();
    }

    @When("El usuario intenta cargar el archivo")
    public void elUsuarioIntentaCargarElArchivo() {
        page.uploadFile();
    }

    @Then("El sistema muestra un mensaje de formato de archivo inválido")
    public void elSistemaMuestraUnMensajeDeFormatoDeArchivoInvalido() {
        Assert.assertTrue(page.isInvalidFormatMessageDisplayed());
    }
}