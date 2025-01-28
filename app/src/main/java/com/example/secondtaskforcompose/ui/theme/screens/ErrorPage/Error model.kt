@file:Suppress("UNREACHABLE_CODE")

package com.example.secondtaskforcompose.ui.theme.screens.ErrorPage

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.secondtaskforcompose.R


/**/
@Composable
fun ErrorModel(){
    val context = LocalContext.current // Get context
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(end=40.dp, bottom = 70.dp)
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            Modifier.padding(40.dp,top=200.dp).fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.error_image),
                contentDescription = null,

                modifier = Modifier
                    .size(340.dp).align(Alignment.CenterHorizontally).padding(20.dp)
                ,contentScale = ContentScale.Crop
                //,clip(CircleShape)      .clip(shape = CircleShape)          .clip(shape =RoundedCornerShape(--.dp))
            )
            Text(
                text = "Something went wrong",
                modifier = Modifier.padding(top = 5.dp, bottom = 10.dp, start = 50.dp, end = 20.dp)
                    .align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onSurface,
            )
            Text(
                text = "Something went wrong",
                modifier = Modifier.padding(
                    top = 10.dp,
                    bottom = 5.dp,
                    start = 50.dp,
                    end = 10.dp
                ).align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onSurface,
            )
            Button(
                modifier = Modifier
                    .fillMaxWidth() // Optional: Make it full width
                    .height(48.dp), // Adjust height as needed
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent, // Transparent background
                    contentColor = Color.Green // Green text color
                ),
                shape = MaterialTheme.shapes.small,
                border = BorderStroke(2.dp, Color.Green) // Green outline
                , onClick = {
                    Toast.makeText(context, "This is a Button", Toast.LENGTH_SHORT).show()
                }
            ) {
                Text(text = "RETRY", color = Color.Green)
            }
        }
    }
}
@Preview(
    showSystemUi = true
)
@Composable
fun out() {
    ErrorModel()
}