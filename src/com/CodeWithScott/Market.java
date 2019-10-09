package com.CodeWithScott;

public interface Market {

    public static void bookTrade(Asset asset){
        System.out.println("bookTrade: "  + asset);
    }

}
