package com.quizappnative.tuts

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel


class SampleViewModel: ViewModel() {

    var backgroundColor by mutableStateOf(Color.White)
        private set

    fun changeBackgroundColor(){
        backgroundColor = Color.Red
    }
}