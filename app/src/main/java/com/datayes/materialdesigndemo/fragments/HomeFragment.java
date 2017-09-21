package com.datayes.materialdesigndemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.datayes.materialdesigndemo.R;
import com.datayes.materialdesigndemo.adapter.SimpleListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * HomeFragment
 * Created by hongfei.tao on 2017/9/21.
 */
public class HomeFragment extends Fragment {

    private View mContentView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (mContentView == null) {
            mContentView = inflater.inflate(R.layout.fragment_home, container, false);
            RecyclerView recyclerView = (RecyclerView) mContentView.findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

            List<String> testList = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                testList.add("我是一条数据" + (i + 1));
            }

            SimpleListAdapter adapter = new SimpleListAdapter(testList);
            recyclerView.setAdapter(adapter);
        }
        return mContentView;
    }


}
