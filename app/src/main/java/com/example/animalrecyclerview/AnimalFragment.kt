package com.example.animalrecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class AnimalFragment : Fragment(R.layout.fragment_animal) {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter:AnimalAdapter
    private val modelList = ArrayList<AnimatItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setDataForAdapter()


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView=view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager =LinearLayoutManager(context)
        recyclerView.adapter=AnimalAdapter(modelList)
    }


    private fun setDataForAdapter() {
        modelList.add(AnimatItem(R.drawable.lino, "Lion"))
        modelList.add(AnimatItem(R.drawable.cat, "Cat"))
        modelList.add(AnimatItem(R.drawable.iata, "Iata"))
        modelList.add(AnimatItem(R.drawable.lizart, "Lizart"))
        modelList.add(AnimatItem(R.drawable.panda, "Panda"))
        modelList.add(AnimatItem(R.drawable.tiger, "Tiger"))
        modelList.add(AnimatItem(R.drawable.lino, "Lion"))
        modelList.add(AnimatItem(R.drawable.cat, "Cat"))
        modelList.add(AnimatItem(R.drawable.iata, "Iata"))
        modelList.add(AnimatItem(R.drawable.lizart, "Lizart"))

    }


}


