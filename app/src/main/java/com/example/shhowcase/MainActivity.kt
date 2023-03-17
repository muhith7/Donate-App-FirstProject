package com.example.shhowcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shhowcase.screen.Home
import com.example.shhowcase.ui.theme.ShhowcaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShhowcaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home()

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        color = Color.Black,
    )
    Image(painter = painterResource(R.drawable.hutan),
        contentDescription = "Aqna error",

        modifier = Modifier
            .fillMaxSize()
            .clip(CircleShape)
            .size(50.dp)
            .background(color = Color.Green))
}

@Composable
fun SayMyName(name: String){
    Row() {
        Text(text = "hello $name!",)
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Benar!!!",
                color = Color.Green)
    }
    }
}
@Composable
fun incrementNumber(){
    var value by remember {
        mutableStateOf(0)
    }
    Column(modifier = Modifier) {
        Text(text = value.toString())
        Button(onClick = { value++ })
        {
            Text(text = "Add")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShhowcaseTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            
        }
        Column {
           incrementNumber()
        }

    }
}