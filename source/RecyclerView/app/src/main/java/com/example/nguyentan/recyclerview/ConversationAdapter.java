package com.example.nguyentan.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Nguyen Tan on 11/26/2018.
 */

public class ConversationAdapter  extends RecyclerView.Adapter<ViewHolderConversation>{

    ArrayList<Conversation> arraylistconversations ;
    Context context;

    @Override
    public ViewHolderConversation onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_recyclerview,parent,false);

        return new ViewHolderConversation(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderConversation holder, int position) {
        Conversation conversation =arraylistconversations.get(position);
        holder.tvUserName.setText(conversation.getUsernaem());
        holder.tvContent.setText(conversation.getSortContent());
        holder.tvTime.setText(conversation.getTime());
    }

    @Override
    public int getItemCount() {
        return arraylistconversations.size();
    }
}
