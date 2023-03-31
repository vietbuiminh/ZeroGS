package com.example.zerogs.components

import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zerogs.ui.theme.Grey90
import com.example.zerogs.ui.theme.bottomNavBarHeight
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubmitForm() {
    var title by rememberSaveable { mutableStateOf("") }
    var address by rememberSaveable { mutableStateOf("") }
    var description by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier
            .padding(30.dp)
            .background(Color.White)
    ) {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = title,
            onValueChange = { title = it },
            label = { Text("Title") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.DarkGray,
                textColor = Color.Black
            )
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = address,
            onValueChange = { address = it },
            label = { Text("Address") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.DarkGray,
                textColor = Color.Black
            )
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = description,
            onValueChange = { description = it },
            label = { Text("Description") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.DarkGray,
                textColor = Color.Black
            )
        )
        RequestContentPermission()
    }
}

@Composable
fun RequestContentPermission() {
    var imageUri by remember {
        mutableStateOf<Uri?>(null)
    }
    val context = LocalContext.current
    val bitmap =  remember {
        mutableStateOf<Bitmap?>(null)
    }

    val launcher = rememberLauncherForActivityResult(contract =
    ActivityResultContracts.GetContent()) { uri: Uri? ->
        imageUri = uri
    }
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedButton(
            modifier = Modifier.padding(
                vertical = 16.dp
            ),
            onClick = {
                launcher.launch("image/*")
            },
            colors = ButtonDefaults.buttonColors(
                Color.DarkGray
            ),
            elevation = ButtonDefaults.buttonElevation(10.dp)
        ) {
            Text(text = "Upload image", color = Color.White)
        }

        imageUri?.let {
            if (Build.VERSION.SDK_INT < 28) {
                bitmap.value = MediaStore.Images
                    .Media.getBitmap(context.contentResolver,it)

            } else {
                val source = ImageDecoder
                    .createSource(context.contentResolver,it)
                bitmap.value = ImageDecoder.decodeBitmap(source)
            }

            bitmap.value?.let {  btm ->
                Image(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(50))
                        .fillMaxWidth(),
                    bitmap = btm.asImageBitmap(),
                    contentDescription =null
                )
            }
        }

    }
}

@Composable
fun SubmitFloatingButton() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(bottom = bottomNavBarHeight)
            .height(70.dp)
            .width(70.dp),
        shape = RoundedCornerShape(100),
        containerColor = Color.Black
    ) {
        Icon(
            modifier = Modifier.size(30.dp),
            imageVector = Icons.Rounded.Add,
            contentDescription = "Add FAB",
            tint = Color.White,
        )
    }
}

@Preview
@Composable
fun SubmitFloatingButtonPreview() {
    SubmitFloatingButton()
}
@Preview
@Composable
fun SubmitFormPreview() {
    SubmitForm()
}