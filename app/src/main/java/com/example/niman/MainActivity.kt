package com.example.niman

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.niman.Tables.Student
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.cu_dia.view.*

class MainActivity : AppCompatActivity() {
    var mycar:CarKotlin ?= null
    var  database : DataBase?=null
    var ad:adapterContact ?=null
    var main:List<Student>?=null
    var Dia:Dialog ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         }
//        database= DataBase.getInstances(this)
//        ad= adapterContact()
//        main= ArrayList()
//        ad?.mainData=main
//        recymain.adapter=ad
//        main=database?.StudentDaoA()?.getAllStudents()
//        ad?.mainData=main
//        ad?.notifyDataSetChanged()
//
//
//        ad?.Click(object :adapterContact.Click{
//            override fun Run(Id: Student?) {
////                var dsscv=    database?.StudentDaoA()?.delete(
////                    Id!!
////                );
////                Log.i("SFvbsfbsfb",dsscv.toString());
//
//
//                Id?.Lastname="Moradi";
//                var dsscv=    database?.StudentDaoA()?.update(
//                    Id!!
//                );
//                Log.i("SFvbsfbsfb",dsscv.toString());
//            }
//
//        } )
//
//        btnadd.setOnClickListener {
//            Dia=Dialog(this)
//            Dia?.setCancelable(true)
//            var VV=LayoutInflater.from(this).inflate(R.layout.cu_dia,null,false)
//            Dia?.setContentView(VV)
//            Dia?.window?.setLayout(
//                ConstraintLayout.LayoutParams.MATCH_PARENT,
//                ConstraintLayout.LayoutParams.MATCH_PARENT)
//            Dia?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//
//
//            VV.Save.setOnClickListener {
//                var  ss=Student()
//                var name=VV.editTextTextPersonName.text.toString()
//                var lastname=VV.editTextTextPersonName2.text.toString()
//                ss.Name=name
//                ss.Lastname=lastname
//                database?.StudentDaoA()?.insert(ss)
//            }
//            Dia?.show()
//        }
//
//    }
}