package com.github.chagall.notificationlistenerexample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by atlas_huang on 2017/10/31.
 */

public class BlockingDialog extends Activity {

    public static final String TAG = BlockingDialog.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocking_dialog);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: intent=" + intent);

        String title = intent.getStringExtra("title");
        String text = intent.getStringExtra("text");

        Log.d(TAG, "onNewIntent: intent=" + intent.getExtras());
        Log.d(TAG, "onNewIntent: title=" + title);
        Log.d(TAG, "onNewIntent: text=" + text);

//        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle(title);
        alertDialog.setMessage(text);
        alertDialog.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialog.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
//        alertDialog.setIcon(R.drawable.line_logo);
//        alertDialog.show();

        final AlertDialog ad = alertDialog.create();
        ad.show();

    }
}
