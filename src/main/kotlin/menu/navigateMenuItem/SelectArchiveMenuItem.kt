package menu.navigateMenuItem

import menu.contentMenuItem.CreateArchiveMenuItem
import menu.ExitMenuItem
import repository.DataStorage

class SelectArchiveMenuItem : NavigateMenuItem() {

    override fun print() {
        println("\nМеню просмотра архивов:")

        var i = 0
        menuMap["${++i}. Создать архив"] = { CreateArchiveMenuItem() }
        DataStorage.archiveMap.forEach { s, notes -> menuMap["${++i}. $s"] = { SelectNoteMenuItem(s) }}
        menuMap["${++i}. Выход"] ={ ExitMenuItem() }

        menuMap.forEach { entry -> println(entry.key) }
    }
}