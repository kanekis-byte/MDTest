package com.datayes.materialdesigndemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.datayes.materialdesigndemo.R;

import java.util.List;

/**
 * SimpleListAdapter
 * Created by hongfei.tao on 2017/9/21.
 */
public class SimpleListAdapter extends RecyclerView.Adapter<SimpleListAdapter.SimpleViewHolder> {

    private List<String> mDataList;

    public SimpleListAdapter(List<String> list) {
        this.mDataList = list;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        final SimpleViewHolder holder = new SimpleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_simple_text, parent, false));
        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(), mDataList.get(holder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.mTextView.setText(mDataList.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataList == null ? 0 : mDataList.size();
    }

    static class SimpleViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;

        SimpleViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.textView);
        }
    }

}
