package com.chetan.yCSPLProject.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LoginVModelFactory(): ViewModelProvider.NewInstanceFactory()   {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoginVModel() as T
    }
}