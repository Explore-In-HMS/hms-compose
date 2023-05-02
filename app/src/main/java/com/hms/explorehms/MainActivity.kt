package com.hms.explorehms

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hms.explorehms.ui.onboarding.*
import com.hms.explorehms.ui.theme.ColorPrimary
import com.hms.explorehms.ui.theme.ExploreHmsComposeTheme
import com.hms.explorehmscompose.R


class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExploreHmsComposeTheme {
                MainNavHost(onboardingScreenList = onboardingScreenList())
            }
        }
    }
}

@Composable
fun onboardingScreenList() = listOf<Unit>(
    FirstOnboardingScreen(),
    SecondOnboardingScreen(),
    ThirdOnboardingScreen(),
    FourthOnboardingScreen(),
    FifthOnboardingScreen(),
    SixthOnboardingScreen()
)

@Composable
fun MainNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String = MainNavHostDestinations.ONBOARDING,
    onboardingScreenList: List<Unit> = onboardingScreenList()
) {

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(MainNavHostDestinations.SPLASH) {
            SplashScreen {
                navController.navigate(MainNavHostDestinations.ONBOARDING)
            }
        }
        composable(MainNavHostDestinations.ONBOARDING) {
            OnboardingScreen (
                {navController.navigate(MainNavHostDestinations.MAIN)},
                onboardingScreenList
            )
        }
    }
}

@Composable
fun SplashScreen(
    onSplashCompleted: () -> Unit
) {


}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(
    buttonOnClick: () -> Unit,
    screenList: List<Unit>
) {
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center) {
        val pagerState = rememberPagerState()

        HorizontalPager(
            pageCount = screenList.size,
            state = pagerState,
            modifier = Modifier.fillMaxSize(0.8f)
        ) { page ->
            screenList[page]
        }
        Row(
            Modifier
                .height(50.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(screenList.size) { iteration ->
                val color =
                    if (pagerState.currentPage == iteration) ColorPrimary else Color.LightGray
                Box(
                    modifier = Modifier
                        .padding(2.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(20.dp)

                )
            }
        }
    }

}

@Composable
fun MainScreen() {
    val list = listOf<Feature>(
        Feature("Map Kit Feature", "abc"),
        Feature("Location Kit Feature", "abc"),
        Feature("Site Kit Feature", "abc"),
        Feature("Clouddb Feature", "abc")
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .background(colorResource(id = R.color.purple_700)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(textAlign = TextAlign.Center, text = "Explore-HMS-Compose")
            }
        },
        content = {
            LazyVerticalGrid(columns = GridCells.Fixed(2),
                modifier = Modifier.padding(it),
                content = {
                    items(list.size) { index ->
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .padding(5.dp)
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = list[index].title
                            )
                        }
                    }
                })
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExploreHmsComposeTheme {
        OnboardingScreen(buttonOnClick = {}, onboardingScreenList())
    }
}