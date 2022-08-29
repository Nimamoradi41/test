package com.example.niman

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.niman.Tables.Tourtable
import kotlinx.android.synthetic.main.customeitem.view.*

class adapter : RecyclerView.Adapter<adapter.myview>() {


    var list:List<Tourtable>?=null


    init {
        list= ArrayList()
    }
    class  myview(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myview {
      var i=LayoutInflater.from(parent.context).inflate(R.layout.customeitem,parent,false)


        return  myview(i)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: myview, position: Int) {

        var Data=list?.get(position)


        if (!Data?.Driver.isNullOrBlank())
        {
            holder.itemView.textView20.setText(Data?.Driver)
        }


        if (!Data?.Distribiotor.isNullOrBlank())
        {
            holder.itemView.textView21.setText(Data?.Distribiotor)
        }



        if (!Data?.NumberTour.toString().isNullOrBlank())
        {
            holder.itemView.textView19.setText(Data?.NumberTour.toString())
        }


        if (!Data?.Distant.toString().isNullOrBlank())
        {
            holder.itemView.textView23.setText(Data?.Distant.toString())
        }



        if (!Data?.DigitFactor.toString().isNullOrBlank())
        {
            holder.itemView.textView25.setText(Data?.DigitFactor.toString())
        }



        if(Data?.TurnOn!!)
        {
            holder.itemView.btnx.setBackgroundResource(R.drawable.shape_3)
        }else{
            holder.itemView.btnx.setBackgroundResource(R.drawable.shape_2)
        }



        holder.itemView.btnx.setOnClickListener {
            if (Data.TurnOn!!)
            {
                Data.TurnOn=false
            }else {
                Data.TurnOn = true
            }


            notifyDataSetChanged()
        }



    }

    override fun getItemCount(): Int {
      return list?.size!!
    }
}