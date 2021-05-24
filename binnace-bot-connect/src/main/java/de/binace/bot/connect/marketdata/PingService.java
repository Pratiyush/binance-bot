package de.binace.bot.connect.marketdata;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * This service is used to connect Binance Spot APIs.
 *
 * All endpoints return either a JSON object or array.
 * Data is returned in ascending order. Oldest first, newest last.
 * All time and timestamp related fields are in milliseconds.
 */
public interface PingService {

    /**
     * Test connectivity to rest API
     */
    @GET("/api/v3/ping")
    Call<Void> create();

}
