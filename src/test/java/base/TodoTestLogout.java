package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.TodoLogout;
import task.tasking.TodoLyLogin;
import task.validations.IsLogOut;
import task.validations.IsLogin;

public class TodoTestLogout extends BaseTest{
    @Test
    public void checkSuccessLogOut(){
        TodoLogout.as(webDriver,"kevin.inck@gmail.com","kevin123456");
        Assert.assertTrue(IsLogin.visible(webDriver));
    }
}
