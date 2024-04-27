package com.balex.firstcomposeproject.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.balex.firstcomposeproject.InstagramModel
import com.balex.firstcomposeproject.R


@Composable
fun InstagramProfileCard(
    model: InstagramModel,
    onFollowedButtonClickListener: (InstagramModel) -> Unit
) {


    Card(
        modifier = Modifier.padding(8.dp),
        backgroundColor = MaterialTheme.colors.background,
        shape = RoundedCornerShape(
            topStart = 4.dp,
            topEnd = 4.dp
        ),
        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground)
    ) {
        //Log.d("RECOMPOSITION", "Card")
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_instagram),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(8.dp),
                )
                UserStatistics(title = "Posts", value = "6,950")
                UserStatistics(title = "Followers", value = "436M")
                UserStatistics(title = "Following", value = "76")
            }
            Text(
                text = "Instagram ${model.id}",
                fontSize = 32.sp,
                fontFamily = FontFamily.Cursive
            )
            Text(
                text = "#${model.title}",
                fontSize = 14.sp
            )
            Text(
                text = "www.facebook.com/emotional_health",
                fontSize = 14.sp
            )
            FollowButton(isFollowed = model.isFollowed) {
                onFollowedButtonClickListener(model)
            }
        }
    }
}

@Composable
private fun FollowButton(
    isFollowed: Boolean,
    clickListener: () -> Unit
) {
    //Log.d("RECOMPOSITION", "FollowButton")
    Button(
        onClick = { clickListener() },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (isFollowed) {
                MaterialTheme.colors.primary.copy(alpha = 0.5f)
            } else {
                MaterialTheme.colors.primary
            }
        )
    ) {
        val text = if (isFollowed) {
            "Unfollow"
        } else {
            "Follow"
        }
        Text(text = text)
    }
}

@Composable
private fun UserStatistics(
    title: String,
    value: String
) {
    Column(
        modifier = Modifier.height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(
            text = value,
            fontSize = 24.sp,
            fontFamily = FontFamily.Cursive,
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
    }
}

