package com.example.animalrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class AnimalAdapter(private val itemList:ArrayList<AnimatItem>): RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return AnimalViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
       val animalItem:AnimatItem=itemList[position]
        holder.setData(animalItem)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
    class AnimalViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        val name:TextView=itemView.findViewById(R.id.tvName)
        val image:ImageView=itemView.findViewById(R.id.imImage)
        fun setData(model:AnimatItem){
            image.setImageResource(model.image)
            name.text = model.name

        }
    }
}