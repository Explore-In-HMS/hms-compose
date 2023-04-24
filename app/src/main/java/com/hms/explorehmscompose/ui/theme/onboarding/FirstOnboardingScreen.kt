package com.hms.explorehmscompose.ui.theme.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hms.explorehmscompose.R
import com.hms.explorehmscompose.ui.theme.*

@Preview
@Composable
fun FirstOnboardingScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Background
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Explore HMS",
            style = Headline4,
            modifier = Modifier.padding(16.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "App logo",
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Information",
            style = Headline5,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Explore HMS application provides information about all HMS Core" +
                    " kits and services. HMS Core Kits and services can be examined and " +
                    "experienced with using this application. Explore HMS application is " +
                    "open source project. Kits and services codes are separated in " +
                    "packages to be easily analyzed. Usage and implementation of kits " +
                    "and services can be found in source code.",
            style = Body1,
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(90.dp))
    }

}