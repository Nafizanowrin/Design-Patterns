class Faculty
{
    public String name;
    int age;
    protected String email;
    

    public void displayinfo()
    {
        System.out.println("Name =" +name);
        System.out.println("Age =" +age);
    }
}

class Teacher extends Faculty
{
    private String password;

    public void displayinfo()
    {
        System.out.println("Name =" +name);
        System.out.println("Age =" +age);
        System.out.println("Email =" +email);
        
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String pass)
    {
        this.password = pass;
    }

}

public class Code{
public static void main(String[] args) {

    Teacher t1 = new Teacher();
    t1.name = "Nazia Nishat";
    t1.age = 26;
    t1.email  = "nazia@metrouni.edu.bd";
    t1.setPassword("007");
    System.out.println("Password="+t1.getPassword());

    t1.displayinfo();

}   

}

//Output:
//      Password=007
//      Name=Nazia Nishat
//      Age=26
//      Email=nazia@metrouni.edu.bd
