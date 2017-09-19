package com.datayes.materialdesigndemo;

import android.content.Intent;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    private BottomSheetDialog mSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpLogin(View view) {
//        startActivity(new Intent(this, LoginActivity.class));
        if (mSheetDialog == null) {
            mSheetDialog = new BottomSheetDialog(this);
            mSheetDialog.setContentView(R.layout.dialog_share_layout);
        }

        if (!mSheetDialog.isShowing())
            mSheetDialog.show();

    }

    public void jumpBottomSheet(View view) {
        startActivity(new Intent(this, BottomSheetActivity.class));
    }
}
