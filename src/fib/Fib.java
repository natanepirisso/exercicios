package fib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Fib {
    public static int fibFunction(int n){
        if(n <= 1){
            return n;
        }
        return fibFunction(n-1) + fibFunction(n-2); 
    }
    public static void getFibfunction(){
        for(int i = 0; i < 10; i++){
            System.out.println(fibFunction(i));
        }
    }
}
/*
i = 0 | i = 0
i = 1 | n = 1
i = 2 | n = 1
*/