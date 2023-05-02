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
import com.hms.explorehms.ui.theme.Body1
import com.hms.explorehms.ui.theme.Headline5
import com.hms.explorehms.ui.theme.Onboarding2Background

@Preview
@Composable
fun SecondOnboardingScreen(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Onboarding2Background
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(painter = painterResource(id = R.drawable.bg_onboarding2),
            contentDescription = null,
        modifier = Modifier.padding(16.dp))

        Text(
            text = stringResource(R.string.tab_header_onboarding2),
            style = Headline5,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(id = R.string.tab_information_onboarding2),
            style = Body1,
            modifier = Modifier.padding(16.dp)
        )

        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically) {

            Image(painter = painterResource(id = R.drawable.ic_click),
                contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f))
            
            Image(painter = painterResource(id = R.drawable.ic_swipe),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f))
        }

        Text(
            text = stringResource(id = R.string.swipe_click_info_onboarding2),
            style = Body1,
            modifier = Modifier.padding(16.dp)
        )
    }
}