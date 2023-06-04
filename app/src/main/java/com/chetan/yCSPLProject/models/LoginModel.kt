package com.chetan.yCSPLProject.models

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class LoginModel {
    private var email: String = ""
    private var password: String = ""
    var validEmail = false
    var validPassword = false

    fun getPassword(): String {
        return password
    }

    fun getEmail(): String {
        return email
    }

    fun setEmail(email: String) {
        this.email = email
        isValidEmail()
    }

    fun setPassword(password: String) {
        this.password = password
        isValidPassword()
    }


    fun isValidEmail() {
        validEmail = if (TextUtils.isEmpty(email))
            false
        else Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
    fun isValidPassword() {
        val  PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$";
        val pattern = Pattern.compile(PASSWORD_PATTERN);
        validPassword = if (TextUtils.isEmpty(password))
            false
        else pattern.matcher(password).matches()
    }

}


