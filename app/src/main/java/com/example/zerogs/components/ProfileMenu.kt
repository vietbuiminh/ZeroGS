package com.example.zerogs.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.R
import com.example.zerogs.ui.theme.Grey90
import androidx.compose.material.icons.Icons as MaterialIconsIcons

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileMenu(
    modifier: Modifier
    ) {
    Column (
        modifier = Modifier
            .padding(32.dp)
            .background(Color.White)
    )
    {
        Surface(
            onClick = { /*TODO*/ },
            color = Color.White
        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(30.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Icon(
                        MaterialIconsIcons.Outlined.AccountCircle,
                        "contentDescription",
                        modifier = Modifier.size(30.dp)
                    )
                    Text(
                        text = "Public Profile",
                        style = typography.h3
                    )
                }
                Divider(Modifier.padding(top = 10.dp), color = Grey90, thickness = 1.dp)
            }
        }
        Surface(
            onClick = { /*TODO*/ },
            color = Color.White
        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(30.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.map),
                        "contentDescription",
                        modifier = Modifier.size(30.dp)
                    )
                    Text(
                        text = "Guide",
                        style = typography.h3
                    )
                }
                Divider(Modifier.padding(top = 10.dp), color = Grey90, thickness = 1.dp)
            }
        }
        Surface(
            onClick = { /*TODO*/ },
            color = Color.White
        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(30.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        "contentDescription",
                        modifier = Modifier.size(30.dp)
                    )
                    Text(
                        text = "Rating",
                        style = typography.h3
                    )
                }
                Divider(Modifier.padding(top = 10.dp), color = Grey90, thickness = 1.dp)
            }
        }
        Surface(
            onClick = { /*TODO*/ },
            color = Color.White
        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(30.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.build),
                        "contentDescription",
                        modifier = Modifier.size(30.dp)
                    )
                    Text(
                        text = "Setting",
                        style = typography.h3
                    )
                }
                Divider(Modifier.padding(top = 10.dp), color = Grey90, thickness = 1.dp)
            }
        }
        Surface(
            onClick = { /*TODO*/ },
            color = Color.White
        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(30.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.info),
                        "contentDescription",
                        modifier = Modifier.size(30.dp)
                    )
                    Text(
                        text = "Information",
                        style = typography.h3
                    )
                }
                Divider(Modifier.padding(top = 10.dp), color = Grey90, thickness = 1.dp)
            }
        }
    }
}

@Preview
@Composable
fun ProfileMenuPreview() {
    ProfileMenu(modifier = Modifier)
}
