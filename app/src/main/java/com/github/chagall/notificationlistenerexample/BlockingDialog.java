package com.github.chagall.notificationlistenerexample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by atlas_huang on 2017/10/31.
 */

public class BlockingDialog extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocking_dialog);

//        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("your title");
        alertDialog.setMessage("your message");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
//        alertDialog.setIcon(R.drawable.line_logo);
        final AlertDialog ad = alertDialog.create();
        ad.show();

        alertDialog.show();

/*        final WindowManager.LayoutParams param = new WindowManager.LayoutParams();
        param.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        final View view = findViewById(R.id.my_floating_view);
        final ViewGroup parent = (ViewGroup) view.getParent();
        if (parent != null)
            parent.removeView(view);
        param.format = PixelFormat.RGBA_8888;
        param.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
        param.gravity = Gravity.TOP | Gravity.LEFT;
        param.width = parent != null ? ViewGroup.LayoutParams.WRAP_CONTENT : view.getLayoutParams().width;
        param.height = parent != null ? ViewGroup.LayoutParams.WRAP_CONTENT : view.getLayoutParams().height;
        final WindowManager wmgr = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        wmgr.addView(view, param);*/
    }

}
