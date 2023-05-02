package com.hms.explorehms.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)


val ColorPrimary = Color(0xFFff4d4d)
val ColorPrimaryDark = Color(0xFFff3838)
val ColorPrimaryLight = Color(0xFFffaf40)
val ColorSecondary = Color(0xFFd50000)
val ColorSecondaryDark= Color(0xFF9b0000)
val ColorSecondaryLight = Color(0xFFff5131)
val ColorAccent = Color(0xFFffffff)

val BackgroundGradient1 = Color(0xFFFEE3E3)
val BackgroundGradient2 = Color(0xFFC3C3C9)
val BackgroundGradient3 = Color(0xFFFFFFFF)

val Background = Brush.verticalGradient(
    colorStops = arrayOf(
        0.0f to BackgroundGradient1,
        0.7f to BackgroundGradient2,
        0.8f to BackgroundGradient3
    )
)

val Onboarding2Background = Brush.verticalGradient(
    colorStops = arrayOf(
        0.0f to BackgroundGradient1,
        0.6f to BackgroundGradient3
    )
)
