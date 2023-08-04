package com.quizappnative

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.quizappnative.tuts.SampleViewModel
import com.quizappnative.ui.auth.LoginPage
import com.quizappnative.ui.theme.QuizAppNativeTheme

class MainActivity : ComponentActivity() {
    companion object{
        init {
            System.loadLibrary("lance_lib")
        }

        external fun getShit(): Int
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizAppNativeTheme {
                val viewModel = viewModel<SampleViewModel>()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginPage()
                }
            }
        }

    }
}
