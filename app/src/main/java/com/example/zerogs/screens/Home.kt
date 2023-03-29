package com.example.zerogs.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.components.FilterButton
import com.example.zerogs.filterbutton.Rectangle1
import com.example.zerogs.filterbutton.TopLevel
import com.google.relay.compose.RowScopeInstance.rowWeight
import androidx.compose.material.Scaffold as MaterialScaffold

@Composable
fun HomeScreen() {
    TopAppBar(
        modifier = Modifier.height(70.dp),
        backgroundColor = Color.White,
        elevation = 0.dp
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
        ) {
            HeaderRow()
        }

    }

//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Blue300),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = "HOME",
//            fontSize = MaterialTheme.typography.h2.fontSize,
//            fontWeight = FontWeight.Bold,
//            color = Color.Black
//        )
//    }
}


@Composable
fun HeaderRow() {
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
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}