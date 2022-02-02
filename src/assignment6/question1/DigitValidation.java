package assignment6.question1;

import java.util.Arrays;

public class DigitValidation {

    static boolean checkIfEvendigits(long i)
    {
        if(Long.toString(i).length()%2==0)
            return true;
        else return false;
    }
    static boolean checkIfDigitsAreSame(long number,long factor1,long factor2)
    {
        if(Long.toString(number).length()==(Long.toString(factor1).length()+Long.toString(factor2).length()))
        {
            byte[] origBytes = Long.toString(number).getBytes();
            byte[] factBytes = (Long.toString(factor1) + Long.toString(factor2)).getBytes();
            Arrays.sort(origBytes);
            Arrays.sort(factBytes);
            return Arrays.equals(origBytes, factBytes);
        }
        return false;
    }

}
