package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegistroPage;

public class RegistroSteps {
    WebDriver driver;
    RegistroPage registroPage;

    @Given("El usuario está en la página de registro de Penguin Random House")
    public void el_usuario_está_en_la_página_de_registro() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.penguinlibros.com/ar/registro");
        registroPage = new RegistroPage(driver);
    }

    @When("El usuario completa el campo Nombre con {string}")
    public void el_usuario_completa_el_campo_nombre(String nombre) {
        registroPage.ingresarNombre(nombre);
    }

    @When("El usuario completa el campo Apellido con {string}")
    public void el_usuario_completa_el_campo_apellido(String apellido) {
        registroPage.ingresarApellido(apellido);
    }

    @When("El usuario completa el campo Email con {string}")
    public void el_usuario_completa_el_campo_email(String email) {
        registroPage.ingresarEmail(email);
    }

    @When("El usuario completa el campo Contraseña con {string}")
    public void el_usuario_completa_el_campo_contraseña(String contraseña) {
        registroPage.ingresarContraseña(contraseña);
    }

    @When("El usuario completa el campo Fecha de nacimiento con {string}")
    public void el_usuario_completa_el_campo_fecha_nacimiento(String fechaNacimiento) {
        registroPage.ingresarFechaNacimiento(fechaNacimiento);
    }

    @When("El usuario acepta los términos y condiciones")
    public void el_usuario_acepta_los_términos_y_condiciones() {
        registroPage.aceptarTerminos();
    }

    @When("El usuario hace clic en el botón Guardar")
    public void el_usuario_hace_clic_en_el_boton_guardar() {
        registroPage.clickGuardar();
    }

    @Then("Se espera que el sistema no permita registrarse y muestre un mensaje de error")
    public void se_espera_que_el_sistema_no_permita_registrarse() {
        // Implementa la verificación del mensaje de error aquí
        driver.quit();
    }
}

