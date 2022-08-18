package com.example.android.roomwordssample.ui.all_users.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.roomwordssample.base.BaseViewModel
import com.example.android.roomwordssample.domain.model.Datum
import com.example.android.roomwordssample.domain.usecase.GetUsersUseCase
import com.example.android.roomwordssample.ui.UsersViewState


class UsersViewModel(private val useCase: GetUsersUseCase) : BaseViewModel() {

    //Private fields
    private var _usersViewState = MutableLiveData<UsersViewState>()
    private var _users = MutableLiveData<List<Datum>>()

    //Public fields
    var currentPage: Int = 1

    val users: LiveData<List<Datum>>
        get() = _users

    val usersViewState: LiveData<UsersViewState>
        get() = _usersViewState


    private fun getUsersRequest() {
        main {
            runCatching {
                useCase.getUsersNetwork(page = currentPage)
            }.onSuccess {

            }.onFailure {
                _usersViewState.postValue(UsersViewState.OnError)
            }
        }
    }


}