package com.example.android.roomwordssample.ui



sealed class UsersViewState {
    data class OnSuccessFetch(val newPage: Int) : UsersViewState()
    object OnError : UsersViewState()
    object OnLoading : UsersViewState()
}

