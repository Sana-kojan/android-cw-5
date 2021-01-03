package com.example.hw2;

import java.util.ArrayList;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

public class classesAdapter extends RecyclerView.Adapter {
    ArrayList<Classes> cArray;
    Context context;
    final LinearLayout lll;

    public classesAdapter(ArrayList<Classes> mArray, Context context,LinearLayout lll) {
        this.cArray = mArray;
        this.context = context;
        this.lll=lll;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //connecting to movie_list_item xml
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.class_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).day.setText(cArray.get(position).getC_Days());
        ((ViewHolder) holder).time.setText(cArray.get(position).getC_Time());
        ((ViewHolder) holder).code.setText(cArray.get(position).getC_code());
        ((ViewHolder) holder).img.setImageResource(cArray.get(position).getImage());
        ((ViewHolder) holder).delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Classes c = cArray.get(position);
                cArray.remove(position);
                notifyDataSetChanged();
                Snackbar.make(lll,"Hello user",Snackbar.LENGTH_LONG).setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cArray.add(position,c);
                        notifyDataSetChanged();
                    }
                }).show();
            }
        });

        /*final AlertDialog.Builder builder = new AlertDialog.Builder(context);

        ((ViewHolder) holder).delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Delete");
                builder.setMessage("Are you sure you want to delete this item?");
                builder.setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        cArray.remove(position);
                        notifyDataSetChanged();
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog ad = builder.create();
                ad.show();


            }
        });*/
    }

    @Override
    public int getItemCount() {
        return cArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public TextView code;
        public TextView time;
        public TextView day ;
        public View view;
        public ImageView delete;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.img);
            code = itemView.findViewById(R.id.code);
            time = itemView.findViewById(R.id.textView5);
            day = itemView.findViewById(R.id.textView3);
            delete = itemView.findViewById(R.id.delete);



        }


    }

}
