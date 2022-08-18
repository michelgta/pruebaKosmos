package com.example.android.roomwordssample.domain.usecase

import com.example.android.roomwordssample.domain.model.Datum
import com.example.android.roomwordssample.repository.UsersRepository


interface GetUsersUseCase  {

    suspend fun getUsersNetwork(page: Int): MutableList<Datum>?
}

class GetUsersUseCaseImpl(private val repositoryUsers: UsersRepository) : GetUsersUseCase {
    override suspend fun getUsersNetwork(page: Int): MutableList<Datum>? = repositoryUsers.getUsersNetwork(page)
}
