package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc003Page;

public class tc003Steps {

    tc003Page page = new tc003Page();

    @Given("El usuario está en la página de carga de archivos")
    public void el_usuario_está_en_la_página_de_carga_de_archivos() {
        page.navigateToFileUploadPage();
    }

    @When("Selecciona un archivo que supera el tamaño máximo permitido")
    public void selecciona_un_archivo_que_supera_el_tamaño_máximo_permitido() {
        page.selectLargeFile();
    }

    @When("Intenta cargar el archivo")
    public void intenta_cargar_el_archivo() {
        page.uploadFile();
    }

    @Then("Se muestra un mensaje de error indicando que el archivo excede el límite de tamaño")
    public void se_muestra_un_mensaje_de_error_indicando_que_el_archivo_excede_el_límite_de_tamaño() {
        Assert.assertTrue(page.isFileSizeErrorMessageDisplayed());
    }
}