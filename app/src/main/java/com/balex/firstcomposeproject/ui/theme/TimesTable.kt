package com.balex.firstcomposeproject.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun TimesTable() {
    Column(
        modifier = Modifier
            //.fillMaxSize()
            //.padding(all = 16.dp)
            .background(color = Color.Yellow),
    ) {
        for (i in 1 until 10) {
            Row(
                modifier = Modifier
                    //.fillMaxWidth()
                    .weight(1f)
            ) {
                for (j in 1 until 10) {
                    val color = if ((i + j) % 2 == 0) {
                        Color.Yellow
                    } else {
                        Color.White
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .border(width = 1.dp, color = Color.DarkGray)
                            .background(color = color),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "${i * j}")
                    }

                }
            }
        }
    }
}