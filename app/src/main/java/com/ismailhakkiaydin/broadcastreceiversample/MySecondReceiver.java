package com.ismailhakkiaydin.broadcastreceiversample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MySecondReceiver extends BroadcastReceiver {

    private static final String TAG = MySecondReceiver.class.getSimpleName();


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "İkinci Receiver ", Toast.LENGTH_LONG).show();
    }
}
