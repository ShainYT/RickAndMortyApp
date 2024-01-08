package com.example.rickandmortyapp.ui.character.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmortyapp.R
import com.example.rickandmortyapp.domain.model.CharacterInfo

class CharacterAdapter(
    private var characterList: List<CharacterInfo> = emptyList()
) : RecyclerView.Adapter<CharacterViewHolder>() {

    fun updateList(list: List<CharacterInfo>) {
        characterList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
        )
    }

    override fun getItemCount(): Int =
        characterList.size


    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.render(characterList[position])

    }

}