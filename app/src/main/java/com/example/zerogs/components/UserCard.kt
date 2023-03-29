package com.example.zerogs.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.R

@Composable
fun UserCard(name: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
       Image(
           painter = painterResource(id = R.drawable.component_1_vector),
           contentDescription = "Placeholder image",
           contentScale = ContentScale.Crop,
           modifier = Modifier
               .size(33.dp)
               .clip(CircleShape)
       )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = "Howdy, $name !",
                fontFamily = typography.body2.fontFamily,
                fontWeight = typography.body2.fontWeight,
                fontSize = typography.body2.fontSize
            )
        }
    }
}

@Preview
@Composable
fun UserCardPreview() {
    UserCard(name = "Kate")
}