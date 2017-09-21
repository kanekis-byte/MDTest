package com.datayes.materialdesigndemo;

import android.content.Intent;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private BottomSheetDialog mSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button3).setOnClickListener(this);
    }

    public void jumpLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
        /*if (mSheetDialog == null) {
            mSheetDialog = new BottomSheetDialog(this);
            mSheetDialog.setContentView(R.layout.dialog_share_layout);
        }

        if (!mSheetDialog.isShowing())
            mSheetDialog.show();*/

    }

    public void jumpBottomSheet(View view) {
        startActivity(new Intent(this, BottomSheetActivity.class));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                startActivity(new Intent(this, NavigationActivity.class));
                break;
        }
    }
}
