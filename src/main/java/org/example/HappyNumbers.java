package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HappyNumbers {
    boolean isHappy(int number){
        int sum = 0;
        while (sum!=1&&sum!=number){
            if(sum==0) sum=number;
            List<Integer>numbers = numberList(sum);
            sum=numbers.stream().mapToInt(n->n*n).sum();
        }
        if (sum==number){
            return false;
        }else{
            return true;
        }
    }

    List<Integer> numberList(int number){
        String numberString = String.valueOf(number);
        int numberLenght = 0;
                List<String> numberListString = new ArrayList<>();
        numberLenght = numberString.length();
        for (int i = 0;i<numberLenght;i++){
            numberListString.add(String.valueOf(numberString.charAt(i)));
        }
        List<Integer> numberInteger = numberListString.stream().map(Integer::valueOf).collect(Collectors.toList());
        return numberInteger;
    }
}
