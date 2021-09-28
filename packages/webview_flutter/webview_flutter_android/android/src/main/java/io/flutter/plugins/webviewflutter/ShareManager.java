package io.flutter.plugins.webviewflutter;

import android.util.Log;
import android.webkit.JavascriptInterface;

public class ShareManager {
    private static final String TAG = "ShareManager";

    public ShareManager() {
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    public void share() {
        Log.i(TAG, ">>>>>>>> Shared Invoked!!!!!");
    }
}