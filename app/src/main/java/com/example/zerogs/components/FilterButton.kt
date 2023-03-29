package com.example.zerogs.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.material.ButtonDefaults.MinHeight
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.infodiv.quicksand
import com.example.zerogs.ui.theme.Grey90
import com.example.zerogs.ui.theme.QuickSand

@Composable
fun FilterButton(
    modifier: Modifier = Modifier,
    tapToChange: () -> Unit = {},
    displayText: String
) {
    ElevatedButton(onClick = {
        //your onclick code here

        },
        modifier = Modifier.defaultMinSize(minHeight = 20.dp),
        colors = ButtonDefaults.buttonColors(
             Color.White
        ),
        elevation = ButtonDefaults.buttonElevation(3.dp),
        border = BorderStroke(1.dp, Grey90),
        contentPadding = PaddingValues(
            start = 40.dp,
            top = 5.dp,
            bottom = 6.dp,
            end = 40.dp
        )

    ) {
        Text(
            text = displayText,
            color = Color.Black,
            fontFamily = typography.caption.fontFamily,
            fontWeight = typography.caption.fontWeight

        )
    }
}

@Composable
@Preview
fun FilterButtonPreview() {
    FilterButton(displayText = "filter")
}