package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.TodoUI;

public class IsLogin {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, TodoUI.titletodo);
    }
}
