package assignment6.question1;

public class FactorValidation {
    static boolean validFactors(long num,long factor1,long factor2)

    {
        if (Long.toString(factor1).endsWith("0") && Long.toString(factor2).endsWith("0"))
            return false;

        // check no of digits
        long totalDigits = VampireNumberFinder.numLength(num);
        if (VampireNumberFinder.numLength(factor1) != totalDigits / 2 ||
                VampireNumberFinder.numLength(factor2) != totalDigits / 2)
            return false;

        // check the digits
        return DigitValidation.checkIfDigitsAreSame(num, factor1, factor2);
    }
}