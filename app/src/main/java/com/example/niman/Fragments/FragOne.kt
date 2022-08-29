package com.example.niman.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.niman.DataBase
import com.example.niman.R
import com.example.niman.adapter
import kotlinx.android.synthetic.main.fragment_frag_one.view.*

class FragOne : Fragment() {



    var  database : DataBase?=null
    var adapter:adapter ?=null
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        database= DataBase.getInstances(context)
        var MainView= inflater.inflate(R.layout.fragment_frag_one, container, false)
        adapter=adapter()
        adapter?.list=database?.TourDaoA()?.getAllTourtables()
        MainView.rootView.recymain2.adapter=adapter


        MainView.rootView.ref.setOnRefreshListener {
            adapter?.list=database?.TourDaoA()?.getAllTourtables()
            adapter?.notifyDataSetChanged()
            MainView.rootView.ref.isRefreshing=false
        }






        return  MainView;
    }


}