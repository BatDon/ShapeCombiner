package com.test.table.MySQLAndroidCaching;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;

public abstract class CallbackWithRetry<ClientList> implements Callback<ClientList> {

    private static final int TOTAL_RETRIES = 5;
    private static final String TAG = CallbackWithRetry.class.getSimpleName();
    private final Call<ClientList> call;
    private int retryCount = 0;

    public CallbackWithRetry(Call<ClientList> call) {
        this.call = call;
    }

    //@Override
    public void onFailure(Throwable t) {
        Log.e(TAG, t.getLocalizedMessage());
        if (retryCount++ < TOTAL_RETRIES) {
            Log.v(TAG, "Retrying... (" + retryCount + " out of " + TOTAL_RETRIES + ")");
            retry();
        }
    }

    private void retry() {
        call.clone().enqueue(this);
    }
}