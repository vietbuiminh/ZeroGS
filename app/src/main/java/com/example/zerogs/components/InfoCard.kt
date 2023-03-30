package com.example.zerogs.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.R
import com.example.zerogs.ui.theme.Blue300
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.material3.Card as Card

@OptIn(ExperimentalMaterial3Api::class)
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
    Column (
        modifier = modifier
    ) {
        Row(
            Modifier.padding(bottom = 5.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.info_div_vector),
                contentDescription = "maps icon"
            )
            Text(
                text = "Rock Island",
                fontFamily = typography.subtitle1.fontFamily,
                fontSize = typography.subtitle1.fontSize
            )
        }
        Card(
            onClick = {
                //your onclick code here

            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = backgroundColor)
        ) {
            Row(
                modifier = Modifier
                    .height(200.dp)
            ){
                Image(
                    modifier = Modifier.fillMaxWidth(0.3f),
                    painter = painterResource(id = R.drawable.info_div_rectangle_3),
                    contentDescription = "Placeholder image",
                    contentScale = ContentScale.Crop,
                    colorFilter = ColorFilter.colorMatrix(ColorMatrix()
                        .apply{
                            setToScale(0.8f,0.8f,0.8f,1f)
                        })
                )
                Column (
                    modifier = Modifier.padding(14.dp)
                ) {
                    val paddingBottom = Modifier.padding(bottom = 3.dp)
                    Text(
                        modifier = paddingBottom,
                        text = title,
                        style = typography.h4
                    )
                    Text(
                        modifier = paddingBottom,
                        text = address,
                        style = typography.subtitle2
                    )
                    Text (
                        modifier = paddingBottom,
                        text = weekTime,
                        style = typography.body1
                    )
                    Text (
                        modifier = paddingBottom.padding(vertical = 16.dp),
                        text = "Details ->",
                        style = TextStyle(textDecoration = TextDecoration.Underline)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        ExtendedFloatingActionButton(
                            modifier = Modifier.padding(end = 10.dp),
                            onClick = { /* ... */ },
                            icon = {
                                Icon(
                                    Icons.Outlined.Favorite,
                                    contentDescription = "Favorite"
                                )
                            },
                            text = { Text("Save") },
                            containerColor = Color.White,
                            elevation = FloatingActionButtonDefaults.elevation(1.dp)
                        )
                        ExtendedFloatingActionButton(

                            onClick = { /* ... */ },
                            icon = {
                                Icon(
                                    Icons.Outlined.Search,
                                    contentDescription = "Search"
                                )
                            },
                            text = { Text("Maps") },
                            containerColor = Color.White,
                            elevation = FloatingActionButtonDefaults.elevation(1.dp)
                        )
                    }
                }
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