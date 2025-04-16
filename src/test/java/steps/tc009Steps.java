package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc009Page;

public class tc009Steps {
    tc009Page page = new tc009Page();

    @Given("el usuario está en la página de carga de archivos")
    public void usuarioEnPaginaCargaArchivos() {
        page.navigateToPage();
    }

    @When("selecciona un archivo grande")
    public void seleccionaArchivoGrande() {
        page.selectLargeFile();
    }

    @Then("el archivo es reconocido como de gran tamaño")
    public void archivoReconocidoComoGrande() {
        Assert.assertTrue(page.isLargeFileRecognized());
    }

    @When("inicia la carga del archivo")
    public void iniciaCargaArchivo() {
        page.startFileUpload();
    }

    @Then("el sistema gestiona la carga en un tiempo aceptable sin crasheos")
    public void sistemaGestionaCargaAdecuadamente() {
        Assert.assertTrue(page.isUploadPerformanceAcceptable());
    }
}