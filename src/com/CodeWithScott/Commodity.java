package com.CodeWithScott;

public class Commodity extends Asset {

    private int id;
    private double shares;
    private double purchasePrice;

    @Override
    public int getId(int id){
        return id;
    }

    @Override
    public double getShares(double shares){
        return shares;
    }

    @Override
    public void setShares(double shares){
        shares = 1.20;
    }

    @Override
    protected double calculateValue(double value){
        return value;
    }


}
