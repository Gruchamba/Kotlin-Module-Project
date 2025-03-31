package menu.contentMenuItem

import entities.Note
import menu.MenuItem
import menu.navigateMenuItem.SelectNoteMenuItem

class ReadNoteMenuItem(val note: Note): ContentMenuItem() {

    override fun print() {
        println("Заметка ${note.name}")
        println(note.content)
    }

    override fun commandProcessing(): MenuItem {
        print("Введите любой символ для выхода в предыдущие меню: ")
        scanner.nextLine()
        return SelectNoteMenuItem(note.archiveName)
    }
}