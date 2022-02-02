package assignment6.question2;

public class MyClass {
    String myName;
    MyClass()
    {
     System.out.println("Constructor 1");
    }
    MyClass(String myName)
    {   this();
        this.myName=myName;
        System.out.println(myName);
    }

    public static void main(String agrs[])
    {
        MyClass object=new MyClass("Aman");

    }
}
