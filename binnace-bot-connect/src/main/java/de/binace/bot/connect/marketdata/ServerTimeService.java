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
public interface ServerTimeService {

    /**
     * Test connectivity to the Rest API and get the current server time.
     */
    @GET("/api/v3/time")
    Call<ServerTime> create();

}
