package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc001Page;

public class tc001Steps {

    WebDriver driver;
    tc001Page page;

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        driver = new ChromeDriver();
        page = new tc001Page(driver);
        driver.get("http://url-de-la-pagina-de-carga.com");
    }

    @When("El usuario selecciona un archivo válido")
    public void el_usuario_selecciona_un_archivo_válido() {
        page.seleccionarArchivo("ruta/del/archivo/valido.pdf");
    }

    @And("El usuario hace clic en 'Cargar'")
    public void el_usuario_hace_clic_en_cargar() {
        page.clicEnCargar();
    }

    @Then("El documento se carga correctamente y se muestra un mensaje de éxito")
    public void el_documento_se_carga_correctamente_y_se_muestra_un_mensaje_de_exito() {
        page.verificarCargaExitosa();
        driver.quit();
    }
}