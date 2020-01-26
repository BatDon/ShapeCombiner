package com.test.table.MySQLAndroidCaching2;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.Log;

import java.io.File;

public class MyApplication extends Application {

    private static MyApplication instance;
    //public Context appContext;



        @Override
        public void onCreate() {
            super.onCreate();
            //setContext();

            if(instance == null){
                instance = new MyApplication();
                //instance.setContext();
            }
        }



        public static MyApplication getInstance(){
            if(instance==null){
                instance=new MyApplication();
            }
            return instance;
        }




//    private static Context appContext;

//    @Override
//    public void onCreate() {
//        super.onCreate();
//
//        if(instance == null){
////            instance = this;
//            instance = new MyApplication();
//        }
//    }

//        @Override
//    public void onCreate() {
//            super.onCreate();
//            if(instance==null){
//                instance=new MyApplication();
//            }
//
//        }



//    public static MyApplication getInstance(){
//
//        if(instance==null){
//            instance=new MyApplication();
//            //instance.setContext();
//            instance.setContext();
//
//
//
//        }
//        return instance;
//    }

//    public static MyApplication getInstance(){
//        return instance;
//    }

    public static boolean hasNetwork(){

        //GlobalApplication.getAppContext()isNetworkConnected();
        if (instance==null){
            getInstance();
            if(instance==null) {
                Log.i("instance", "NULLLLLLLLL");
            }
        }
        return instance.isNetworkConnected();
    }

    private boolean isNetworkConnected(){
//        private static Context appContext;
//        Context appContext = getApplicationContext();


            return true;




        //this part works but only for api 23 and higher
//        ConnectivityManager cm =
//                (ConnectivityManager) GlobalApplication.getAppContext().getSystemService(Context.CONNECTIVITY_SERVICE);
//        if(cm==null){
//            Log.i("NullPointer","Connectivity manager is null");
//        }
//
//        if (cm.getActiveNetwork()==null){
//            Log.i("NullPointer","Found In Netowrk in My Application");
//            return false;
//        }
//        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
//        return activeNetwork != null &&
//                activeNetwork.isConnectedOrConnecting();
    }

    public File getMyApplicationCacheDir(){
       File CD=getCacheDir();
       if(CD==null) {

           Log.i("CacheDir", "is Null");
       }
        return CD;

    }

//    public void setContext(){
//        //        private static Context appContext;
//        appContext = getApplicationContext();
//    }
}
