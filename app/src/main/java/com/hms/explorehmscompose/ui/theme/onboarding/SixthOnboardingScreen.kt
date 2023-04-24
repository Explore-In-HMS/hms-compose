package com.hms.explorehmscompose.ui.theme.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hms.explorehmscompose.R
import com.hms.explorehmscompose.ui.theme.*

@Preview
@Composable
fun SixthOnboardingScreen(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Onboarding2Background
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(painter = painterResource(id = R.drawable.bg_onboarding5),
            contentDescription = null,
            modifier = Modifier.padding(16.dp))

        Text(
            text = stringResource(R.string.modules_information_onboarding5),
            style = Headline5,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(id = R.string.modules_info_onboarding5),
            style = Body1,
            modifier = Modifier.padding(16.dp)
        )
        
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = R.drawable.ic_reference_onboarding),
                contentDescription = null,
            modifier = Modifier
                .weight(0.09f)
                .aspectRatio(1f),
            contentScale = ContentScale.FillBounds)

            Text(
                text = stringResource(R.string.info_message_onboarding6),
                style = Body1,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.8f)
            )
        }

        Button(modifier = Modifier.padding(16.dp).fillMaxWidth(),
            onClick = { /*TODO: add shared prefs and save onboarding showed*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = ColorPrimary,
            contentColor = Color.White)) {
            Text(fontFamily = DinPro, fontWeight = FontWeight.Light,
                text = stringResource(id = R.string.button_text_onboarding5))
        }
    }

}