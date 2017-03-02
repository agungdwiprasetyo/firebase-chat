package com.example.agung.alimanchat;

import com.firebase.client.Firebase;

/**
 * Created by agung on 02/03/17.
 */

public class ChatApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
