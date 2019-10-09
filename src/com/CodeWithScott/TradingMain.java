package com.CodeWithScott;


public class TradingMain implements Market {

//    private final TradeDAL tradeDAL = new TradeDAL(new JdbcTemplate());
    Market market;


    @Override
    public void bookTrade(Asset asset) {
        System.out.println(asset + "bookTrade");
    }

    protected void saveTradeDetails(){
//        some code
    }


}
