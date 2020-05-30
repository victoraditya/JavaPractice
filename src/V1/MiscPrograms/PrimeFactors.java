package V1.MiscPrograms;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static void main(String[] args) {
        Integer i = 64;
        primeFactors(i);
    }

    private static void primeFactors(Integer i) {
        int n;
        while (i % 2 == 0) {

            System.out.println(2 + "");
            i = i / 2;

        }
        for (int x = 3; x <= Math.sqrt(i); x = x + 2) {
            while ((i % x == 0)) {
                System.out.println(x);
                i /= x;

            }
        }

        if(i>2){
            System.out.println(i);
        }
    }
}
