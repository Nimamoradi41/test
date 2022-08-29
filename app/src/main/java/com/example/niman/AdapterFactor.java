package com.example.niman;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterFactor  extends RecyclerView.Adapter<AdapterFactor.myholder> {


    ArrayList<Factor> mydata;

    AdapterFactor(){
        mydata=new ArrayList<>();
    }
    @NonNull
    @Override
    public myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View inf= LayoutInflater.from(parent.getContext()).inflate(R.layout.customefactor,parent,false);
         return  new myholder(inf);
    }

    @Override
    public void onBindViewHolder(@NonNull myholder holder, int position) {

        Factor Item=mydata.get(position);


        holder.Customer.setText(Item.getNameCostomer());
        holder.Date.setText(Item.getDate());
        holder.Vahed.setText(Item.getVahed());
        holder.Joz.setText(Item.getJoz());

        int  Mohtava= Integer.parseInt(Item.getMohtava());
        int  Vahed= Integer.parseInt(Item.getVahed());
        int  Joz= Integer.parseInt(Item.getJoz());
        int  JozPrice= Integer.parseInt(Item.getJozPrice());

        int KOll=(Vahed*Mohtava)+Joz;
        holder.Kol.setText(String.valueOf((KOll)));




        holder.Prise.setText(String.valueOf(KOll*JozPrice));





        if (Item.getType()==0)
        {
            holder.constraintLayout.setBackgroundResource(R.drawable.shape_blue);
            holder.textView30.setText("در حال انتظار ");
        }


        if (Item.getType()==1)
        {
            holder.constraintLayout.setBackgroundResource(R.drawable.shape_green);
            holder.textView30.setText("تایید شده");
        }


        if (Item.getType()==2)
        {
            holder.constraintLayout.setBackgroundResource(R.drawable.shape_red);
            holder.textView30.setText("تایید نشده");
        }


    }

    @Override
    public int getItemCount() {
        return mydata.size();
    }

    class  myholder extends RecyclerView.ViewHolder {
        TextView Customer;
        TextView Date;
        TextView Vahed;
        TextView Joz;




        ConstraintLayout constraintLayout;
        TextView Prise;
        TextView Kol;
        TextView textView30;
        public myholder(@NonNull View itemView) {
            super(itemView);

            Customer=itemView.findViewById(R.id.textView34);
            Date=itemView.findViewById(R.id.textView33);
            Vahed=itemView.findViewById(R.id.textView42);
            Joz=itemView.findViewById(R.id.textView41);
            Prise=itemView.findViewById(R.id.textView36);
            Kol=itemView.findViewById(R.id.textView40);
            constraintLayout=itemView.findViewById(R.id.constraintLayout);
            textView30=itemView.findViewById(R.id.textView30);
        }
    }
}
