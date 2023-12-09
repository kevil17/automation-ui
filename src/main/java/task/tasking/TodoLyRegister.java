package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.TodoUI;

public class TodoLyRegister {
    public static void as(WebDriver webDriver, String fullName,String email, String pass){
        Click.on(webDriver, TodoUI.formSign);
        Enter.text(webDriver, TodoUI.fullname, fullName);
        Enter.text(webDriver, TodoUI.email, email);
        Enter.text(webDriver, TodoUI.pass, pass);
        Click.on(webDriver, TodoUI.check);
        Click.on(webDriver, TodoUI.signup);
    }
}
