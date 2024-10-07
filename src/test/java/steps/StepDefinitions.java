package steps;

import com.microsoft.playwright.*;
import io.cucumber.java.en.*;
import pages.EmployeePage;
import pages.LoginPage;

import static org.junit.Assert.*;

public class StepDefinitions {
    private Playwright playwright;
    private Browser browser;
    private Page page;
    private LoginPage loginPage;
    private EmployeePage employeePage;

    @Given("que accedo a OrangeHRM")
    public void que_accedo_a_OrangeHRM() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        loginPage = new LoginPage(page);
        loginPage.navigateTo();
    }

    @When("inicio sesion con {string} y {string}")
    public void inicio_sesion_con_y(String username, String password) {
        loginPage.login(username, password);
    }

    @When("navego a la seccion PIM")
    public void navego_a_la_seccion_PIM() {
        employeePage = new EmployeePage(page);
        employeePage.NavergarenPIM();
    }
    @And("creo un nuevo empleado con el primer nombre {string}, segundo nombre {string}, apellido {string} y codigo {string}")
    public void creoUnNuevoEmpleadoConElPrimerNombreSegundoNombreApellidoYCodigo(String primernombre, String segundonombre, String apellido, String codigo) {
        employeePage.crearEmpleado(primernombre, segundonombre,apellido,codigo);
    }

    @Then("busco y valido el empleado con nombre {string}")
    public void buscoYValidoElEmpleadoConNombre(String NombreCompleto) {
        employeePage.buscarEmpleado(NombreCompleto);
    }
}
