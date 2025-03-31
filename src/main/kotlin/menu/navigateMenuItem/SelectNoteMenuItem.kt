package menu.navigateMenuItem

import menu.contentMenuItem.CreateNoteMenuItem
import repository.DataStorage

class SelectNoteMenuItem(val archiveName: String): NavigateMenuItem() {

    override fun print() {
        println("\nМеню просмотра заметок:")

        var i = 0
        menuMap["${++i}. Создать заметку"] = { CreateNoteMenuItem(archiveName) }
        DataStorage.getMapForList(archiveName)?.forEach { s, note -> menuMap["${++i}. $s"] = { NoteActionMenuItem(note) }}
        menuMap["${++i}. Назад"] = { SelectArchiveMenuItem() }

        menuMap.forEach { entry -> println(entry.key) }
    }
}