package com.datayes.materialdesigndemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * BottomSheetBehavior测试
 * Created by hongfei.tao on 2017/9/18.
 */
public class BottomSheetActivity extends AppCompatActivity implements View.OnClickListener {

    private BottomSheetBehavior<View> mBehavior;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);
        findViewById(R.id.tv_bottomSheetLayout).setOnClickListener(this);

        View bottomSheet = findViewById(R.id.rl_bottom_sheet_layout);
        mBehavior = BottomSheetBehavior.from(bottomSheet);
        mBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

        mBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                switch (newState) {
                    case BottomSheetBehavior.STATE_COLLAPSED:
                        Log.i("BottomSheetActivity", "折叠了，停止网络的刷新");
                        break;
                    case BottomSheetBehavior.STATE_EXPANDED:
                        Log.i("BottomSheetActivity", "展开，启动网络请求");
                        break;
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                Log.i("SlideOffset", String.valueOf(slideOffset));
            }
        });
    }

    public void showBottomSheet(View view) {

        if (mBehavior.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
            mBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        } else {
            mBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        }

    }

    @Override
    public void onClick(View view) {
        showBottomSheet(view);
    }
}
