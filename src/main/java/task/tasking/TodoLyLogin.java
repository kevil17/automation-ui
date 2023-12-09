package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.TodoUI;

public class TodoLyLogin {

    public static void as(WebDriver webDriver,String email, String pass){
        Click.on(webDriver, TodoUI.formLogIn);
        Enter.text(webDriver, TodoUI.emaillogin, email);
        Enter.text(webDriver, TodoUI.passwordlogin, pass);
        Click.on(webDriver, TodoUI.login);
    }
}
