package com.example.wisatajogja

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WisataAdapter (private val context: Context, private val wisata: List<Wisata>,val listener:(Wisata) -> Unit)
    : RecyclerView.Adapter<WisataAdapter.WisataViewHolder>() {


    class WisataViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgWisata = view.findViewById<ImageView>(R.id.img_item_photo)
        val titleWisata = view.findViewById<TextView>(R.id.tv_item_name)
        val descWisata = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(wisata: Wisata, listener: (Wisata) -> Unit){
            imgWisata.setImageResource(wisata.imgWisata)
            titleWisata.text = wisata.titleWisata
            descWisata.text = wisata.descWisata
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        return WisataViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_wisata, parent, false)
        )
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        holder.bindView(wisata[position], listener)
    }

    override fun getItemCount(): Int = wisata.size
}