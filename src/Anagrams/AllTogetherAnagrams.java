package Anagrams;

import java.util.*;

public class AllTogetherAnagrams {


    public static void main(String[] args) {
        String arr[] = { "cat", "dog", "tac", "god", "act" };
        printAnagrams(arr);
    }

    private static void printAnagrams(String[] arr) {

        Map<Integer, List<String>> map = new HashMap<>();

        for (String s : arr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String newword = new String(chars);
            int hashcode = newword.hashCode();
            if(map.containsKey(hashcode)){
                List<String> words = map.get(hashcode);
                words.add(s);
                map.put(hashcode,words);
            }else{
                List<String> words = new ArrayList<>();
                words.add(s);
                map.put(hashcode,words);
            }
        }

        map.forEach((key,value) -> {System.out.println("Key"+key+"Value"+value);});






        /*Map<String,String> anagramMap = new HashMap();
        Arrays.stream(arr).forEach(str -> str.hashCode());
        anagramMap.put()*/

    }
}
