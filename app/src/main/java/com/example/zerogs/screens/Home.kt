package com.example.zerogs.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.R
import com.example.zerogs.components.FilterButton
import com.example.zerogs.components.UserCard
import com.example.zerogs.infodiv.InfoDiv
import com.example.zerogs.ui.theme.Blue300
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.RelayContainer
import java.util.*

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val date = Calendar.getInstance()
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxSize(),
                backgroundColor = Color.White,
                elevation = 0.dp
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    HeaderRow()
                }
            }
        },
        content = {paddingValues ->
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = paddingValues.calculateTopPadding()
                )
            ) {
                BodyContent(
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 5.dp)
                        .fillMaxWidth()
                )
            }
        }
    )
}


@Composable
private fun HeaderRow() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "ZERO",
            fontSize = typography.h1.fontSize,
            fontWeight = typography.h1.fontWeight,
            color = Color.Black
        )
    }
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        FilterButton(
            displayText = "local"
        )
    }
}

@Composable
private fun BodyContent(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        UserCard(
            modifier = modifier,
            name = "Katie"
        )
        Text(
            modifier = modifier,
            text="Here is the latest updated on your local neighborhood for Friday March 24."
        )
        MaterialTheme {
            RelayContainer {
                InfoDiv(
                    backgroundColor = Blue300,
                    donationImg = painterResource(R.drawable.info_div_rectangle_3),
                    nearbyLocation = "Rock Island",
                    userAccLink = {},
                    addressCard = "123 Drive, Rock Island",
                    weekTime = "Monday: 12:00PM - 3:00PM\nTuesday: 1:00PM - 10:00PM",
                    linkCard = "Details ->",
                    titleCard = "Free Canned Food for Pickup",
                    mapLink = {},
                    modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                )
            }
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}