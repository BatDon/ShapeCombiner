package com.test.table.shapecombiner;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.res.ResourcesCompat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


//implements NavigationView.OnNavigationItemSelectedListener
public class MainActivity extends AppCompatActivity
         {

    //new
    private LinearLayout shapeButton;
    public LinearLayout circleButton;
    public LinearLayout rectangleButton;
    int toolbarValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context=this;
        new ShapeButtons();

//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        int height = displayMetrics.heightPixels;
//        int width = displayMetrics.widthPixels;



        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
//        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
//        Display d = wm.getDefaultDisplay();
//        int height = d.getHeight();
//        int width = d.getWidth();
////        Display display = getWindowManager().getDefaultDisplay();
//        new ScreenSize().layoutScreen(height,width);


        Log.d("-1", "Looking for error");

        circleButton = (LinearLayout) findViewById(R.id.circleClick);
        rectangleButton = (LinearLayout) findViewById(R.id.rectangleClick);

        circleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickNavigation(v);
            }
        });

        rectangleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickNavigation(v);
            }
        });


//        setContentView(R.layout.menu_gridview);
////        GridLayout gridLayout = (GridLayout)findViewById(R.id.menu_gridview);
//        ImageButton imagebutton = (ImageButton) findViewById(R.id.button1);
////        LinearLayout.LayoutParams params = new LinearLayout
////                .LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
//
//        // Add image path for imagebutton from drawable folder.
//        Resources res = getResources();
//        Log.d("0","Looking for error");
//        TypedArray circle = res.obtainTypedArray(R.array.circle);
//        Log.d("1","Looking for error");
//        Drawable circle = circle.getDrawable(0);
//        Log.d("2","Looking for error");
//        circle.recycle();
//        Log.d("3","Looking for error");
//        imagebutton.setImageDrawable(circle);
//        Log.d("4","Looking for error");
//
//
//        setContentView(R.layout.activity_main);
//        imagebutton.setLayoutParams(params);
//        relativelayout.addView(imagebutton);

        //recycle image array afterwards

//        imagebutton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(MainActivity.this, "Clicked on image button", Toast.LENGTH_LONG).show();
//
//            }
//        });

//        Resources res = getResources();
//        TypedArray icons = res.obtainTypedArray(R.array.icons);
//        Drawable drawable = icons.getDrawable(0);


//        btn.setBackgroundResource(R.drawable.new_todo_image);


//        Log.d("5", "Looking for error");
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        Log.d("6", "Looking for error");
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        Log.d("7", "Looking for error");

//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
//        Log.d("8", "Looking for error");
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        //THIS WAS ADDED BY ME NOT ORIGINAL
//        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
//        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == 0) {
            toolbarValue=5;
            return true;
        }if (id == 1) {
            toolbarValue=6;
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //Need to set up this action bar
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }


    //added this figures out which button was clicked and chooses the action



    public boolean ClickNavigation(View view) {

        switch (view.getId()) {
            case R.id.circleClick:
                Log.d("ok", "CircleClick");
                int i=1;
                break;
            case R.id.rectangleClick:
                Log.d("ok", "rectangleClick");
                int j=2;
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
