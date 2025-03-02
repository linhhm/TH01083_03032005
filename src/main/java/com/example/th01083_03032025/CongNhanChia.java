package com.example.th01083_03032025;

public class CongNhanChia {
    public int cong(int a, int b){
    return a+b;
    }
    public double chia(int a, int b){
        if(b ==0){
            throw new ArithmeticException("Không thể chia cho 0");
        }
    return (double) a/b;
    }
}
