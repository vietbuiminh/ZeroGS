package com.example.zerogs.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
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
import com.example.zerogs.components.FilterButton
import com.example.zerogs.components.SubmitFloatingButton
import com.example.zerogs.components.SubmitForm
import com.example.zerogs.components.UserCard
import com.example.zerogs.ui.theme.Purple500
import com.example.zerogs.ui.theme.bottomNavBarHeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonateScreen() {
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
        floatingActionButton = {
            SubmitFloatingButton()
        },
        containerColor = Color.White,
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = paddingValues.calculateTopPadding(),
                        bottom = bottomNavBarHeight - 5.dp,
                        start = 16.dp,
                        end = 16.dp
                    )
            ) {
                BodyContent(
                    modifier = Modifier
                        .padding(vertical = 7.dp)
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
            text = "Donate",
            fontSize = MaterialTheme.typography.h2.fontSize,
            fontWeight = MaterialTheme.typography.h2.fontWeight,
            color = Color.Black
        )
    }
}

@Composable
private fun BodyContent(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())

    ) {
        UserCard(
            modifier = modifier,
            name = "Katie"
        )
        Text(
            modifier = modifier,
            text = "Your donation matters, everyone in need will find your donation a life savior. If you have any spare/used clothes and non perishable food, please submit them to your local community."
        )
        SubmitForm()
    }
}
@Composable
@Preview
fun DonateScreenPreview() {
    DonateScreen()
}