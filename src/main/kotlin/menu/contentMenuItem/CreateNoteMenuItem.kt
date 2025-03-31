package menu.contentMenuItem

import entities.Note
import menu.MenuItem
import menu.navigateMenuItem.SelectNoteMenuItem
import repository.DataStorage

class CreateNoteMenuItem(val archiveName: String): ContentMenuItem() {

    override fun print() {
        println("Меню создания заметки")
    }

    override fun commandProcessing(): MenuItem {
        print("Введите заголовок для заметки: ")
        val noteName = getInputString()
        print("Введите текст заметки: ")
        val noteContent = getInputString()
        DataStorage.archiveMap[archiveName]?.add(Note(archiveName,noteName, noteContent))
        return SelectNoteMenuItem(archiveName)
    }
}