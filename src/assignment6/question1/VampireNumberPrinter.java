package assignment6.question1;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class VampireNumberPrinter {
    static void print (ArrayList<Long>list)
    {
        for(long num:list)
        System.out.println(num);
    }
}
