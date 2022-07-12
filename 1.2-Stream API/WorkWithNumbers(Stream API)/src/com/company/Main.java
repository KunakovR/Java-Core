package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intArrayList = new ArrayList<>();

        for (Integer result : intList){
            if (result > 0){
                if (result%2 == 0){
                    intArrayList.add(result);
                }
            }
        }
        for (int i = 0; i < intArrayList.size()-1; i++){
            for (int j = 0; j < intArrayList.size()-i-1; j++){
                if (intArrayList.get(j) > intArrayList.get(j+1)){
                    int temp = intArrayList.get(j);
                    intArrayList.set(j, intArrayList.get(j+1));
                    intArrayList.set(j+1, temp);
                }
            }
        }
        for (Integer list : intArrayList){
            System.out.print(list + " ");
        }



    }
}
