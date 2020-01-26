package com.test.table.MySQLAndroidCaching;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;

public class InternetConnection{
    Context context = GlobalApplication.getAppContext();



    public boolean isConnectingToInternet(){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService( Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    //    NEW
    public  Cache provideCache () {
        Cache cache = null;
        try {
            cache = new Cache( new File(context.getCacheDir(), "http-cache" ),
                    10 * 1024 * 1024 ); // 10 MB
        }
        catch (Exception e) {
            Log.e( "Error", e.toString() );
        }
        return cache;
    }

    public Interceptor provideCacheInterceptor(){
        return new Interceptor() {
            @Override
            public okhttp3.Response intercept (Chain chain) throws IOException {
                okhttp3.Response response = chain.proceed( chain.request() );
                // re-write response header to force use of cache
                CacheControl cacheControl;

                if (isConnectingToInternet()) {
                    cacheControl = new CacheControl.Builder()
                            .maxAge(0, TimeUnit.SECONDS)
                            .build();
                }
                else {
                    cacheControl = new CacheControl.Builder()
                            .maxStale(7, TimeUnit.DAYS)
                            .build();
                }
                return response.newBuilder()
                        .removeHeader("Pragma")
                        .removeHeader("Cache-Control")
                        .header("Cache-Control", cacheControl.toString())
                        .build();
            }
        };
    }

    public Interceptor provideOfflineCacheInterceptor () {
        return new Interceptor() {
            @Override
            public okhttp3.Response intercept (Chain chain) throws IOException {
                Request request = chain.request();
                if (!isConnectingToInternet()) {
                    CacheControl cacheControl = new CacheControl.Builder()
                            .maxStale(7, TimeUnit.DAYS)
                            .build();

                    request = request.newBuilder()
                            .removeHeader("Pragma")
                            .removeHeader("Cache-Control")
                            .cacheControl(cacheControl)
                            .build();
                }

                return chain.proceed(request);
            }
        };
    }









}
