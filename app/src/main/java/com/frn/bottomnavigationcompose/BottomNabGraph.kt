package com.frn.bottomnavigationcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.frn.bottomnavigationcompose.screens.HomeScreen
import com.frn.bottomnavigationcompose.screens.ProfileScreen
import com.frn.bottomnavigationcompose.screens.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {

        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }

        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen()
        }

        composable(route = BottomBarScreen.Settings.route){
            SettingsScreen()
        }

    }

}