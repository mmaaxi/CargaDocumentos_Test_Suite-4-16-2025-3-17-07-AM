package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc005Page;

public class tc005Steps {

    tc005Page page = new tc005Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario selecciona varios archivos válidos")
    public void el_usuario_selecciona_varios_archivos_válidos() {
        page.selectMultipleFiles();
    }

    @Then("los archivos seleccionados se muestran preparados para la carga múltiple")
    public void los_archivos_seleccionados_se_muestran_preparados_para_la_carga_múltiple() {
        Assert.assertTrue(page.areFilesReadyForUpload());
    }

    @When("el usuario realiza la acción de cargar")
    public void el_usuario_realiza_la_acción_de_cargar() {
        page.clickUploadButton();
    }

    @Then("todos los documentos se cargan correctamente")
    public void todos_los_documentos_se_cargan_correctamente() {
        Assert.assertTrue(page.areFilesUploadedSuccessfully());
    }

    @Then("se muestran mensajes de confirmación para cada documento cargado")
    public void se_muestran_mensajes_de_confirmación_para_cada_documento_cargado() {
        Assert.assertTrue(page.areConfirmationMessagesDisplayed());
    }
}