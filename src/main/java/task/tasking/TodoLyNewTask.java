package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.TodoUI;

public class TodoLyNewTask {
    public static void as(WebDriver webDriver, String email, String pass, String newTask){
        Click.on(webDriver, TodoUI.formLogIn);
        Enter.text(webDriver, TodoUI.emaillogin, email);
        Enter.text(webDriver, TodoUI.passwordlogin, pass);
        Click.on(webDriver, TodoUI.login);
        Click.on(webDriver, TodoUI.formnewtask);
        Enter.text(webDriver, TodoUI.formnewtask, newTask);
        Click.on(webDriver, TodoUI.addtaskbtn);
    }
}
