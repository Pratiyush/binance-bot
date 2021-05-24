package de.binace.bot.connect.marketdata;

import de.binance.bot.model.marketdata.BookTicker;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

/**
 * This service is used to connect Binance Spot APIs.
 *
 * All endpoints return either a JSON object or array.
 * Data is returned in ascending order. Oldest first, newest last.
 * All time and timestamp related fields are in milliseconds.
 */
public interface BookTicketService {

    /**
     * Best price/qty on the order book for a symbol.
     */
    @GET("/api/v3/ticker/bookTicker")
    Call<BookTicker> create(@Query("symbol") String symbol);

    /**
     * Best price/qty on the order book for 40 symbols.
     */
    @GET("/api/v3/ticker/bookTicker")
    Call<List<BookTicker>> create();

}
