package com.geeeeeeeek.hacktools;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;


/**
 * Created by xiaoqingsong
 * Date: 06/12/2017
 * Time: 9:59 PM
 */

public class RvAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private Context context;
    private List<Student> data;

    public RvAdapter(Context context, List<Student> data){
        this.context = context;
        this.data = data;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BaseViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false), context);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        Student student = data.get(position);
        holder.setText(R.id.tv_name, student.name)
                .setImageURI(R.id.iv_avatar, Uri.parse(student.url));
        holder.setOnClickListener(R.id.tv_name, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "hello", Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

}
