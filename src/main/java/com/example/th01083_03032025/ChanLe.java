package com.example.th01083_03032025;

public class ChanLe {
    public String chanLe(int a){
//        if (a == 0){
//            throw new IllegalArgumentException("0");
//        }
        if (a%2==0){
            return "Số chẵn";
        }else {
            return "Số lẻ";
        }
    }
}
