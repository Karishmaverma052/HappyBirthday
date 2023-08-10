package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Greeting(" Happy Birthday Karishma !!", from = "I'm So Hppppy")
                }
            }
        }
    }
}

@Composable
fun Greeting( message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )


        GreetingText(
            message = massage, from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
    Column(verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp)
    ){
    Text(
        text = " Happy Birthday Karishma !",
        fontSize = 80.sp,
        lineHeight = 63.sp,
        )
    Text(text = "I'm So Hppppy",
        fontSize = 36.sp,
        modifier= Modifier
            .padding(16.dp)
            .align(alignment = Alignment.CenterHorizontally)
        )

       }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        Greeting(message = " Happy Birthday Karishma !!", from = "I'm So Hppppy")


    }
}