@file:OptIn(ExperimentalMaterialApi::class)

package com.example.zerogs.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.R
import com.example.zerogs.components.FilterButton
import com.example.zerogs.components.InfoCard
import com.example.zerogs.ui.theme.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.util.*
import androidx.compose.material.Button as MaterialButton
import androidx.compose.material.ExtendedFloatingActionButton as ExtendedFloatingActionButton1
import com.example.zerogs.components.UserCard as UserCard

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun HomeScreen() {
    val coroutineScope = rememberCoroutineScope()
    val modalSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
        confirmStateChange = {it != ModalBottomSheetValue.Expanded}
    )

    ModalBottomSheetLayout (
        sheetShape = RoundedCornerShape(30.dp),
        sheetState = modalSheetState,
        sheetContent = {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.3f),
                    painter = painterResource(id = R.drawable.info_div_rectangle_3),
                    contentDescription = "img",
                    contentScale = ContentScale.Crop,
                )
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(bottom = bottomNavBarHeight - 5.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Text(
                            modifier = paddingBottom,
                            text = "Free Canned Food for Pickup",
                            style = typography.h3
                        )
                        Text(
                            modifier = paddingBottom,
                            text = "@ajenjoak",
                            style = typography.h4,
                            color = Color.Gray
                        )
                        Text(
                            modifier = paddingBottom,
                            text = "123 Street St, Rock Island, IL",
                            style = typography.body2
                        )
                        Text(
                            modifier = Modifier.padding(
                                vertical = 16.dp
                            ),
                            text = "Monday: 12:00PM - 3:00PM\n" +
                                    "Tuesday: 1:00PM - 10:00PM",
                            style = typography.body2
                        )
                        Text(
                            modifier = paddingBottom.padding(vertical = 16.dp),
                            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Viverra sem pellentesque sagittis, massa hendrerit. Phasellus elit pellentesque pretium, nunc, egestas mi",
                            style = typography.body1
                        )
                    }
                    Column (
                        modifier = Modifier
                            .padding(20.dp)
                            .height(200.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        var isSaved by remember { mutableStateOf(false) }
                        ExtendedFloatingActionButton(
                            modifier = Modifier
                                .padding(end = 10.dp)
                                .fillMaxWidth(),
                            onClick = { isSaved = !isSaved },
                            icon = {
                                Icon(
                                    if (isSaved) {
                                        painterResource(id = R.drawable.pantoolfilled)
                                    } else {
                                        painterResource(id = R.drawable.pantool)
                                    },
                                    contentDescription = "Favorite",
                                    tint = Color.DarkGray
                                )
                            },
                            text = {
                                androidx.compose.material3.Text(
                                    if (isSaved) "Requested" else {
                                        "Request"
                                    }
                                )
                            },
                            containerColor = Blue300,
                            contentColor = Color.DarkGray,
                            elevation = FloatingActionButtonDefaults.elevation(0.dp)
                        )
                        ExtendedFloatingActionButton(
                            modifier = Modifier
                                .padding(end = 10.dp),
                            onClick = {
                                coroutineScope.launch { modalSheetState.hide() }
                            },
                            icon = {
                                Icon(
                                    Icons.Rounded.ArrowBack,
                                    contentDescription = "Favorite",
                                    tint = Color.DarkGray
                                )
                            },
                            text = {
                                Text(text="Back",
                                    style = typography.h4
                                )
                            },
                            containerColor = Grey10,
                            contentColor = Color.DarkGray,
                            elevation = FloatingActionButtonDefaults.elevation(0.dp)
                        )
                    }
                }
            }
        }
    ) {
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
                        start = 16.dp,
                        end = 16.dp,
                        bottom = bottomNavBarHeight - 5.dp
                    )
                ) {
                    BodyContent(
                        modifier = Modifier
                            .padding(vertical = 7.dp)
                            .fillMaxWidth(),
                        modalSheetState = modalSheetState,
                        coroutineScope = coroutineScope
                    )
                }
            }
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
private fun BodyContent(
    modifier: Modifier,
    coroutineScope: CoroutineScope,
    modalSheetState: ModalBottomSheetState
) {
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
            text="Here is the latest updated on your local neighborhood for Friday March 24."
        )
        InfoCard(
            modalSheetState = modalSheetState,
            coroutineScope = coroutineScope,
            modifier = modifier,
            backgroundColor = Blue300,
            image = painterResource(R.drawable.info_div_rectangle_3),
            address = "123 Street St, Rock Island",
            weekTime = "Monday: 12:00PM - 3:00PM\n" +
                    "Tuesday: 1:00PM - 10:00PM",
            title = "Free Canned Food for Pickup",
            mapLink = ""
        )
        InfoCard(
            modalSheetState = modalSheetState,
            coroutineScope = coroutineScope,
            modifier = modifier,
            backgroundColor = Blue300,
            image = painterResource(R.drawable.info_div_rectangle_3),
            address = "123 Street St, Rock Island",
            weekTime = "Monday: 12:00PM - 3:00PM\n" +
                    "Tuesday: 1:00PM - 10:00PM",
            title = "Free Canned Food for Pickup",
            mapLink = ""
        )
        InfoCard(
            modalSheetState = modalSheetState,
            coroutineScope = coroutineScope,
            modifier = modifier,
            backgroundColor = Blue300,
            image = painterResource(R.drawable.info_div_rectangle_3),
            address = "123 Street St, Rock Island",
            weekTime = "Monday: 12:00PM - 3:00PM\n" +
                    "Tuesday: 1:00PM - 10:00PM",
            title = "Free Canned Food for Pickup",
            mapLink = ""
        )
        InfoCard(
            modalSheetState = modalSheetState,
            coroutineScope = coroutineScope,
            modifier = modifier,
            backgroundColor = Blue300,
            image = painterResource(R.drawable.info_div_rectangle_3),
            address = "123 Street St, Rock Island",
            weekTime = "Monday: 12:00PM - 3:00PM\n" +
                    "Tuesday: 1:00PM - 10:00PM",
            title = "Free Canned Food for Pickup",
            mapLink = ""
        )
        InfoCard(
            modalSheetState = modalSheetState,
            coroutineScope = coroutineScope,
            modifier = modifier,
            backgroundColor = Blue300,
            image = painterResource(R.drawable.info_div_rectangle_3),
            address = "123 Street St, Rock Island",
            weekTime = "Monday: 12:00PM - 3:00PM\n" +
                    "Tuesday: 1:00PM - 10:00PM",
            title = "Free Canned Food for Pickup",
            mapLink = ""
        )

    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}