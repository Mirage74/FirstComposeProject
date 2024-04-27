package com.balex.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.ViewModelProvider
import com.balex.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import com.balex.firstcomposeproject.ui.theme.InstagramProfileCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setContent {
            Test(viewModel = viewModel)
        }
    }
}

    @Composable
    private fun Test(viewModel: MainViewModel) {
        FirstComposeProjectTheme {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
            ) {
                LazyColumn {
                    item {
                        Text(text = "Title", color = Color.Black)
                    }
                    items(10) {
                        InstagramProfileCard(viewModel)
                    }
                    item {
                        Image(painter = painterResource(id = R.drawable.ic_instagram), contentDescription = null)
                    }
                    items(50000) {
                        //Log.d("it", it.toString())
                        InstagramProfileCard(viewModel)
                    }
                }
            }
        }

}

