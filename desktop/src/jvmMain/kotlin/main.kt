import androidx.compose.ui.window.Window
import me.ploou.common.App
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = {
        exitApplication()
    }) {
        App()
    }
}