package assignment6.question3;

public class Main {
    public static void main(String agrs[])
    {
        Demo referenceArray[]=new Demo[3];//nothing will be printed as it is just creating array of reference
        referenceArray[0]=new Demo("aman"); //object instantiation and added to
                                                  // reference array and will print string
        referenceArray[1]=new Demo("abc");
        referenceArray[2]=new Demo("xyz");

    }
}
