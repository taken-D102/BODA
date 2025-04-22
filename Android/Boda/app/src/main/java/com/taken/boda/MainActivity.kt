package com.taken.boda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.taken.boda.navigation.navhost.NavHost
import com.taken.boda.ui.theme.BodaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { BodaTheme { Surface(modifier = Modifier.fillMaxSize()) { NavHost() } } }
    }
}