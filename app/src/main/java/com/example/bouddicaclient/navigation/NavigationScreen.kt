package com.example.bouddicaclient.navigation

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Timeline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
//import com.example.bouddicaclient.R

sealed class Screen(
  val route: String,
  @StringRes val title: Int = 0,
  val navIcon: (@Composable () -> Unit) = {
    Icon(
      Icons.Filled.Home, contentDescription = "home"
    )
  },
  val objectName: String = "",
  val objectPath: String = ""
) {
//  object Login : Screen("login_screen")
data object Home : Screen("home_screen")
//  object Popular : Screen("popular_screen")
//  object TopRated : Screen("top_rated_screen")
//  object Upcoming : Screen("upcoming_screen")
//  object NavigationDrawer :
//    Screen("navigation_drawer", objectName = "genreId", objectPath = "/{genreId}")
//
//  object MovieDetail :
//    Screen("movie_detail_screen", objectName = "movieItem", objectPath = "/{movieItem}")
//
//  object ArtistDetail :
//    Screen("artist_detail_screen", objectName = "artistId", objectPath = "/{artistId}")
//
//  // Bottom Navigation
//  object HomeNav : Screen("home_screen", title = R.string.home, navIcon = {
//    Icon(
//      Icons.Filled.Home,
//      contentDescription = "search",
//      modifier = Modifier
//        .padding(end = 16.dp)
//        .offset(x = 10.dp)
//    )
//  })
}