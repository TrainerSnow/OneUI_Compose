package org.oneui.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import org.oneui.compose.theme.OneUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneUITheme {
                ExampleApp(
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }
    }
}