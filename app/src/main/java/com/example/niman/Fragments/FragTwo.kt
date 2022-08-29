package com.example.niman.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.niman.DataBase
import com.example.niman.R
import com.example.niman.Tables.Tourtable
import kotlinx.android.synthetic.main.fragment_frag_two.view.*

class FragTwo : Fragment() {

    var  database : DataBase?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var MainView= inflater.inflate(R.layout.fragment_frag_two, container, false)

        database= DataBase.getInstances(context)
        MainView.rootView.btnsave.setOnClickListener {
            var model=Tourtable()
            if (!MainView.rootView.edtDriver.text.isNullOrBlank())
            {
                model.Driver=MainView.rootView.edtDriver.text.toString()
            }else{
                return@setOnClickListener
            }


            if (!MainView.rootView.edtCar.text.isNullOrBlank())
            {
                model.Car=MainView.rootView.edtCar.text.toString()
            }else{
                return@setOnClickListener
            }

            if (!MainView.rootView.edtDistibiotor.text.isNullOrBlank())
            {
                model.Distribiotor=MainView.rootView.edtDistibiotor.text.toString()
            }else{
                return@setOnClickListener
            }



            if (!MainView.rootView.edtDistant.text.isNullOrBlank())
            {
                model.Distant=MainView.rootView.edtDistant.text.toString()
            }else{
                return@setOnClickListener
            }


            if (!MainView.rootView.edtDigitFactor.text.isNullOrBlank())
            {
                model.DigitFactor=MainView.rootView.edtDigitFactor.text.toString()
            }else{
                return@setOnClickListener
            }


            model.TurnOn=false

            database?.TourDaoA()?.insert(model)
            Toast.makeText(context,"Added",Toast.LENGTH_SHORT).show()




        }





        return  MainView
    }


}