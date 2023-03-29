package com.example.zerogs.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.components.FilterButton
import com.example.zerogs.components.UserCard
import com.example.zerogs.filterbutton.Rectangle1
import com.example.zerogs.filterbutton.TopLevel
import com.google.relay.compose.RowScopeInstance.rowWeight
import java.time.DayOfWeek
import java.util.*
import androidx.compose.material.Scaffold as MaterialScaffold

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val date = Calendar.getInstance()
    val week = Calendar.DAY_OF_WEEK
    val day = Calendar.DAY_OF_MONTH
    val year = Calendar.YEAR
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
            ) {
                TopAppBar(
                    modifier = Modifier.height(70.dp),
                    backgroundColor = Color.White,
                    elevation = 0.dp
                ) {
                    Row(
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween

                    ) {
                        HeaderRow()
                    }
                }
                BodyContent(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 16.dp)
                        .fillMaxWidth()
                )

                Text(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 16.dp)
                        .fillMaxWidth(),
                    text = "Here is the latest updated on your local neighborhood for ${week} ${day}."
                )

            }

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
    UserCard(name = "Katie")
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}