package com.example.nguyentan.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Nguyen Tan on 11/26/2018.
 */

public class ViewHolderConversation extends RecyclerView.ViewHolder{
    TextView tvUserName, tvContent, tvTime;

    public ViewHolderConversation(View itemView) {
        super(itemView);
        tvUserName= itemView.findViewById(R.id.tv_name);
        tvContent= itemView.findViewById(R.id.tv_content);
        tvTime= itemView.findViewById(R.id.tv_time);

    }
}
