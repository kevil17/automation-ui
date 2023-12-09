package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.TodoLyLogin;
import task.tasking.TodoLyNewProject;
import task.validations.IsLogOut;
import task.validations.IsProjectvisible;

public class TodoTestNewProject extends BaseTest{
    @Test
    public void checkNewProject(){
        TodoLyNewProject.as(webDriver,"kevin.inck@gmail.com","kevin123456","Diplomado V5");
        Assert.assertTrue(IsProjectvisible.visible(webDriver));
    }
}
