import kotlinx.browser.document
import kotlinx.browser.window
import me.ploou.common.App
import org.jetbrains.compose.common.material.Button
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import org.jetbrains.compose.web.ui.Styles

fun main() {
    window.onload = {
        renderComposable(document.body!!) {
            Style(Styles)
            App()
        }
    }
}