package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc007Page;
import static org.junit.Assert.assertEquals;

public class tc007Steps {
    WebDriver driver;
    tc007Page uploadPage;

    public tc007Steps() {
        driver = Hooks.getDriver();
        uploadPage = PageFactory.initElements(driver, tc007Page.class);
    }

    @Given("un archivo con extensión {string}")
    public void un_archivo_con_extension(String extension) {
        uploadPage.selectFileWithExtension(extension);
    }

    @When("el usuario intenta cargar el archivo")
    public void el_usuario_intenta_cargar_el_archivo() {
        uploadPage.clickUploadButton();
    }

    @Then("el sistema debe mostrar un mensaje de error indicando que la extensión no es admitida")
    public void el_sistema_debe_mostrar_un_mensaje_de_error() {
        String actualMessage = uploadPage.getErrorMessage();
        assertEquals("La extensión no es admitida", actualMessage);
    }
}