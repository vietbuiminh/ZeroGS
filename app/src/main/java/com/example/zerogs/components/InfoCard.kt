package com.example.zerogs.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.R
import com.example.zerogs.ui.theme.Blue300
import androidx.compose.material3.Card as Card

@Composable
fun InfoCard(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    image: Painter,
    userCard: () -> Unit = {},
    address: String,
    title: String,
    weekTime: String,
    mapLink: String
    ) {
    Column {
        Row {
            Icon(
                painter = painterResource(R.drawable.info_div_vector),
                contentDescription = "maps icon"
            )
            Text(text = "Rock Island")
        }

        Card(
            modifier = modifier,
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = backgroundColor)
        ) {
            Row(
                modifier = Modifier
                    .height(200.dp)
                    .padding(16.dp),
            ){
                Text(text = "This is a card view",
                    style = typography.h2)
            }
        }
    }
}

@Preview
@Composable
fun InfoCardPreview() {
    InfoCard(
        backgroundColor = Blue300,
        image = painterResource(R.drawable.info_div_rectangle_3),
        address = "123 Street St, Rock Island",
        weekTime = "Monday: 12:00PM - 3:00PM\n" +
                "Tuesday: 1:00PM - 10:00PM",
        title = "Free Canned Food for Pickup",
        mapLink = ""
    )
}