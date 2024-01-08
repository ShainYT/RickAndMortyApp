package com.example.rickandmortyapp.ui.character.adapter

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmortyapp.databinding.ItemCharacterBinding
import com.example.rickandmortyapp.domain.model.CharacterInfo

class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemCharacterBinding.bind(view)
    fun render(characterInfo: CharacterInfo) {

        val context = binding.tvTitle.context
        Log.i("pablo", context.getString(characterInfo.name))
        binding.ivCharacter.setImageResource(characterInfo.img)
        binding.tvTitle.text = context.getString(characterInfo.name)

    }
}