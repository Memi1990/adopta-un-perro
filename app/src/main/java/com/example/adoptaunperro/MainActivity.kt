package com.example.adoptaunperro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adoptaunperro.adapter.DogAdapter
import com.example.adoptaunperro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        val actionBar = supportActionBar
        actionBar!!.title = "Adopta Un Perro"
        actionBar.setIcon(R.drawable.logoadopta_transp)
        getActionBar()?.setIcon(R.drawable.logoadopta_transp)

        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
        initRecyclerView()
    }
    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        b.recyclerDog.layoutManager = manager
//        b.recyclerDog.addItemDecoration(decoration)
        b.recyclerDog  .layoutManager = LinearLayoutManager(this)
        b.recyclerDog.adapter = DogAdapter(DogsFeaturesProvider.dogList)
    }
}