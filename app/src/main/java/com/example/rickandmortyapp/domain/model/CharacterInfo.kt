package com.example.rickandmortyapp.domain.model

import com.example.rickandmortyapp.R

sealed class CharacterInfo(val img: Int, val name: Int) {
    data object Objeto1 : CharacterInfo(R.drawable.ic_character, R.string.character)
    data object Objeto2 : CharacterInfo(R.drawable.ic_character, R.string.character)
    data object Objeto3 : CharacterInfo(R.drawable.ic_character, R.string.character)
    data object Objeto4 : CharacterInfo(R.drawable.ic_character, R.string.character)
    data object Objeto5 : CharacterInfo(R.drawable.ic_character, R.string.character)
    data object Objeto6 : CharacterInfo(R.drawable.ic_character, R.string.character)
    data object Objeto7 : CharacterInfo(R.drawable.ic_character, R.string.character)
    data object Objeto8 : CharacterInfo(R.drawable.ic_character, R.string.character)
    data object Objeto9 : CharacterInfo(R.drawable.ic_character, R.string.character)
}