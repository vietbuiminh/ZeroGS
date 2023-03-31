package com.example.zerogs.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.components.FilterButton
import com.example.zerogs.ui.theme.bottomNavBarHeight
import com.google.android.gms.maps.GoogleMapOptions
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MapsScreen() {
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
        containerColor = Color.White,
        content = {paddingValues ->
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = paddingValues.calculateTopPadding(),
                    bottom = bottomNavBarHeight - 5.dp
                )
            ) {
                val augustana = LatLng(41.502591, -90.549753)
                val cameraPositionState = rememberCameraPositionState {
                    position = CameraPosition.fromLatLngZoom(augustana, 15f)
                }

                GoogleMap(
                    modifier = Modifier.fillMaxSize(),
                    cameraPositionState = cameraPositionState
                ) {
                    Marker(
                        state = MarkerState(position = augustana),
                        title = "Augustana College",
                        snippet = "Marker in Augustana College"
                    )
                }
//                var uiSettings by remember { mutableStateOf(MapUiSettings()) }
//                var properties by remember {
//                    mutableStateOf(MapProperties(mapType = MapType.SATELLITE))
//                }
//
//                Box(Modifier.fillMaxSize()) {
//                    GoogleMap(
//                        modifier = Modifier.matchParentSize(),
//                        properties = properties,
//                        uiSettings = uiSettings
//                    )
//                    Switch(
//                        checked = uiSettings.zoomControlsEnabled,
//                        onCheckedChange = {
//                            uiSettings = uiSettings.copy(zoomControlsEnabled = it)
//                        }
//                    )
//                }
            }
        }
    )
}
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Green100),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = "MAPS",
//            fontSize = MaterialTheme.typography.h2.fontSize,
//            fontWeight = FontWeight.Bold,
//            color = Color.Black
//        )
//    }


@Composable
private fun HeaderRow() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Maps",
            fontSize = MaterialTheme.typography.h2.fontSize,
            fontWeight = MaterialTheme.typography.h2.fontWeight,
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
fun MapsScreenPreview() {
    MapsScreen()
}