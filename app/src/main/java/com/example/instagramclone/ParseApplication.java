package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("NkhFBhxTtXnwM54KzrQWcgonfK9SVH7j4u5bTmCr")
                .clientKey("ZaUUf7Dj2txS6R5LbGzdwXr9otT2oPogKgGfigmp")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
