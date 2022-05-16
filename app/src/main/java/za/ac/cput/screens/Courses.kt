package za.ac.cput.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import za.ac.cput.Navigation
import za.ac.cput.R
import kotlin.system.exitProcess

@Composable
fun Courses(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Current Modules:",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp
            ),
            fontSize = 50.sp
        )

        Text(
            text = "Applications Development Practice 3 (Practical) - 1 year",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp
            ),
            fontSize = 20.sp
        )

        Text(
            text = "Applications Development Theory 3 (Theory) - 1 year",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp
            ),
            fontSize = 20.sp
        )

        Text(
            text = "Mobile Programming 2 (Practical) - 1 year",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp
            ),
            fontSize = 20.sp
        )

        Text(
            text = "Information Systems 3 (Theory) - 1 year",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp
            ),
            fontSize = 20.sp
        )

        Text(
            text = "Professional Practice 3 (Theory) - 1 year",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp
            ),
            fontSize = 20.sp
        )

        Text(
            text = "Project 3 (Practical) - 1 year",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp
            ),
            fontSize = 20.sp
        )

        Text(
            text = "Project Management 3 (Theory) - 1 year",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp
            ),
            fontSize = 20.sp
        )

        Text(
            text = "Project Presentation 3 (Practical) - 1 year",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp
            ),
            fontSize = 20.sp
        )

        Button(
            modifier = Modifier.padding(20.dp),
            shape = CircleShape,
            border = BorderStroke(2.dp, Color.Black),
            onClick = {
                navController.navigate(Navigation.Journey.route)
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.LightGray,
                contentColor = Color.Black
            )

        ) {
            Text(
                text = "Back",
                fontSize = 25.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_arrow_back_24),
                contentDescription = null,
                modifier = Modifier
                    .size(35.dp)
            )
        }

        btnGB()
    }
}

@Composable
fun btnGB()
{
    var dialogState by remember {
        mutableStateOf(false)
    }

    Button(
        modifier = Modifier.padding(20.dp),
        shape = CircleShape,
        border = BorderStroke(2.dp, Color.Black),
        onClick = {
            dialogState = true
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.LightGray,
            contentColor = Color.Black
        )
    )
    {
        Text(text = "Good Bye",
            fontSize = 25.sp,
            modifier = Modifier.padding(start = 10.dp)
        )
        Image(painter = painterResource(id = R.drawable.ic_baseline_cancel_24),
            contentDescription = null,
            modifier = Modifier
                .size(35.dp)
        )
    }

    GoodByeAlertDialog(dialogState) {
        dialogState = !it
    }
}


@Composable
fun GoodByeAlertDialog(
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
                    text = "Leaving Now?",
                    fontSize = 12.sp
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        exitProcess(0)
                    })
                {
                    Text("Yes",
                        fontSize = 16.sp)
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        onDismiss(dialogState)
                    })
                {
                    Text("No",
                        fontSize = 16.sp)
                }
            }
        )
    }
}