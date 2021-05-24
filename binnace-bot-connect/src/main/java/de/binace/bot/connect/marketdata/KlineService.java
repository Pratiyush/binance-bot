package de.binace.bot.connect.marketdata;

import de.binance.bot.model.marketdata.CandleStick;
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
public interface KlineService {

    /**
     * Kline/candlestick bars for a symbol.
     * Klines are uniquely identified by their open time.
     *
     * Weight : 1
     *
     * Note : If startTime and endTime are not sent, the most recent klines are returned.
     * *************VALIDATE IF WE CAN PASS ENUM: enum: [1m,3m,5m,15m,30m,1h,2h,4h,6h,8h,12h,1d,3d,1w,1M]
     * @param symbol - String, Mandatory
     * @param interval - Enum - Mandatory
     * @param startTime - Long, Optional
     * @param endTime - Long, Optional
     * @param limit - Int, Optional, Default: 500, Max: 1000
     *
     * @return List of CandleStick
     */
    @GET("/api/v1/klines")
    Call<List<CandleStick>> create(@Query("symbol") String symbol, @Query("interval") String interval, @Query("limit") Integer limit,
                                               @Query("startTime") Long startTime, @Query("endTime") Long endTime);

    /**
     * Kline/candlestick bars for a symbol.
     * Klines are uniquely identified by their open time.
     *
     * Weight : 1
     *
     * Note : If startTime and endTime are not sent, the most recent klines are returned.
     *
     * @param symbol - String, Mandatory
     * @param interval - Enum - Mandatory
     *
     * @return List of CandleStick
     */
    @GET("/api/v1/klines")
    Call<List<CandleStick>> create(@Query("symbol") String symbol, @Query("interval") String interval);

    /**
     * Kline/candlestick bars for a symbol.
     * Klines are uniquely identified by their open time.
     *
     * Weight : 1
     *
     * Note : If startTime and endTime are not sent, the most recent klines are returned.
     *
     * @param symbol - String, Mandatory
     * @param interval - Enum - Mandatory
     * @param limit - Int, Optional, Default: 500, Max: 1000
     *
     * @return List of CandleStick
     */
    @GET("/api/v1/klines")
    Call<List<CandleStick>> create(@Query("symbol") String symbol, @Query("interval") String interval, @Query("limit") Integer limit);
}
