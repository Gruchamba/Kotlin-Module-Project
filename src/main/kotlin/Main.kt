import menu.MenuItem
import menu.navigateMenuItem.SelectArchiveMenuItem

fun main() {
    println("Запуск приложения")

    var menuItem: MenuItem? = SelectArchiveMenuItem()

    while (true) {
        menuItem?.print()
        menuItem = menuItem?.commandProcessing()

    }
}