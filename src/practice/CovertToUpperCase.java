package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CovertToUpperCase {

    public static void main(String[] args){

        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<String> upperCaseWords = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperCaseWords);
    }
}
