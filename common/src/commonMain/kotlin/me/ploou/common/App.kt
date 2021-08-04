package me.ploou.common
import androidx.compose.runtime.*
import org.jetbrains.compose.common.foundation.layout.Column
import org.jetbrains.compose.common.material.Button
import org.jetbrains.compose.common.material.Text

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    Column {
        Button(onClick = { text = "Hello, ${getPlatformName()}!!" }) { Text("Click me!") }
        Text(text)
    }
}

