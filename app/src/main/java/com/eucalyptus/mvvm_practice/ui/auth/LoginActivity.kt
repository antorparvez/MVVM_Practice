package com.eucalyptus.mvvm_practice.ui.auth

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eucalyptus.mvvm_practice.R
import com.eucalyptus.mvvm_practice.databinding.ActivityLoginBinding
import com.eucalyptus.mvvm_practice.uitls.showToast

class LoginActivity : AppCompatActivity() ,AuthListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Data binding and setV ViewModel
        val dataBinding : ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        dataBinding.authViewModel = viewModel

        viewModel.authListener =this
    }

    override fun onStarted() {
        Log.d("TAG", "onStarted: Login Started")
    }

    override fun onSuccess(message: String) {
        showToast(message)
    }

    override fun onFailure(message: String) {
        showToast(message)

    }


}