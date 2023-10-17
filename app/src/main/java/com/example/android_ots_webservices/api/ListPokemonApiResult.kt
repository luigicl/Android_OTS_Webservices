package com.example.android_ots_webservices.api

data class ListPokemonApiResult(
    val count: Int,
    val next: String?, // a ? significa que essa propriedade pode aceitar/trazer valores nulos
    val previous: String?,
    val results: Array<PokemonItemApi>
)