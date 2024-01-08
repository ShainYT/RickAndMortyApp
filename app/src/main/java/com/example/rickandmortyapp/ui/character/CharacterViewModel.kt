package com.example.rickandmortyapp.ui.character

import androidx.lifecycle.ViewModel
import com.example.rickandmortyapp.domain.model.CharacterInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor() : ViewModel() {
    private var _character = MutableStateFlow<List<CharacterInfo>>(emptyList())
    val character: StateFlow<List<CharacterInfo>> = _character

    init {
        _character.value = listOf(
            CharacterInfo.Objeto1,
            CharacterInfo.Objeto2,
            CharacterInfo.Objeto3,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
            CharacterInfo.Objeto4,
        )
    }
}