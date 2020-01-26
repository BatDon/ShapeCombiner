package com.test.table.roomsqlite;

import android.arch.persistence.room.Room;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.test.table.roomsqlite.dao.ItemDAO;
import com.test.table.roomsqlite.models.Item;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String DATABASE_NAME = "mydb";
    private Item movieDatabase;
    private AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        AppDatabase database = Room.databaseBuilder(this, AppDatabase.class, "mydb")
//                .allowMainThreadQueries()
//                .build();



        AppDatabase database = Room.databaseBuilder(this, AppDatabase.class, "mydb")
                .allowMainThreadQueries()
                .build();


        //database = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, DATABASE_NAME).build();


        ItemDAO itemDAO = database.getItemDAO();
        Item item = new Item();
        item.setName("Item001");
        item.setDescription("Item 001");
        item.setQuantity(Long.valueOf(1000));

        itemDAO.insert(item);
        List<Item> items = itemDAO.getItems();
        //Toast.makeText(this, "" + items, Toast.LENGTH_SHORT).show();
        //System.out.println(items);
    }
}
        //threadExample();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //Item item =new Item();
//
//                ItemDAO itemDAO = database.getItemDAO();
//                Item item = new Item();
//                item.setName("Item001");
//                item.setDescription("Item 001");
//                item.setQuantity(Long.valueOf(1000));
//
//                itemDAO.insert(item);
//                List<Item> items = itemDAO.getItems();
//                System.out.println(items);
//            }
//        }).start();
   // }


//    public void threadExample() {
//        Thread r = new Thread(new DownloadRunnable(database));
//        r.start();
//    }
//
//    public class DownloadRunnable implements Runnable {
//        private AppDatabase database;
//
//        public DownloadRunnable(AppDatabase database) {
//            this.database = database;
//
//        }
//
//        @Override
//        public void run() {
//            ItemDAO itemDAO = database.getItemDAO();
//            Item item = new Item();
//            item.setName("Item001");
//            item.setDescription("Item 001");
//            item.setQuantity(Long.valueOf(1000));
//
//            itemDAO.insert(item);
//            List<Item> items = itemDAO.getItems();
////            System.out.println(items);
//            //downloadUrl = url;
//            updateUI(items);
//
//        }
//    }
//    public void updateUI(final List<Item> items){
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                Toast.makeText(MainActivity.this, ""+items, Toast.LENGTH_SHORT).show();
//                //messageTextView.setText(msg);
//            }
//        });
//    }
//}
//    public void downloadFile(){
//        try{
//
//            OkHttpClient client = new OkHttpClient();
//            Request request = new Request.Builder().url(downloadUrl)
//                    .addHeader("Content-Type", "application/text")
//                    .build();
//            Response response = client.newCall(request).execute();
//            InputStream in = response.body().byteStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//            String result, line = reader.readLine();
//            result = line;
//            while((line = reader.readLine()) != null) {
//                result += line;
//            }
//            Log.d("Thread : ", result);
//            response.body().close();
//        }catch (Exception e){ Log.d("exception : ", e);}
//    }
//}
//}

//            item.setName("Item001");
//            item.setDescription("Item 001");
//            item.setQuantity(Long.valueOf(1000));
//            database.getItemDAO();

        //item.setMovieId( “2”); movie.setMovieName(“The Prestige”); movieDatabase.daoAccess () . insertOnlySingleMovie (movie); } }) .start();




//        AppDatabase database = Room.databaseBuilder(this, AppDatabase.class, "mydb")
//                .allowMainThreadQueries()
//                .build();
//
//        ItemDAO itemDAO = database.getItemDAO();


//        new Thread(new Runnable() { @Override public void run() {
//
//            if(Looper.myLooper() == Looper.getMainLooper()){
//                Toast.makeText(MainActivity.this, "main thread", Toast.LENGTH_SHORT).show();
//            }
//            else{
//                Toast.makeText(MainActivity.this, "NOT main thread", Toast.LENGTH_SHORT).show();
//            }
//
//
//
////            ItemDAO itemDAO = database.getItemDAO();
////            Item item = new Item();
////            item.setName("Item001");
////            item.setDescription("Item 001");
////            item.setQuantity(Long.valueOf(1000));
////
////            itemDAO.insert(item);
////            List<Item> items = itemDAO.getItems();
////            System.out.println(items);
//
//
//
////            Item movie =new Item();
////            item.setMovieId( “2”);
////            movie.setMovieName(“The Prestige”);
////            movieDatabase.daoAccess () . insertOnlySingleMovie (movie); } }) .start();
//
//            } }) .start();


//        AppDatabase database = Room.databaseBuilder(this, AppDatabase.class, "mydb")
//                .allowMainThreadQueries()
//                .build();

//        AppDatabase database = Room.databaseBuilder(this, AppDatabase.class, "mydb")
//                .allowMainThreadQueries()
//                .build();


//        ItemDAO itemDAO = database.getItemDAO();
//        Item item = new Item();
//        item.setName("Item001");
//        item.setDescription("Item 001");
//        item.setQuantity(Long.valueOf(1000));
//
//        itemDAO.insert(item);
//        List<Item> items = itemDAO.getItems();
//        System.out.println(items);
//
//
//        Runnable r = new MyRunnable(database);
//        new Thread(r).start();
//    }
//
//    public class MyRunnable implements Runnable {
//
//        public MyRunnable(Object itemDAO) {
//            // store parameter for later user
//
//            //ItemDAO itemDAO = database.getItemDAO();
//            Item item = new Item();
//            item.setName("Item001");
//            item.setDescription("Item 001");
//            item.setQuantity(Long.valueOf(1000));
//
//            itemDAO.insert(item);
//            List<Item> items = itemDAO.getItems();
//            System.out.println(items);
//
//
//        }
//
//        public void run() {
//        }



