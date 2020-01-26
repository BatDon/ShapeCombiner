package com.test.table.MySQLAndroidCaching;

//import com.test.table.mysqlandroid.APIService;

import retrofit2.Retrofit;
//import retrofit2.Retrofit.http.GET;
//import retrofit2.Retrofit.Call;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Abhi on 06 Sep 2017 006.
 */

public class RetroClient {

    /********
     * URLS
     *******/
    private static final String ROOT_URL = "https://mysqlandroidwebsite.000webhostapp.com";

    /**
     * Get Retrofit Instance
     */
//    OkHttpClient client = new OkHttpClient();
//    // client.interceptors().add(new LoggingInterceptor());
//    new Retrofit.Builder()
//            .baseUrl(QuoteOfTheDayConstants.BASE_URL)
//                .addConverterFactory(JacksonConverterFactory.create())
//            .client(client)
//                .build();

    private static Retrofit getRetrofitInstance() {
    //OkHttpClient client = new OkHttpClient();
    //client.interceptors().add(new LoggingInterceptor());

        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                //.client(client)
                .build();
    }

    /**
     * Get API Service
     *
     * @return API Service
     */


    public static ApiService getApiService() {
        return getRetrofitInstance().create(ApiService.class);
    }
}

