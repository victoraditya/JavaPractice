package V1.BitManipulation;

public class EvenOdd {

    public static void main(String[] args) {
        Integer x = 25;
        isEvenOrOdd(x);
    }

    /*testing PR */
    private static void isEvenOrOdd(Integer x) {

         if((1 & x) == 0)
         System.out.println("Even");
         else
             System.out.println("Odd");
    }
}
