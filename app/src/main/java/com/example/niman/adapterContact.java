package com.example.niman;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.niman.Tables.Student;

import java.util.ArrayList;
import java.util.List;

public class adapterContact  extends RecyclerView.Adapter<adapterContact.view> {



    List<Student> mainData;


    adapterContact()
    {
        mainData=new ArrayList<>();
    }



    Click cxc;

    public void   Click(Click cs){

        this.cxc=cs;
    }
    @NonNull
    @Override
    public view onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cc= LayoutInflater.from(parent.getContext()).inflate(R.layout.customcontact,parent,false);
        return new view(cc);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull view holder, int position) {

        Student student=mainData.get(position);
        if (student.getName().isEmpty())
        {
            holder.Name.setText("نامشخص");
        }else {
            holder.Name.setText(student.getName());
        }


        if (student.getLastname().isEmpty())
        {
            holder.LastName.setText("نامشخص");
        }else {
            holder.LastName.setText(student.getLastname());
        }



        holder.Id.setText(student.getId().toString());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cxc.Run(student);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mainData.size();
    }

    public  class view extends RecyclerView.ViewHolder {
        TextView Name;
        TextView LastName;
        TextView Id;
        public view(@NonNull View itemView) {
            super(itemView);
            Name=itemView.findViewById(R.id.textView3);
            LastName=itemView.findViewById(R.id.textView4);
            Id=itemView.findViewById(R.id.textView6);


        }
    }


    interface Click{
        public  void  Run(Student Id);
    }
}
