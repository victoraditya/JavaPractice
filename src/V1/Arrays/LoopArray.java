package V1.Arrays;

public class LoopArray {

    public static void main(String[] args) {
       Integer[] array1 = {2,4,3,1,0};
       //  Integer[] array1 = {2,4,3,1,5,0};
       // Integer[] array1 = {1,3,2};
        countLength(array1,2);
    }

    int[] result;
    public static void countLength(Integer[] array1,int n){
       /* boolean contains = IntStream.of(array1).anyMatch(x -> x == n);*/

        int count=0;
        for(Integer i=(n+1);i<array1.length;i=(i+1)%array1.length){

            System.out.println("array[i]"+array1[i]);
            if(array1[i]==n){
                System.out.println("Loop");
                System.out.println("Count: "+(count+1));
                return;
            }
            count++;
        }
        System.out.println("No loop");
    }
}
