package za.ac.cput.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import za.ac.cput.Navigation
import za.ac.cput.R

@Composable
fun Start(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to My Jetpack Compose Journey",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp),
            fontSize = 60.sp
        )

        btnIcon()

        Button(
            modifier = Modifier.padding(20.dp),
            shape = CircleShape,
            onClick = {
                navController.navigate(Navigation.Journey.route)
            }) {
            Text(text = "Journey",
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 10.dp)
            )
            Image(painter = painterResource(id = R.drawable.ic_baseline_arrow_forward_24),
                contentDescription = null,
                modifier = Modifier
                    .size(35.dp))
        }
    }
}

@Composable
fun btnIcon()
{
    var dialogState by remember {
        mutableStateOf(false)
    }

    Button(
        modifier = Modifier.padding(20.dp),
        shape = CircleShape,
        onClick = {
            dialogState = true
        }
    )
    {
        Text(text = "Info",
            fontSize = 25.sp,
            modifier = Modifier.padding(start = 10.dp)
        )
        Image(painter = painterResource(id = R.drawable.ic_baseline_ac_unit_24),
            contentDescription = null,
            modifier = Modifier
                .size(35.dp)
        )
    }

    JourneyAlertDialog(dialogState) {
        dialogState = !it
    }
}


@Composable
fun JourneyAlertDialog(
    dialogState: Boolean,
    onDismiss: (dialogState: Boolean) -> Unit
)
{
    if (dialogState)
    {
        AlertDialog(
            onDismissRequest = {
                onDismiss(dialogState)
            },
            title = {

            },
            text = {
                Text(
                    text = "Mobile devices are a part of our everyday lives, whether it's scrolling through Social Media or Ordering goods online. Learning Kotlin and Jetpack Compose has given me a deeper understanding of the structure of a mobile application. Mobile Programming is the future!",
                    fontSize = 12.sp
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        onDismiss(dialogState)
                    })
                {
                    Text("OK",
                        fontSize = 16.sp)
                }
            }
        )
    }
}

