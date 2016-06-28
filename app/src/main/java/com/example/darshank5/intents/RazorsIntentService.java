package com.example.darshank5.intents;
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class RazorsIntentService extends IntentService{

    private static final String TAG="com.example.darshank5.intents";
    public RazorsIntentService() {
        super("RazorsIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //This is what the service does
        Log.i(TAG,"The Service has Now Started ");
    }
}
