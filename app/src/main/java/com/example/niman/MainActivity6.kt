package com.example.niman

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main7.*
import kotlinx.android.synthetic.main.customeitemdialog.*
import kotlinx.android.synthetic.main.customeitemdialog.view.*

class MainActivity6 : AppCompatActivity() {


    var adapter:AdapterFactor ?=null
    var  database : DataBase?=null
    var MainData:ArrayList<Factor> ?=null
    @SuppressLint("NotifyDataSetChanged")
    fun ShowDia(){
     var   Dia= Dialog(this)
             Dia?.setCancelable(true)
             var VV= LayoutInflater.from(this).inflate(R.layout.customeitemdialog,null,false)
             Dia?.setContentView(VV)
             Dia?.window?.setLayout(
                 ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT)
             Dia?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))


             VV.btnsave.setOnClickListener {
                var  ss=Factor()
                 ss.Date=VV.edtCar.text.toString()
                 ss.NameCostomer=VV.edtDriver.text.toString()
                 ss.Vahed=VV.edtDistibiotor.text.toString()
                 ss.Joz=VV.edtDistant.text.toString()
                 ss.Mohtava=VV.edtDigitFactor.text.toString()
                 ss.JozPrice=VV.werty.text.toString()
                 var Type: Int =VV. erhjklbdb.text.toString().toInt()
                 ss.Type=Type
                 database?.FactorDaoA()?.insert(ss)
                 MainData?.add(ss)
                 adapter?.mydata=MainData
                 adapter?.notifyDataSetChanged()
                 Dia.dismiss()
             }
            Dia?.show()
         }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        database= DataBase.getInstances(this)
        MainData= database?.FactorDaoA()?.getAllFactors() as ArrayList<Factor>?
        adapter= AdapterFactor()
        adapter?.mydata=MainData
        recymain3?.adapter=adapter
        adapter?.notifyDataSetChanged()


        AddItem.setOnClickListener {
            ShowDia()
        }
    }
}