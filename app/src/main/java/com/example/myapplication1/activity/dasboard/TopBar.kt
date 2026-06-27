package com.example.myapplication1.activity.dasboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication1.R

@Composable
@Preview(device = "id:pixel_9")
fun TopBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier =
            Modifier
                .minimumInteractiveComponentSize()
                .padding(top = 48.dp)
                .padding(horizontal = 16.dp),
        // .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.profile),
            contentDescription = null,
            modifier = Modifier
                .size(55.dp)
                .clickable {},
        )

        var text by rememberSaveable { mutableStateOf("") }

        TextField(
            value = text,
            onValueChange = { text = it },
            label = {
                Text(
                    text = "What would you like to eat?",
                    fontSize = 13.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    maxLines = 1,
                )
            },
            trailingIcon = {
                Image(
                    painter = painterResource(R.drawable.search),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp),
                )
            },
            shape = RoundedCornerShape(25.dp),
            colors =
                OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = colorResource(R.color.white),
                    unfocusedContainerColor = colorResource(R.color.white),
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    unfocusedLabelColor = Color.Transparent,
                    focusedTextColor = Color.DarkGray,
                    unfocusedTextColor = Color.DarkGray,
                ),
            modifier =
                Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp)
                    .height(45.dp)
                    .background(colorResource(R.color.grey), CircleShape),
        )

        Image(
            painter = painterResource(R.drawable.bell_icon),
            contentDescription = null,
            modifier = Modifier
                .size(55.dp)
                .clickable {},
        )
    }
}