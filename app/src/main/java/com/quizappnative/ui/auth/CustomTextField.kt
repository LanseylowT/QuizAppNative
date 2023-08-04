package com.quizappnative.ui.auth

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.quizappnative.util.COLORS
import com.quizappnative.util.SHAPES


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(label: String, image: Int, spacerHeight: Int?){
    var text by remember{ mutableStateOf("") }
    
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(SHAPES.MEDIUM),
        value = text,
        onValueChange = { newText -> text = newText },
        label = { Text(text = label) },
        colors =TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = COLORS.ColorGray,
            unfocusedIndicatorColor = COLORS.ColorPrimary,
            cursorColor = COLORS.ColorPrimary,
            errorCursorColor = Color.Red,
            containerColor = COLORS.ColorBackground
        ),
        keyboardOptions = KeyboardOptions.Default,
        leadingIcon ={
            Icon(painter = painterResource(id = image), contentDescription = "")
        }
    )
    
    Spacer(modifier = Modifier.height(spacerHeight?.dp ?: 0.dp))
}