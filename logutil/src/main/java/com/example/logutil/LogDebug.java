package com.example.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "DEBUG";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
