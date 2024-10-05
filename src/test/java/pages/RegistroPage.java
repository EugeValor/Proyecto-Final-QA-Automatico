package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistroPage {
    WebDriver driver;


    By nombreField = By.id("nombre-input");
    By apellidoField = By.id("apellido-input");
    By emailField = By.id("email-input");
    By contraseñaField = By.id("password-input");
    By fechaNacimientoField = By.id("fecha-nacimiento-input");
    By terminosCheckbox = By.id("terminos-checkbox");
    By guardarButton = By.xpath("//button[text()='Guardar']");


    public RegistroPage(WebDriver driver) {
        this.driver = driver;
    }


    public void ingresarNombre(String nombre) {
        driver.findElement(nombreField).sendKeys(nombre);
    }

    public void ingresarApellido(String apellido) {
        driver.findElement(apellidoField).sendKeys(apellido);
    }

    public void ingresarEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void ingresarContraseña(String contraseña) {
        driver.findElement(contraseñaField).sendKeys(contraseña);
    }

    public void ingresarFechaNacimiento(String fecha) {
        driver.findElement(fechaNacimientoField).sendKeys(fecha);
    }

    public void aceptarTerminos() {
        driver.findElement(terminosCheckbox).click();
    }

    public void clickGuardar() {
        driver.findElement(guardarButton).click();
    }
}
