package de.binance.bot.model.marketdata;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import de.binance.bot.model.common.StringToBigDecimalConverter;
import lombok.Data;

/**
 * Response:
 * [
 *   [
 *     1499040000000,      // Open time
 *     "0.01634790",       // Open
 *     "0.80000000",       // High
 *     "0.01575800",       // Low
 *     "0.01577100",       // Close
 *     "148976.11427815",  // Volume
 *     1499644799999,      // Close time
 *     "2434.19055334",    // Quote asset volume
 *     308,                // Number of trades
 *     "1756.87402397",    // Taker buy base asset volume
 *     "28.46694368",      // Taker buy quote asset volume
 *     "17928899.62484339" // Ignore.
 *   ]
 * ]
 */
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder()
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CandleStick {

    private Long openTime;

    @JsonSerialize(using = StringToBigDecimalConverter.class)
    private String open;

    @JsonSerialize(using = StringToBigDecimalConverter.class)
    private String high;

    @JsonSerialize(using = StringToBigDecimalConverter.class)
    private String low;

    @JsonSerialize(using = StringToBigDecimalConverter.class)
    private String close;

    @JsonSerialize(using = StringToBigDecimalConverter.class)
    private String volume;

    private Long closeTime;

    @JsonSerialize(using = StringToBigDecimalConverter.class)
    private String quoteAssetVolume;

    private Long numberOfTrades;

    @JsonSerialize(using = StringToBigDecimalConverter.class)
    private String takerBuyBaseAssetVolume;

    @JsonSerialize(using = StringToBigDecimalConverter.class)
    private String takerBuyQuoteAssetVolume;
}
