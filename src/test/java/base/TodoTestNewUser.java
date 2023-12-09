package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.TodoLyRegister;
import task.validations.IsLogOut;

public class TodoTestNewUser extends BaseTest{
    @Test
    public void checkSuccessRegister(){
        TodoLyRegister.as(webDriver,"Kevin Lopez","kevinick.inck@gmail.com","kevin123456");
        Assert.assertTrue(IsLogOut.visible(webDriver));
    }
}
