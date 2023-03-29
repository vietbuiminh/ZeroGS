package com.example.zerogs.screens

import android.provider.ContactsContract.Profile
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
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
import com.example.zerogs.components.FilterButton
import com.example.zerogs.ui.theme.Purple700

@Composable
fun ProfileScreen() {
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
}
@Composable
private fun HeaderRow() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Profile",
            fontSize = MaterialTheme.typography.h2.fontSize,
            fontWeight = MaterialTheme.typography.h2.fontWeight,
            color = Color.Black
        )
    }

}

@Composable
@Preview
fun ProfileScreenPreview() {
    ProfileScreen()
}