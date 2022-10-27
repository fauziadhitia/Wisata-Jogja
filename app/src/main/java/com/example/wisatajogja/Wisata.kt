package com.example.wisatajogja

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Wisata(
    val imgWisata: Int,
    val titleWisata: String,
    val descWisata: String
) : Parcelable