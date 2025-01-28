package com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondtaskforcompose.R
import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.modelDetails.ModelDetails
import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.preview.FakeGithubDetailsUiModels

@Composable
fun RepoDetails(
    modifier: Modifier = Modifier,
    modeldetails: ModelDetails
) {
    Row(
        modifier = Modifier
           .padding(4.dp)
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = MaterialTheme.shapes.medium
            )
            .clickable {  }
    ) {
        Image(
            painter = painterResource(R.drawable.baseline_album_24),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .padding(end = 8.dp, start = 8.dp)
                .size(40.dp)
            //,clip(CircleShape)      .clip(shape = CircleShape)          .clip(shape =RoundedCornerShape(--.dp))
        )
        Column {
            Row (
                modifier = Modifier.padding(5.dp)
            ){
                Text(
//                    text = "Bump pyarrow from 7 ...",
                    text = modeldetails.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.weight(1f)
                )
                Text(
//                    text = "open",
                    text = modeldetails.status,
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(end = 10.dp)
                )
            }
            Text(
//                text = "NONE",
                text = modeldetails.vale,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium,
                modifier=Modifier.padding(10.dp)
            )
            Text(
//                text = "Created At: 2023-07-12, 12:00PM",
                text = modeldetails.description,
                fontSize = 14.sp,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface,
                modifier=Modifier.padding(bottom = 5.dp)
            )
        }
    }
}
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF) // White background
@Composable
fun PreviewRepoItem2() {
    RepoDetails(
        modeldetails =FakeGithubDetailsUiModels
    )
}