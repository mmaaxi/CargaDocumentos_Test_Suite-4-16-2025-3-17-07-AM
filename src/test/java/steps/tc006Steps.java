package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc006Page;

public class tc006Steps {
    WebDriver driver = new ChromeDriver();
    tc006Page page = new tc006Page(driver);

    @Given("el usuario tiene un documento listo para cargar")
    public void el_usuario_tiene_un_documento_listo_para_cargar() {
        // Preparar documento y página inicial
        page.navigateToUploadPage();
    }

    @When("el usuario inicia la carga del documento")
    public void el_usuario_inicia_la_carga_del_documento() {
        page.startDocumentUpload();
    }

    @Then("el documento comienza a cargarse")
    public void el_documento_comienza_a_cargarse() {
        assert(page.isUploadInProgress());
    }

    @When("el usuario presiona el botón 'Cancelar'")
    public void el_usuario_presiona_el_boton_cancelar() {
        page.cancelUpload();
    }

    @Then("el proceso se detiene y se regresa a la pantalla inicial sin almacenar el documento")
    public void el_proceso_se_detiene_y_se_regresa_a_la_pantalla_inicial_sin_almacenar_el_documento() {
        assert(page.isOnInitialScreen());
    }
}