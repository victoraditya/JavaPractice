package BitManipulation;

public class IsPowerofTwo {

    public static void main(String[] args) {
        Integer i = 4;
        boolean powerOfTwo = isPowerOfTwo(i);
        System.out.println(powerOfTwo);
    }

    private static boolean isPowerOfTwo(int number) {
     //   return ((number & (number -1)) == 0);
        return ((number & (number -1)) == 0);
     //   return (i & ((i & (i-1))==0));
    }
}
