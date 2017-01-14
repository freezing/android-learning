package com.example.freezing.myfirstapp.receiver;

import android.content.Context;
import android.telecom.InCallService;
import android.telephony.TelephonyManager;
import android.util.Log;

import java.util.Date;

public class CallReceiver extends PhonecallReceiver {

    @Override
    protected void onIncomingCallReceived(Context ctx, String number, Date start) {
        String text = String.format("Incoming call: %s on %s", number, start);
        Log.d("incoming", text);


    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start)
    {
        //
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end)
    {
        //
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start)
    {
        //
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end)
    {
        //
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start)
    {
        //
    }

}