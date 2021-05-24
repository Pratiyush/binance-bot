package de.binance.bot.model.marketdata;

import lombok.Data;

@Data
public class BookTicker {
    private String symbol;
    private String bidPrice;
    private String bidQty;
    private String  askPrice;
    private String  askQty;
}
