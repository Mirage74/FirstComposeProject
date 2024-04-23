package com.balex.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.balex.firstcomposeproject.ui.theme.InstagramProfileCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //TimesTable()
            InstagramProfileCard()
        }
    }
}

//@Preview
//@Composable
//fun CardTest() {
//    Card(
//        shape = RoundedCornerShape(
//            topStart = 4.dp,
//            topEnd = 4.dp
//        ),
//        border = BorderStroke(1.dp, Color.Black),
//        colors = CardDefaults.cardColors(
//            containerColor = Color.Green,
//            contentColor = Color.White
//        ),
//
//        ) {
//
//        InstagramProfileCard()
//
//    }
//
//
//}

