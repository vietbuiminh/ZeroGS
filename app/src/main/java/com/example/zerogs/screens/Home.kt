package com.example.zerogs.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIconDefaults.Text
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.ui.theme.Blue300

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
    Text(
        text = "ZERO",
        fontSize = typography.h1.fontSize,
        fontWeight = typography.h1.fontWeight,
        color = Color.Black
    )
}
@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}