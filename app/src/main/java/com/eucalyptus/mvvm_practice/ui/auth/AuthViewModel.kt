package com.eucalyptus.mvvm_practice.ui.auth

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {
    var email: String? = null
    var pass: String? = null

    var authListener: AuthListener? = null


    fun onLoginButtonClick(view: View) {
        authListener?.onStarted()

        if (email.isNullOrEmpty() || pass.isNullOrEmpty()) {
            //login failed
            authListener?.onFailure("Invalid username or password")
            Log.d("TAG", "onLoginButtonClick: is null or empty")
            return
        } else {
            //success
                authListener?.onSuccess("Login success")
            Log.d("TAG", "onLoginButtonClick: success")
        }
    }
}