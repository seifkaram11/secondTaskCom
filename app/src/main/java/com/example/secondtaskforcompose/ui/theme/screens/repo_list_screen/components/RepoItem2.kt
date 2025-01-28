package com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.components

//import android.graphics.ColorFilter
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondtaskforcompose.R
import com.example.secondtaskforcompose.ui.theme.SecondTaskForComposeTheme
import com.example.secondtaskforcompose.ui.theme.Yellow
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.model.RepoDetails
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.preview.fakeRepoList

@Composable
fun RepoItem2(
    modifier: Modifier=Modifier,
//    githubRepoUiModel: RepoItemUiModel,
    repo:RepoDetails,
    onRepoClick: () -> Unit
) {
    Row(
        Modifier.fillMaxWidth()
            .padding(horizontal = 4.dp)
            .padding(top = 10.dp)
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = MaterialTheme.shapes.medium
            )
            .clickable {
                onRepoClick()
            }
    ){
        Image(
            modifier =
            Modifier.size(50.dp)
                .padding(top=8.dp, start = 8.dp)
                .clip(shape = CircleShape),
            painter = painterResource(id = repo.imageRes),
            contentDescription = null
        )
        Column(
            Modifier.padding(start = 16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = repo.title, // Use the title from the RepoDetails object
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = repo.stars.toString(),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(8.dp))
                Image(
                    painter = painterResource(R.drawable.baseline_star_24),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Yellow),
                    modifier = Modifier.size(16.dp)
                )
            }
            Spacer(Modifier.height(8.dp))
            Text(
                text = repo.ownerName,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = repo.description,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodySmall,
                maxLines = 2,
                overflow= TextOverflow.Ellipsis
            )
        }
    }
}
@Preview()
@Composable
fun PreviewRepoItem2() {
    SecondTaskForComposeTheme {
        RepoItem2(
            repo= fakeRepoList[0],
            onRepoClick={}
        )
    }
}























/*package com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.components

//import android.graphics.ColorFilter
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme


import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.secondtaskforcompose.R
import com.example.secondtaskforcompose.ui.theme.SecondTaskForComposeTheme
import com.example.secondtaskforcompose.ui.theme.Yellow
import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.modelDetails.ModelDetails
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.model.RepoItemUiModel
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.preview.FakeGithubRepoUiModels

@Composable
fun RepoItem2(
    modifier: Modifier=Modifier,
    githubRepoUiModel: RepoItemUiModel,
    onRepoClick: () -> Unit
) {
        Row(
            Modifier.fillMaxWidth()
                .padding(horizontal = 4.dp)
                .padding(top = 10.dp)
                .background(
                    color = MaterialTheme.colorScheme.surface,
                    shape = MaterialTheme.shapes.medium
                )
                .clickable {
                    onRepoClick()
                }
        ){
              Image(
                  modifier =
                  Modifier.size(50.dp)
                  .padding(top=8.dp, start = 8.dp)
                  .clip(shape = CircleShape),
                  painter = painterResource(R.drawable.ic_launcher_background),
                  contentDescription = null
              )
            Column(
                Modifier.padding(start = 16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier.weight(1f),
                        text = githubRepoUiModel.name,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = githubRepoUiModel.stars.toString(),
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Image(
                        painter = painterResource(R.drawable.baseline_star_24),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Yellow),
                        modifier = Modifier.size(16.dp)
                    )
                }
                Spacer(Modifier.height(8.dp))
                Text(
                    text = githubRepoUiModel.ownerName,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    text = githubRepoUiModel.description,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 2,
                    overflow= TextOverflow.Ellipsis
                )
            }
        }
}
@Preview()
@Composable
fun PreviewRepoItem2() {
    SecondTaskForComposeTheme {
        RepoItem2(
            githubRepoUiModel = FakeGithubRepoUiModels,
            onRepoClick={}
        )
    }
}*/