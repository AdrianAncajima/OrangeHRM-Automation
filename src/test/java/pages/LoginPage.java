package pages;
import com.microsoft.playwright.Page;
public class LoginPage {
    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigateTo() {
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void login(String username, String password) {
        page.fill("//input[@name='username']", username);
        page.fill("//input[@name='password']", password);
        page.click("//button[@type='submit']");
    }
}
