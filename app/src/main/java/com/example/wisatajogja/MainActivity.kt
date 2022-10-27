package com.example.wisatajogja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wisataList = listOf<Wisata>(
            Wisata(
                R.drawable.foto1,
                "Tari",
                "Tari tari"
            ),
            Wisata(
                R.drawable.foto2,
                "Tes",
                "Tari tari"
            ),
            Wisata(
                R.drawable.foto3,
                "Tari",
                "Tari tari"
            ),
            Wisata(
                R.drawable.foto5,
                //nama wisata
                "Tari",
                //deskripsi wisata
                "Tari tari"
            ),
            Wisata(
                R.drawable.foto6,
                "Tari",
                "Tari tari"
            ),
            Wisata(
                R.drawable.foto7,
                "Tari",
                "Tari tari"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_wisata)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = WisataAdapter(this, wisataList){

        }
    }
}