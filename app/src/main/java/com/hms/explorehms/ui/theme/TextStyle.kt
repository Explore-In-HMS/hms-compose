package com.hms.explorehms.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.hms.explorehms.R

/*val DinPro = FontFamily(
    Font(R.font.din_pro)
)*/

val DinPro = FontFamily(
    Font(R.font.din_pro, FontWeight.Normal),
    Font(R.font.din_pro_black, FontWeight.Black),
    Font(R.font.din_pro_bold, FontWeight.Bold),
    Font(R.font.din_pro_cond, FontWeight.Thin),
    /*Font(R.font.din_pro_cond_black, FontWeight.W300),*/
    Font(R.font.din_pro_cond_bold, FontWeight.ExtraBold),
    Font(R.font.din_pro_light, FontWeight.Light),
    Font(R.font.din_pro_medium, FontWeight.Medium)
)

val Headline4 = TextStyle(
    fontFamily = DinPro,
    color = Color.Black,
    fontSize = 34.sp,
    fontWeight = FontWeight.Normal
)

val Headline5 = TextStyle(
    fontFamily = DinPro,
    color = Color.Black,
    fontSize =24.sp,
    fontWeight = FontWeight.Normal
)

val Body1 = TextStyle(
    fontFamily = DinPro,
    color = Color.Black,
    fontSize = 16.sp,
    fontWeight = FontWeight.Light
)
