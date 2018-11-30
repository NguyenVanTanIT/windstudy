package com.example.nguyentan.recyclerview.messenger;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nguyentan.recyclerview.R;

import java.util.ArrayList;

/**
 * Created by Nguyen Tan on 11/29/2018.
 */
public class MessengerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Messenger> arrayMessenger;

    public MessengerAdapter(Context baseContext, ArrayList<Messenger> arrayMessenger) {
        this.context=baseContext;
        this.arrayMessenger=arrayMessenger;
    }

    @Override
    public int getItemViewType(int position) {
        if (arrayMessenger.get(position).getGoing()==1){
            return 1;

        }else
            return 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       if (viewType==1){
           View view = LayoutInflater.from(context).inflate(R.layout.item_send,parent,false);
            return new SendViewHolder(view);
       }
       else {
           View view=LayoutInflater.from(context).inflate(R.layout.item_receive,parent,false);
           return new ReceiveViewHolde(view);
       }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (arrayMessenger.get(position).getGoing()==1){
            ((SendViewHolder)holder).tvSend.setText(arrayMessenger.get(position).getContent());
            ((SendViewHolder)holder).tvUserNameSend.setText("Tân");
        }
        else {
            ((ReceiveViewHolde)holder).tvReceive.setText(arrayMessenger.get(position).getContent());
            ((ReceiveViewHolde)holder).tvUserNameReceive.setText("Đớ");

        }
    }

    @Override
    public int getItemCount() {
        return arrayMessenger.size();
    }

    class SendViewHolder extends  RecyclerView.ViewHolder{
        TextView tvSend,tvUserNameSend;
        public SendViewHolder(View itemView) {
            super(itemView);
            tvSend=itemView.findViewById(R.id.txt_send);
            tvUserNameSend=itemView.findViewById(R.id.txt_user_send);
        }
    }

    class ReceiveViewHolde extends RecyclerView.ViewHolder{
        TextView tvReceive,tvUserNameReceive;
        public ReceiveViewHolde(View itemView) {
            super(itemView);
            tvReceive=itemView.findViewById(R.id.txt_receive);
            tvUserNameReceive=itemView.findViewById(R.id.txt_name_receive);
        }
    }
}
