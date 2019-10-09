package com.CodeWithScott;

public class Asset {

    private int id;
    private double shares;
    private double purchasePrice;

    public int getId(int id){
        return id;
    }

    public double getShares(double shares){
        return shares;
    }

    public void setShares(double shares){
        shares = 1.20;
    }

    protected double calculateValue(double value){
        return value;
    }

}


