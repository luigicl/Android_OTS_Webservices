package com.example.android_ots_webservices.viewmodel

import androidx.lifecycle.ViewModel
import com.example.android_ots_webservices.model.PokemonRepository

class PokemonViewModel : ViewModel() {
    val pokemonItems = PokemonRepository.pokemonItems
}
