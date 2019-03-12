package com.ismailhakkiaydin.broadcastreceiversample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyFirstReceiver extends BroadcastReceiver {

    private static final String TAG = MyFirstReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {


        Toast.makeText(context, "Birinci Receiver ", Toast.LENGTH_LONG).show();

    }
}
