package br.com.sam.logincomjetpack

import br.com.sam.logincomjetpack.ui.theme.LoginComJetpackTheme

package com.whitebatcodes.myloginapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent{
            LoginComJetpackTheme {
                LoginForm()
            }
        }
    }
}