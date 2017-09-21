package com.datayes.materialdesigndemo;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.datayes.materialdesigndemo.fragments.HomeFragment;
import com.datayes.materialdesigndemo.fragments.MallFragment;
import com.datayes.materialdesigndemo.fragments.PersonFragment;
import com.datayes.materialdesigndemo.fragments.SettingsFragment;
import com.datayes.materialdesigndemo.fragments.VideoFragment;

public class NavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private HomeFragment mHomeFragment;
    private MallFragment mMallFragment;
    private PersonFragment mPersonFragment;
    private VideoFragment mVideoFragment;
    private SettingsFragment mSettingsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        BottomNavigationView mNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        mNavigationView.setOnNavigationItemSelectedListener(this);

        initFragments();
    }

    private void initFragments() {
        mHomeFragment = new HomeFragment();
        mMallFragment = new MallFragment();
        mPersonFragment = new PersonFragment();
        mVideoFragment = new VideoFragment();
        mSettingsFragment = new SettingsFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.fl_contentLayout, mHomeFragment).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_contentLayout, mHomeFragment).commit();
                break;
            case R.id.action_mall:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_contentLayout, mMallFragment).commit();
                break;
            case R.id.action_video:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_contentLayout, mVideoFragment).commit();
                break;
            case R.id.action_person:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_contentLayout, mPersonFragment).commit();
                break;
            case R.id.action_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_contentLayout, mSettingsFragment).commit();
                break;
        }

        return true;
    }
}
