package com.example.android_ots_webservices.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_ots_webservices.R
import com.example.android_ots_webservices.view.list.PokemonListAdapter
import com.example.android_ots_webservices.viewmodel.PokemonViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokemonViewModel = ViewModelProvider(this).get(PokemonViewModel::class.java)
        val pokemonItems = pokemonViewModel.pokemonItems

        val rvPokemon = findViewById<RecyclerView>(R.id.rvPokemon)
        rvPokemon.layoutManager = LinearLayoutManager(this)

        pokemonItems.observe(this) {
            rvPokemon.adapter = PokemonListAdapter(it.toTypedArray())
        }
    }
}