package com.example.textfiledcolor

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textfiledcolor.ui.theme.TextFiledColorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Greeting()
        }
    }
}

@Composable
fun Greeting() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.TopCenter
    ) {
        Column() {
            var textstate by remember { mutableStateOf("") }
            var textstate2 by remember { mutableStateOf("") }
            var textstate3 by remember { mutableStateOf("") }
            var textstate4 by remember { mutableStateOf("") }
            var textstate5 by remember { mutableStateOf("") }
            var textstate6 by remember { mutableStateOf("") }
            var textstate7 by remember { mutableStateOf("") }
            val myColor = Color(0xFFD50000)
            val myColor2 = Color(0xFF0091EA)
            val myColor3 = Color(0xFFAA00FF)
            val myColor4 = Color(0xFFD50000)
            val myColor5 = Color(0xFF00C853)
            val myColor6 = Color(0xFFF86B3F)
            val myColor7 = Color(0xFF00838F)

            TextField(
                value = textstate,
                onValueChange = { textstate = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "Enter your first name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Face,
                        contentDescription ="Email icon",
                        tint = myColor
                    )

                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor,
                    cursorColor = myColor,
                    focusedLabelColor = myColor,
                    textColor = myColor,
                    backgroundColor = myColor.copy(TextFieldDefaults.BackgroundOpacity),
                    focusedIndicatorColor =myColor,
                    unfocusedIndicatorColor = myColor.copy(
                        TextFieldDefaults.UnfocusedIndicatorLineOpacity)
                ),
            )




            TextField(
                value = textstate7,
                onValueChange = { textstate7 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "Middle name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.AccountCircle,
                        contentDescription ="Email icon",
                        tint = myColor7
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor7,
                    cursorColor = myColor7,
                    focusedLabelColor = myColor7,
                    textColor = myColor7,
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor =Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                shape = CutCornerShape(14.dp)
            )

            TextField(
                value = textstate4,
                onValueChange = { textstate4 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "Last name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.MailOutline,
                        contentDescription ="Email icon",
                        tint = myColor4
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor4,
                    cursorColor = myColor4,
                    focusedLabelColor = myColor4,
                    textColor = myColor4,
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = myColor4,
                    unfocusedIndicatorColor = myColor4.copy(
                        TextFieldDefaults.UnfocusedIndicatorLineOpacity)),
                shape = CutCornerShape(14.dp)
            )


            // Text3
            TextField(
                value = textstate2,
                onValueChange = { textstate2 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "Phone number")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Phone,
                        contentDescription ="Email icon",
                        tint = myColor2
                    )

                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor2,
                    cursorColor = myColor2,
                    focusedLabelColor = myColor2,
                    textColor = myColor2,
                    backgroundColor = myColor2.copy(
                        TextFieldDefaults.BackgroundOpacity),
                    focusedIndicatorColor =myColor2,
                    unfocusedIndicatorColor = myColor2.copy(
                        TextFieldDefaults.UnfocusedIndicatorLineOpacity)
                ),
                shape = RoundedCornerShape(topStart = 25.dp , topEnd = 25.dp)
            )

            TextField(
                value = textstate3,
                onValueChange = { textstate3 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "User name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Person,
                        contentDescription ="Email icon",
                        tint = myColor3
                    )

                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor3,
                    cursorColor = myColor3,
                    focusedLabelColor = myColor3,
                    textColor = myColor3,
                    backgroundColor = myColor3.copy(
                        TextFieldDefaults.BackgroundOpacity),
                    focusedIndicatorColor =myColor3,
                    unfocusedIndicatorColor = myColor3.copy(
                        TextFieldDefaults.UnfocusedIndicatorLineOpacity)
                ),
                shape = CutCornerShape(topStart = 15.dp , topEnd = 15.dp)
            )

            //Text4
            TextField(
                value = textstate5,
                onValueChange = { textstate5 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = "your Location")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.LocationOn,
                        contentDescription ="Email icon",
                       // tint = myColor5
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor5,
                    focusedLabelColor = myColor5,
                    cursorColor = myColor5,
                    textColor = myColor5,
                    leadingIconColor = myColor5,
                    backgroundColor = myColor5.copy(
                        TextFieldDefaults.BackgroundOpacity),
                    focusedIndicatorColor =Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                shape = CutCornerShape(15.dp)
            )

            //t5

            TextField(
                value = textstate6,
                onValueChange = { textstate6 = it },
                modifier = Modifier.padding(top = 20.dp),
                label = { Text(text = " your name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email,
                        contentDescription ="Email icon",
                        // tint = myColor5
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = myColor6,
                    focusedLabelColor = myColor6,
                    cursorColor = myColor6,
                    textColor = myColor6,
                    leadingIconColor = myColor6,
                    backgroundColor = myColor6.copy(
                        TextFieldDefaults.BackgroundOpacity),
                    focusedIndicatorColor =Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                shape = RoundedCornerShape(25.dp)
            )

        }

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextFiledColorTheme {
        Greeting()
    }
}