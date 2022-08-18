@file:Suppress("UNCHECKED_CAST")

package com.example.android.roomwordssample.repository

import com.example.android.roomwordssample.domain.model.Datum
import mx.com.movieschallenge.data.remote.WordsEndpoints


interface UsersRepository  {
    suspend fun getUsersNetwork(page: Int): MutableList<Datum>?
}

class UsersRepositoryImpl(private val wordsEndpoints: WordsEndpoints) : UsersRepository {


    override suspend fun getUsersNetwork(page: Int): MutableList<Datum>? {
        val pageMovie = wordsEndpoints.getListUsers(page)

        return pageMovie.data
    }
}

