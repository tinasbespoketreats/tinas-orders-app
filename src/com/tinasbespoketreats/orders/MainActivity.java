package com.tinasbespoketreats.orders;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/** Opens Tina's private order book in the phone's browser, where she is signed in to Claude. */
public class MainActivity extends Activity {
    private static final String ORDER_BOOK = "https://claude.ai/artifact/WFiFovodCV4RL26TAhZRGq";

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(ORDER_BOOK)));
        finish();
    }
}
