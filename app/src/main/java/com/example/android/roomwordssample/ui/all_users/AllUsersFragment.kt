package com.example.android.roomwordssample.ui.all_users

import android.os.Bundle
import android.view.View
import com.example.android.roomwordssample.R
import com.example.android.roomwordssample.base.BaseFragment
import com.example.android.roomwordssample.ui.all_users.viewModel.UsersViewModel
import org.koin.android.viewmodel.ext.android.viewModel


class AllUsersFragment : BaseFragment(){

    private val viewModel:UsersViewModel by viewModel()

    override fun getLayoutView(): Int = R.layout.all_users_fragment


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //TODO get users with view model

    }




}