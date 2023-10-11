package com.example.android_ots_webservices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.http.GET

data class ListPokemonResult(
    val name: String,
    val url: String
)

data class ListPokemonApiResult(
    val count: Int,
    val next: String?, // a ? significa que essa propriedade pode aceitar/trazer valores nulos
    val previous: String?,
    val result: Array<ListPokemonResult>
)

interface PokeApiService {
    // https://pokeapi.co/api/v2/pokemon?limit=20&offset=0
    // Base: https://pokeapi.co/api/v2/
    // Endpoint (Rota): pokemon?limit=20&offset=0
    @GET("pokemon?limit=20&offset=0")
    fun listPokemon(): Call<ListPokemonApiResult>
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}