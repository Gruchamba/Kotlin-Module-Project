package menu.navigateMenuItem

import entities.Note
import menu.contentMenuItem.AddContentInNoteMenuItem
import menu.contentMenuItem.ReadNoteMenuItem

class NoteActionMenuItem(val note: Note): NavigateMenuItem() {

    override fun print() {
        println("\nМеню действий с заметкой:")

        menuMap["1. Просмотр"] = { ReadNoteMenuItem(note) }
        menuMap["2. Добавить текст"] ={ AddContentInNoteMenuItem(note) }

        menuMap.forEach { entry -> println(entry.key) }
    }

}