package com.quizappnative.ui.auth

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.quizappnative.util.COLORS
import com.quizappnative.util.SHAPES

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomPasswordField(label: String, icon: Int, spacerHeight: Int?) {
    var password by remember {
        mutableStateOf("")
    }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    OutlinedTextField(
        value = password,
        onValueChange = { newText -> password = newText },
        modifier = Modifier
            .fillMaxWidth()
            .clip(SHAPES.MEDIUM),
        label = { Text(text = label) },
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = COLORS.ColorGray,
            unfocusedIndicatorColor = COLORS.ColorPrimary,
            cursorColor = COLORS.ColorPrimary,
            errorCursorColor = Color.Red,
            containerColor = COLORS.ColorBackground
        ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        leadingIcon = {
            Icon(painter = painterResource(id = icon), contentDescription = "")
        },
        trailingIcon = {
            val iconImage =
                if (isPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
            val description = if (isPasswordVisible) "Hide Password" else "Show Password"
            IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                Icon(imageVector = iconImage, contentDescription = description)
            }
        },
        visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation()
    )
    
    Spacer(modifier = Modifier.height(spacerHeight?.dp ?: 0.dp))
}