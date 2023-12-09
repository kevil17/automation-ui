package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.TodoLyNewProject;
import task.tasking.TodoLyNewTask;
import task.validations.IsProjectvisible;
import task.validations.IsTaskCreated;

public class TodoTestNewTask extends BaseTest{
    @Test
    public void checkNewTask(){
        TodoLyNewTask.as(webDriver,"kevin.inck@gmail.com","kevin123456","Tarea completada");
        Assert.assertTrue(IsTaskCreated.visible(webDriver));
    }
}
