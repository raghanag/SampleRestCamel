package com.example.demo;

public class BalancedSubstringProcessor {
    public static int countBalancedSubstrings(String s){
        int count = 0;
        int mCount = 0;
        int pCount = 0;
        if(!s.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("String contains non-alphabetic characters.");
        }
        for (char c: s.toCharArray()){
            if(c == 'M'){
                mCount++;
            } else if (c == 'P') {
                pCount++;
            }
            if (mCount == pCount){
                count++;
            }

        }
        return count;
    }
}
