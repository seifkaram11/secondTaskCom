package com.example.secondtaskforcompose.ui.theme.screens.detailsOfItem.componets
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImagePainter.State.Empty.painter
import coil.fetch.SourceResult
import com.example.secondtaskforcompose.R
import com.example.secondtaskforcompose.ui.theme.Yellow
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.model.RepoDetails

@Composable
fun DetailPageCompound(
    value: RepoDetails
) {
    Column(
        Modifier.fillMaxSize().padding(top=60.dp)
    ) {
        Image(
            painter = painterResource(value.imageRes) ,
            contentDescription=""
            , modifier = Modifier.align(Alignment.CenterHorizontally).size(200.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text="Language",
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top=5.dp)
            , style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            Modifier.fillMaxWidth().height(50.dp)

        ){
            Spacer(modifier = Modifier.width(50.dp))
            Text(
                modifier = Modifier.padding(start = 30.dp,end=10.dp).align(Alignment.CenterVertically),
                text="${value.stars}"
                , style = MaterialTheme.typography.titleMedium
            )
            Image(
                painter = painterResource(R.drawable.baseline_star_24),
                contentDescription = null,
                modifier = Modifier.size(16.dp).align(Alignment.CenterVertically)
                ,
                colorFilter = ColorFilter.tint(Yellow)
            )
            Spacer(modifier = Modifier.width(30.dp))
            Text(
                modifier = Modifier.align(Alignment.CenterVertically),
                text= value.title
                , style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier.size(25.dp).align(Alignment.CenterVertically).shadow(
                    shape = MaterialTheme.shapes.large,
                    elevation = 5.dp
                )
                ,
                colorFilter = ColorFilter.tint(Color.Blue)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                modifier = Modifier.padding(start = 30.dp,end=10.dp).align(Alignment.CenterVertically),
                text="${value.id}"
                , style = MaterialTheme.typography.titleMedium
            )
            Image(
                painter = painterResource(R.drawable.ic_fork),
                contentDescription = null,
                modifier = Modifier.size(30.dp).align(Alignment.CenterVertically).size(100.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))

        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = value.description, maxLines = 3,
            overflow= TextOverflow.Ellipsis,
            modifier = Modifier.padding(start = 10.dp)
        )
        Spacer(modifier = Modifier.height(250.dp))
        Button(
            modifier = Modifier.fillMaxWidth().height(50.dp).padding(start = 40.dp, end = 40.dp),
            onClick = {

            }
        ){
            Text(
                text = "show Issues",color = Color.White,fontSize=30.sp,
                modifier = Modifier.shadow(
                    shape = com.example.secondtaskforcompose.ui.theme.shapes.small,//com/example/secondtaskforcompose/ui/theme/Shapes.kt
                    elevation = 0.dp
                )
            )
        }
    }
}
@Preview(showSystemUi = true, showBackground = false)
@Composable
fun out(){
    DetailPageCompound(
        RepoDetails(
            id = 1,
            title = "Kotlin",
            description = "A modern programming language for Android development.",
            imageRes = R.drawable.kotlin_logo,
            stars = 1000,
            ownerName = "Google"
        )
    )
}




















