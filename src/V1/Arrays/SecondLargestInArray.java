package V1.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestInArray {


    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(5,2,14,8,1,3,9);
        //findSecondLargestSort(lists);
      //  findSecondLargest(lists);
        sort(1,10,2);
    }

    private static void sort(int i, int i1, int i2) {
        List<String> array = new ArrayList<>();
      // array  = Arrays.sort(10,1,2));
        Arrays.asList(i,i1,i2).stream().sorted().forEach(q -> System.out.println(q));

    }

    private static void findSecondLargestSort(List<Integer> lists) {
        List<Integer> collect = lists.stream().sorted((o1,o2) -> o2-o1).collect(Collectors.toList());
        System.out.println(collect.get(1));
    }

    private static void findSecondLargest(List<Integer> lists) {
        int max=0;int second=0;
        for (int a: lists) {

            if(a>max){
                second=max;
                max=a;
            }else if(a>second && a!=max){
                second = a;
            }

            System.out.println(second);
        }


    }
}
