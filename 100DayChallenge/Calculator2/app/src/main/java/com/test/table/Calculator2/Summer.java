package com.test.table.Calculator2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
//import com.test.table.Calculator2.com.test.table.Calculator2.MyCustomEvent;

public class Summer extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="EQUALS_MESSAGE";
    String message="equals yes";
    String message2="equals no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Intent intent = new Intent(this, MainActivity.class);
//        intent.putExtra(EXTRA_MESSAGE, message2);
//        startActivity(intent);
    }



    public float sum(String operation, float firstNumber, float secondNumber) {

        float sumOfOperation = 0;
        boolean equalsPushed=false;

//        Intent intent = new Intent(this, MainActivity.class);
//        intent.putExtra(EXTRA_MESSAGE, message2);
//        startActivity(intent);

        switch (operation) {
            case "add":
                sumOfOperation = firstNumber + secondNumber;
                break;
            case "minus":
                sumOfOperation = firstNumber - secondNumber;
                break;
            case "times":
                sumOfOperation = firstNumber * secondNumber;
                break;
            case "divide":
                sumOfOperation=(firstNumber/(float)secondNumber);
                break;
            case "equals":
                //EventBus.getDefault().post(new MyCustomEvent("Custom event data"));
//                Intent intent2 = new Intent(this, MainActivity.class);
//                intent2.putExtra(EXTRA_MESSAGE, message);
//                startActivity(intent);


                System.out.println("equals");
//                Intent intent = new Intent(this, MainActivity.class);
//                intent.putExtra(EXTRA_MESSAGE, message2);
//                startActivity(intent);
                equalsPushed=true;
//                MainActivity.operation="";

                break;
            default:
                System.out.println("error operation= "+operation);

        }
        return sumOfOperation;
    }
}
