package pages;
import com.microsoft.playwright.Page;
public class EmployeePage {
    private Page page;

    public EmployeePage(Page page) {
        this.page = page;
    }
    public void NavergarenPIM() {
        page.waitForSelector("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a", new Page.WaitForSelectorOptions().setTimeout(60000));
        page.click("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
    }

    public void crearEmpleado(String firstName, String middleName, String lastName, String employeeId) {
        // Hacer clic en el botón para agregar empleado
        page.click("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");

        try {
            Thread.sleep(2000); // Espera de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // rellenar campos del empleado
        page.fill("//input[@name='firstName']", firstName);
        try {
            Thread.sleep(2000); // Espera de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.fill("//input[@name='middleName']", middleName);
        try {
            Thread.sleep(2000); // Espera de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.fill("//input[@name='lastName']", lastName);
        try {
            Thread.sleep(2000); // Espera de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Campo empleado ID
        page.fill("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input", employeeId);

        // Hacer clic en el botón "Guardar"
        page.click("//div[@id='app']//button[2]");

        // Esperar un poco después de guardar
        try {
            Thread.sleep(20000); // Espera de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void buscarEmpleado(String NombreCompleto) {
        // Ejemplo de un XPath corregido sin caracteres extra
        String xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input";

        // Agrega una espera aquí si es necesario
        page.waitForSelector("xpath=" + xpath);

        // Completa el campo de entrada
        page.fill("xpath=" + xpath, NombreCompleto);

        //click boton buscar
        page.click("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
        try {
            Thread.sleep(10000); //esperar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Hacer scroll hacia el campo de entrada
        page.evaluate("window.scrollBy(0, 500);"); // Desplazar 500 píxeles hacia abajo
        try {
            Thread.sleep(5000); //esperar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
   /* public boolean ValidacionEmpleado(String firstName, String lastName) {
        page.waitForTimeout(2000);
        return page.isVisible("//td[contains(text(), '" + firstName + "') and contains(text(), '" + lastName + "')]");
    }*/
}
