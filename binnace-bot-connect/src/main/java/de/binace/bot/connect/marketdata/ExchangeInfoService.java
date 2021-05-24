package de.binace.bot.connect.marketdata;

import de.binance.bot.model.marketdata.ServerTime;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * This service is used to connect Binance Spot APIs.
 *
 * All endpoints return either a JSON object or array.
 * Data is returned in ascending order. Oldest first, newest last.
 * All time and timestamp related fields are in milliseconds.
 */
public interface ExchangeInfoService {

    /**
     * Current exchange trading rules and symbol information.
     */
    @GET("/api/v3/exchangeInfo")
    Call<ServerTime> create();

}
