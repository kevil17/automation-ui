package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.TodoUI;

public class IsTaskCreated {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, TodoUI.confirmtask);
    }
}
