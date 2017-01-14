package com.example.freezing.myfirstapp.service;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.telecom.Call;
import android.telecom.InCallService;
import android.util.Log;

@RequiresApi(api = Build.VERSION_CODES.N)
public class MyService extends InCallService {


    @Override
    public void onCallAdded(Call call) {
        super.onCallAdded(call);
        Log.d("onCallAdded", "Disconnecting call: " + call.toString());
        call.disconnect();
    }
}
