package de.binace.bot.connect.marketdata;

import de.binance.bot.model.marketdata.BookTicker;
import de.binance.bot.model.marketdata.CandleStick;
import de.binance.bot.model.marketdata.ServerTime;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.List;

public class Connect {

    /*
     * The base endpoint is: https://api.binance.com
     *
     * If there are performance issues with the endpoint above, these API clusters are also available:
     *  1.  https://api1.binance.com
     *  2.  https://api2.binance.com
     *  3.  https://api3.binance.com
     */
    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.binance.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        serverTime(retrofit);
        //bookTicker(retrofit);
        candleStick(retrofit);
    }

    public static void serverTime(Retrofit retrofit) throws IOException {
        ServerTimeService service = retrofit.create(ServerTimeService.class);
        Call<ServerTime> serverTime = service.create();
        Response<ServerTime> response = serverTime.execute();
        System.out.println(response.body());
        System.out.println(service.create().execute().body());
    }

    public static void bookTicker(Retrofit retrofit) throws IOException {
        BookTicketService service = retrofit.create(BookTicketService.class);
        Call<List<BookTicker>> serverTime = service.create();
        Response<List<BookTicker>> response = serverTime.execute();
        System.out.println(response.body());
    }

    public static void candleStick(Retrofit retrofit) throws IOException {
        KlineService service = retrofit.create(KlineService.class);
        Call<List<CandleStick>> candleStick = service.create("SHIBEUR","1h");
        Response<List<CandleStick>> response = candleStick.execute();
        System.out.println(response.body());
    }
}
