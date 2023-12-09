package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.TodoUI;

public class TodoLyNewProject {
    public static void as(WebDriver webDriver, String email, String pass, String newProject){
        Click.on(webDriver, TodoUI.formLogIn);
        Enter.text(webDriver, TodoUI.emaillogin, email);
        Enter.text(webDriver, TodoUI.passwordlogin, pass);
        Click.on(webDriver, TodoUI.login);
        Click.on(webDriver, TodoUI.formAddProject);
        Enter.text(webDriver, TodoUI.newproject, newProject);
        Click.on(webDriver, TodoUI.newprojectbutton);
    }
}
