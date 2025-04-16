package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc004Page;

public class tc004Steps {

    tc004Page page = new tc004Page();

    @Given("el usuario selecciona un archivo corrupto")
    public void el_usuario_selecciona_un_archivo_corrupto() {
        page.selectCorruptFile();
    }

    @When("el usuario intenta cargar el archivo")
    public void el_usuario_intenta_cargar_el_archivo() {
        page.attemptToUploadFile();
    }

    @Then("el sistema informa sobre la corrupción del archivo y la carga falla")
    public void el_sistema_informa_sobre_la_corrupcion_del_archivo_y_la_carga_falla() {
        Assert.assertTrue(page.isCorruptionDetected());
        Assert.assertTrue(page.isUploadFailed());
    }
}