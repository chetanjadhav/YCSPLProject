package com.chetan.yCSPLProject.viewModels

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel
import com.chetan.yCSPLProject.activities.MapActivity
import com.chetan.yCSPLProject.models.LoginModel

class LoginVModel() : ViewModel() {
    val loginModel: LoginModel = LoginModel()
    var isEnabled = ObservableBoolean(false)

    private fun variableCheck() {
        if (loginModel.validEmail && loginModel.validPassword)
            isEnabled.set(true)
        else
            isEnabled.set(false)
    }

    fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        loginModel.setEmail(s.toString())
        variableCheck()
    }
    fun onPassTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        loginModel.setPassword(s.toString())
        variableCheck()
    }


    fun onLoginClick(context: Context) {

    }


}