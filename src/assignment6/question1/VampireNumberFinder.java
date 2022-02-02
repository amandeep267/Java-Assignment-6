package assignment6.question1;

import java.util.ArrayList;

public class VampireNumberFinder {
    static void findVampireNumber(int totalCountofVampireNumebr)
    {
        ArrayList<Long>vampireNumberList=new ArrayList<>();

        for(long i=10;vampireNumberList.size()<totalCountofVampireNumebr;i++)
        {
          if( DigitValidation.checkIfEvendigits(i)==false)
          {
              i=i*10-1;
              continue;
          }
          long numLength=VampireNumberFinder.numLength(i);
         for(long factor1=(long)Math.pow(10,(numLength/2)-1);factor1<=(long)Math.pow(10,numLength/2);factor1++)
         {
             if(i%factor1==0)
             {
                 long factor2=i/factor1;
                 if(FactorValidation.validFactors(i,factor1,factor2) && factor1 <= factor2){
                     vampireNumberList.add(i);

             }
         }

        }

    }
        VampireNumberPrinter.print(vampireNumberList);
    }

     static long numLength(long num) {
        return Long.toString(num).length();
    }
    }
