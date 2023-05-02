package com.hms.explorehms.ui.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hms.explorehms.ui.theme.*

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
            text = stringResource(id = R.string.app_name_onboarding1),
            style = Headline4,
            modifier = Modifier.padding(16.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.app_logo),
            contentDescription = "App logo",
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(id = R.string.information_text_onboarding1),
            style = Headline5,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(id = R.string.app_information_onboarding1),
            style = Body1,
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(90.dp))
    }

}