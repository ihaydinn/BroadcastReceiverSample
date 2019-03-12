package com.ismailhakkiaydin.broadcastreceiversample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

    }

    public void sendBroadcastMessage(View view){

        //Intent intent = new Intent(this, MyFirstReceiver.class);
        Intent intent = new Intent("my.custom.action.name");
        sendBroadcast(intent);

    }

    public static class MySecondReceiver extends BroadcastReceiver {
        private static final String TAG = MyFirstReceiver.class.getSimpleName();

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "İnner Receiver ", Toast.LENGTH_LONG).show();

        }
    }


    public void sendBroadcastInnerClass(View view){

        //Intent intent = new Intent(this,MySecondReceiver.class);
        Intent intent = new Intent("my.custom.anotheraction.name");
        sendBroadcast(intent);
    }

}
