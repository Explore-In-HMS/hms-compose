package com.hms.explorehmscompose.ui.theme.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hms.explorehmscompose.R
import com.hms.explorehmscompose.ui.theme.Body1
import com.hms.explorehmscompose.ui.theme.Headline5
import com.hms.explorehmscompose.ui.theme.Onboarding2Background

@Preview
@Composable
fun FifthOnboardingScreen(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Onboarding2Background
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(painter = painterResource(id = R.drawable.bg_onboarding6_withoutdelete),
            contentDescription = null,
            modifier = Modifier.padding(16.dp))

        Text(
            text = stringResource(R.string.header_onboarding5),
            style = Headline5,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(id = R.string.install_withoutuninstall_info_onboarding6),
            style = Body1,
            modifier = Modifier.padding(16.dp)
        )
    }

}