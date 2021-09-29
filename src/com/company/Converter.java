package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Converter {
    public String convert(String str){
                List<Integer> arrayList = new ArrayList<Integer>();

                String[] allInputs = str.split(",");
                for (int i=0; i<allInputs.length;i++) {
                    if (allInputs[i].chars().allMatch(Character::isDigit) && !allInputs[i].equals(""))
                        arrayList.add(Integer.parseInt(allInputs[i]));
                }
                Integer[] acceptedInputs = new Integer[0];
                acceptedInputs = arrayList.toArray(acceptedInputs);
                int result = sumOfArrayElements(acceptedInputs);

        String returnValue = format(allInputs,acceptedInputs,result);

        return returnValue;    }

    private int sumOfArrayElements(Integer[] arr) {
        int sum =0;
        for( int num : arr) {
            sum = sum+num;
        } return sum;
    }

    private String format(String[] allInputs, Integer[] acceptedInputs, int result){
        String str = "{\n    \"result\": "+result+",\n    \"acceptedInputs\": "+Arrays.toString(acceptedInputs)+
                ",\n    \"allInputs\": "+ Arrays.toString(allInputs)+"\n}";
        return str;
    }
}

