package org.oneui.example

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch
import org.oneui.compose.base.Icon
import org.oneui.compose.base.IconView
import org.oneui.compose.layout.drawer.DrawerItem
import org.oneui.compose.layout.drawer.DrawerLayout
import org.oneui.compose.layout.internal.rememberSlidingDrawerState
import org.oneui.example.nav.NavDestinations
import org.oneui.example.ui.NavScreen
import org.oneui.example.ui.ProgressIndicatorScreen
import org.oneui.example.ui.WidgetsScreen

@Composable
fun ExampleApp(
    modifier: Modifier = Modifier
) {
    var selectedDestination by remember {
        mutableStateOf(NavDestinations.Widgets)
    }
    val drawerState = rememberSlidingDrawerState()
    val scope = rememberCoroutineScope()

    DrawerLayout(
        modifier = modifier,
        state = drawerState,
        drawerContent = {
            NavDestinations.values().toList().forEach {
                DrawerItem(
                    icon = {
                        IconView(
                            icon = it.icon
                        )
                    },
                    label = it.title,
                    selected = it == selectedDestination,
                    onClick = {
                        scope.launch {
                            drawerState.closeAnimate()
                            selectedDestination = it
                        }
                    }
                )
            }
        },
        headerIcon = Icon.Resource(dev.oneuiproject.oneui.R.drawable.ic_oui_settings_outline),
    ) {
        when (selectedDestination) {
            NavDestinations.Widgets -> {
                WidgetsScreen(
                    modifier = Modifier
                        .fillMaxSize(),
                    onNavigateBack = {
                        scope.launch {
                            drawerState.openAnimate()
                        }
                    }
                )
            }

            NavDestinations.SeekBar -> {}
            NavDestinations.Preferences -> {
                PreferencesScreen(
                    modifier = Modifier
                        .fillMaxSize(),
                    onNavigateBack = {
                        scope.launch {
                            drawerState.openAnimate()
                        }
                    }
                )
            }

            NavDestinations.Navigation -> {
                NavScreen(
                    modifier = Modifier
                        .fillMaxSize(),
                    onNavigateBack = {
                        scope.launch {
                            drawerState.openAnimate()
                        }
                    }
                )
            }

            NavDestinations.ProgressIndicator -> {
                ProgressIndicatorScreen(
                    modifier = Modifier
                        .fillMaxSize(),
                    onNavigateBack = {
                        scope.launch {
                            drawerState.openAnimate()
                        }
                    }
                )
            }
        }
    }
}