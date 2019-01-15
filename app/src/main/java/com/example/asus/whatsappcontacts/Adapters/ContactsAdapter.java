package com.example.asus.whatsappcontacts.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.asus.whatsappcontacts.Contact;
import com.example.asus.whatsappcontacts.R;

import java.util.List;

/**
 * Created by asus on 15/01/2019.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder> implements View.OnClickListener {


    private Context mContext ;
    private List<Contact> mData ;


    public ContactsAdapter(Context mContext, List lst) {


        this.mContext = mContext;
        this.mData = lst;


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.contact_raw_item,parent,false);
        // click listener here
        final MyViewHolder myViewHolder = new MyViewHolder(view);
        myViewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent i = new Intent(mContext, DetailFilm.class);
                i.putExtra("title",mData.get(myViewHolder.getAdapterPosition()).getTitle());
                i.putExtra("text",mData.get(myViewHolder.getAdapterPosition()).getText());
                i.putExtra("year",mData.get(myViewHolder.getAdapterPosition()).getYear());
                i.putExtra("intro",mData.get(myViewHolder.getAdapterPosition()).getIntro());
                i.putExtra("img",mData.get(myViewHolder.getAdapterPosition()).getImgUrl());
/
                mContext.startActivity(i);*/
            }
        });

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.name.setText(mData.get(position).getName());
        holder.number.setText(mData.get(position).getNumber());
        // load image from the internet using Glide
        //Glide.with(mContext).load(mData.get(position).getImgUrl()).apply(options).into(holder.FilmImg);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public void onClick(View v) {

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name,number;
        LinearLayout view_container;

        public MyViewHolder(View itemView) {
            super(itemView);
            view_container = itemView.findViewById(R.id.container);

            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);


        }
    }




}

