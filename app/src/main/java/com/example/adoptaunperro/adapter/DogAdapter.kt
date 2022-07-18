package com.example.adoptaunperro.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adoptaunperro.DogsFeatures
import com.example.adoptaunperro.R

class DogAdapter(private val dogList:List<DogsFeatures>):RecyclerView.Adapter<DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder{
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog, parent,false))
    }
    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = dogList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = dogList.size
}