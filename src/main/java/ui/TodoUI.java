package ui;

import org.openqa.selenium.By;

public class TodoUI {
    public static By formSign = By.xpath("//div[@class='HPHeaderSignup']");

    //FOR NEW USER
    public static By fullname= By.id("ctl00_MainContent_SignupControl1_TextBoxFullName");
    public static By email= By.id("ctl00_MainContent_SignupControl1_TextBoxEmail");
    public static By pass= By.id("ctl00_MainContent_SignupControl1_TextBoxPassword");
    public static By check= By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms");
    public static By signup= By.id("ctl00_MainContent_SignupControl1_ButtonSignup");
    public static By logout= By.id("ctl00_HeaderTopControl1_LinkButtonLogout");

    // FOR LOGIN

    public static By formLogIn = By.xpath("//div[@class='HPHeaderLogin']");
    public static By emaillogin= By.id("ctl00_MainContent_LoginControl1_TextBoxEmail");
    public static By passwordlogin= By.id("ctl00_MainContent_LoginControl1_TextBoxPassword");
    public static By login= By.id("ctl00_MainContent_LoginControl1_ButtonLogin");

    //FOR NEW PROJECT
    public static By formAddProject = By.xpath("//td[.='Add New Project']");
    public static By newproject= By.id("NewProjNameInput");
    public static By newprojectbutton= By.id("NewProjNameButton");
    public static By titleProject= By.id("CurrentProjectTitle");

    //FOR NEW TASK
    public static By formnewtask= By.id("NewItemContentInput");
    public static By addtaskbtn= By.id("NewItemAddButton");

    public static By confirmtask = By.xpath("//div[.='Tarea completada']");

    //FOR LOGOUT
    public static By titletodo = By.xpath("//div[.='Get Organized']");

}
