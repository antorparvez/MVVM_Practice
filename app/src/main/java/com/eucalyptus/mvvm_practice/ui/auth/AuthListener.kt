package com.eucalyptus.mvvm_practice.ui.auth

interface AuthListener {

    fun onStarted()
    fun onSuccess(message:String)
    fun onFailure(message:String)
}