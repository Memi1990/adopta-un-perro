package com.example.adoptaunperro.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.adoptaunperro.DogsFeatures
import com.example.adoptaunperro.R
import com.example.adoptaunperro.databinding.ItemDogBinding

class DogViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val b = ItemDogBinding.bind(view)
    fun render(dogsModel: DogsFeatures){
        b.tvRace.text = "Raza: "+dogsModel.race
        b.tvName.text = "Nombre: "+dogsModel.name
        b.tvAge.text = "Edad: "+dogsModel.age.toString()
        b.tvSterilized.text = if (dogsModel.sterilized){
            "Está esterilizado"
        } else {
            "No esta esterilizado"
        }

        b.tvChip.text = if (dogsModel.chip){
            "Tiene chip"
        } else "No tiene chip"
        b.tvSex.text = if (dogsModel.sex){
            "Macho"
        } else "Hembra"

        Glide.with(b.ivDog.context)
            .load(dogsModel.picture)
            .error(R.drawable.logoadopta_transp)
            .into(b.ivDog)
        b.ivDog.setOnClickListener {
            Toast.makeText(b.ivDog.context, dogsModel.name, Toast.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(b.ivDog.context, dogsModel.race,Toast.LENGTH_SHORT).show()
        }
    }
}