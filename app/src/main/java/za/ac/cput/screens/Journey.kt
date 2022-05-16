package za.ac.cput.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import za.ac.cput.Navigation
import za.ac.cput.R

@Composable
fun Journey(navController: NavHostController)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Matthew Jones",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp),
            fontSize = 60.sp
        )

        Text(
            text = "Applications Development",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp),
            fontSize = 30.sp
        )

        Text(
            text = "Informatics & Design",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp),
            fontSize = 30.sp
        )

        Text(
            text = "220077681",
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp),
            fontSize = 60.sp
        )

        Button(
            modifier = Modifier.padding(20.dp),
            shape = CircleShape,
            border = BorderStroke(2.dp, Color.Black),
            onClick = {
                navController.navigate(Navigation.Courses.route)
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.LightGray,
                contentColor = Color.Black
            )

            ) {
            Text(text = "Current Modules",
                fontSize = 25.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
            Image(painter = painterResource(id = R.drawable.ic_baseline_arrow_forward_24),
                contentDescription = null,
                modifier = Modifier
                    .size(35.dp))
        }

        Button(
            modifier = Modifier.padding(20.dp),
            shape = CircleShape,
            border = BorderStroke(2.dp, Color.Black),
            onClick = {
                navController.navigate(Navigation.Start.route)
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.LightGray,
                contentColor = Color.Black
            )

            ) {
            Text(text = "Back",
                fontSize = 25.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
            Image(painter = painterResource(id = R.drawable.ic_baseline_arrow_back_24),
                contentDescription = null,
                modifier = Modifier
                    .size(35.dp))
        }
    }
}