package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.TodoLyLogin;
import task.tasking.TodoLyRegister;
import task.validations.IsLogOut;

public class TodoTestLogin extends BaseTest{
    @Test
    public void checkSuccessLogin(){
        TodoLyLogin.as(webDriver,"kevin.inck@gmail.com","kevin123456");
        Assert.assertTrue(IsLogOut.visible(webDriver));
    }
}
